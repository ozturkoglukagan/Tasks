import java.util.Scanner;

public class Task3{

    static int id=0;
    static String name="";
    static String surname = "";
    static int birthyear = 0000;
    static double tckn = 0;
    static double balance = 0.0;
    static double debt=0.0;
    //creating multiple Scanners to minimize interfere between Scanners
    static Scanner scanTxt=new Scanner(System.in);
    static Scanner scanInt=new Scanner(System.in);
    static Scanner scanDoub=new Scanner(System.in);
    static Customer myCustomer = new Customer(id, name, surname, birthyear, tckn, balance,debt);
    
    public static void main(String[] args) throws InterruptedException {
        coderInfo();
        Thread.sleep(1000);
        mainMenu(myCustomer);
       

    }
    
    /*      to do list
     *register done
     *credit done
     *showbalance done
     *showinfo done
     *different islem yapmak iste rmisiniz done
     *withdraw&add funds done
     -scanning infos to the txt and reading them
     *asking customers if they have an account done
     *ask create new acc done
     *fix show customerinfo tckn done      */
     
     
     
     
     
     //coders information
        public static void coderInfo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~>   Bank Simulator   <~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("               Created by Github: ozturkoglukagan   02/25/21\n");

        System.out.println("----------------------------------------------------------------------------\n");

    }
    
    //to interact with our user and direct them into the program
    public static void mainMenu(Customer cus) throws InterruptedException {
        int tempNumber=0;
        try {
            
       
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|| Main Menu ||~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"\nWhat operation you would like to proceed with?(Enter a number)"  
                            + "\n1.Create New Account\n2.Withdraw Money\n3.Add Funds\n4.Use Credit\n5.Pay Debt\n6.Show Information\n7.Quit"
                            +"\n----------------------------------------------------------------------------");
        tempNumber=scanInt.nextInt();
        Thread.sleep(1000);
        switch (tempNumber) {                                                                                                                   
            case 1:
                getCustomerInfo(cus);
              break;
            case 2:
            checkExistence(cus.id,cus);
            withdrawBalance(cus);
              break;
            case 3:
            checkExistence(cus.id,cus);
            addtoBalance(cus);
              break;
            case 4:
            checkExistence(cus.id,cus);
            useCredit(cus);
             break;
            case 5:
            checkExistence(cus.id, cus);
            payDebt(cus);
            break;
            case 6:
            checkExistence(cus.id,cus);
            showCustomerInfo(cus);

             break;
            case 7:
            newOperation(cus);
            break;
            
          }
        // old code switched with new code


          /*if (tempNumber==1) {
            getCustomerInfo(cus);
            
        } else if(tempNumber==2){
            checkExistence(cus.id,cus);
            withdrawBalance(cus);

        }else if(tempNumber==3){
            checkExistence(cus.id,cus);
            addtoBalance(cus);

        }else if(tempNumber==4){
            checkExistence(cus.id,cus);
            useCredit(cus);

        }else if(tempNumber==5){
            newTransaction(cus);

        }else {
            System.out.println("Number couldn't recognized. Please try again.");
            mainMenu(cus);
        }*/
    } catch (Exception e) {
        System.out.println("An error occured. Please try again.");
        Thread.sleep(1000);
        mainMenu(cus);
    }
        // ask emin what the conditionals was.
        //switch case
        


    }

    //to show customer info to the user
    public static void showCustomerInfo(Customer cus){
        System.out.println("\n--------------|| Customer "+ cus.id +" ||--------------");
        System.out.println("Name            : "+cus.name);
        System.out.println("Surname         : "+cus.surname);
        System.out.println("Birth Year      : "+cus.birthyear);
        System.out.printf( "TCKN            : %.0f\n",cus.tckn);
        System.out.println("Balance         : "+cus.balance);
        System.out.printf ("Debt            : %.2f\n",cus.debt);
        
    }

    //to check if there is any accout exist or not
    public static void checkExistence(int id,Customer cus) throws InterruptedException {
        if(id==0){
            System.out.println("Account could not found. You need an account to proceed.");
            getCustomerInfo(cus);
        }
        
    }   




     // to get info from our user and create a new customer
     public static void getCustomerInfo(Customer cus) throws InterruptedException {
        try{
        System.out.println("\nPlease enter your Name: ");
        cus.name=scanTxt.nextLine();

        System.out.println("\nPlease enter your Surname: ");
        cus.surname=scanTxt.nextLine();
        
        System.out.println("\nPlease enter your Birth Year: ");
        cus.birthyear=scanInt.nextInt();
        
        //retrying mechanism in case of errors happen
        while(cus.birthyear<1870||cus.birthyear>2003){
            System.out.println("\nYou can't be younger than 18 or older than 150 of age. (Regarding to our Policy)\nPlease enter your Birth year again.\n");
            cus.birthyear=scanInt.nextInt();
        }

        System.out.println("\nPlease enter your TCKN: ");
        cus.tckn=scanDoub.nextDouble();
        
        //retrying mechanism in case of errors happen
        while(cus.tckn < 10000000000.0 || cus.tckn > 99999999999.0) {
            System.out.println("\nYour TCKN should contain 11 characters.\nPlease enter your TCKN again.\n");
            cus.tckn=scanDoub.nextDouble();
        }
        cus.id= (int) (cus.tckn % 100000);
        showCustomerInfo(cus);
        
        System.out.println("\nCustomer creation successfull.\nReturning to the main menu.\n");
        Thread.sleep(1000);
        mainMenu(cus);
    } catch (Exception e) {
        System.out.println("An error occured. Please try again.");
        Thread.sleep(1000);
        
        getCustomerInfo(cus);
    }
        
    }
    
    



    // to control users balance and direct into using credit
    public static void withdrawBalance(Customer cus) throws InterruptedException {
        String answer;
       try{
        System.out.println("\nPlease enter the amount you would like to withdraw from your account: ");
        Double tempNumber= scanDoub.nextDouble();
        cus.balance-=tempNumber;
        Thread.sleep(1000);
        if(cus.balance<0.0){
            cus.balance+=tempNumber;
            System.out.println("Operation can't proceed. You don't have enough credit."
            +"\nWould you like to borrow credit? (Type - Y/N)");
            answer=scanTxt.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                useCredit(cus);
            } else {
                System.out.println("Returning you back to the main menu...");
                Thread.sleep(1000);
                mainMenu(cus);

        }}
        Thread.sleep(1000);
        showCustomerInfo(cus);
        Thread.sleep(1000);
        System.out.println("\nProccess successfull. Returning you back to the main menu...");
        Thread.sleep(1000);
        mainMenu(cus);
    } catch (Exception e) {
        System.out.println("An error occured. Please try again.");
        Thread.sleep(1000);
        
        withdrawBalance(cus);
    }
    }
   
   
   
    //to control users balance 
    public static void addtoBalance(Customer cus) throws InterruptedException {
        try{
        System.out.println("Please enter the amount you would like to add to your account: ");
        Double tempNumber = scanDoub.nextDouble();
        cus.balance += tempNumber;
        Thread.sleep(1000);
        showCustomerInfo(cus);
        Thread.sleep(1000);
        System.out.println("\nProccess successfull. Returning you back to the main menu...\n");
        Thread.sleep(1000);
        mainMenu(cus);
    } catch (Exception e) {
        System.out.println("An error occured. Please try again.");
        Thread.sleep(1000);
        
        addtoBalance(cus);
    }
    }




    
    
    // to use credit if their balance is lower than the amount they wish to witdraw
    public static void useCredit(Customer cus) throws InterruptedException {
        String answer = "N";
        try{
        System.out.println("\nPlease enter the amount you would like to use: (Max:999,999.00) ");
        double tempCredit = scanDoub.nextDouble();
        Thread.sleep(1000);
        //determining interest rates and months
        System.out.println(
                "\nHow many months you want to pay your credit back?(Enter a Number)\n(Monthly interest percentages are in the parantheses)");

        System.out.println("\n1.Three Months (2.2%)\n2.Six Months (1.9%)\n3.One Year (1.4%)\n4.Custom(Enter Time Period(Months))\n(2.5% <12 Months and 1.4% for >12 Months))");

        int intMonth = scanInt.nextInt();
        Thread.sleep(1000);
        if (intMonth == 1) {
            intMonth=3;
            double tempInterest = 2.2;
            answerControlCredit(answer, cus, tempCredit, intMonth, tempInterest);
        } else if (intMonth == 2) {
            intMonth=6;
            double tempInterest = 1.9;
            answerControlCredit(answer, cus, tempCredit, intMonth, tempInterest);
        } else if (intMonth == 3) {
            intMonth=12;
            double tempInterest = 1.4;
            answerControlCredit(answer, cus, tempCredit, intMonth, tempInterest);
        } else if (intMonth >4||intMonth<12) {
            double tempInterest = 2.5;
            answerControlCredit(answer, cus, tempCredit, intMonth, tempInterest);
        } else if (intMonth >12) {
            double tempInterest = 1.4;
            answerControlCredit(answer, cus, tempCredit, intMonth, tempInterest);
        } else {
            System.out.println("\nInterest Month couldn't detected.\nWould you like to try again?(Type - Y/N)");
            answer = scanTxt.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                useCredit(cus);
            } else {
                System.out.println("Returning you back to the main menu...");
                mainMenu(cus);

            }
        }

    } catch (Exception e) {
        System.out.println("An error occured. Please try again.");
        Thread.sleep(1000);
        useCredit(cus);
    }
    }

    
    //to control the answer sequence in useCredit Method
    public static void answerControlCredit(String answer,Customer cus,double tempCredit,int intMonth,double tempInterest) throws InterruptedException {
        System.out.printf("\nYour backpayment period will be " + intMonth
                    + " months and your total backpayment will be: %.2f\n",tempCredit * (1 + intMonth * tempInterest / 100));
        System.out.println("Type - Y to proceed or any key to discard.");
        try{
        answer = scanTxt.nextLine();
       
        if (answer.equalsIgnoreCase("Y")) {
            //controlling balance
            cus.balance+=tempCredit;
            cus.debt-=tempCredit * (1+intMonth * tempInterest / 100);
            Thread.sleep(1000);
            
            showCustomerInfo(cus);
            System.out.println("\nProccess successfull. Returning you back to the main menu...");
        }else {
            System.out.println("Returning you back to the main menu...");
            mainMenu(cus);
        }
    } catch (Exception e) {
        System.out.println("An error occured. Please try again.");
        Thread.sleep(1000);
        answerControlCredit(answer, cus, tempCredit, intMonth, tempInterest);
    }
   
    }
   
   
    
    
    
    
    


    public static void payDebt(Customer cus) throws InterruptedException {
        
        try{
         System.out.println("\nPlease enter the amount you would like to transfer from your balance to your debt: ");
         Double tempNumber= scanDoub.nextDouble();
         cus.balance-=tempNumber;
         Thread.sleep(1000);
         if(cus.balance<0.0){
             cus.balance+=tempNumber;
             System.out.println("Operation can't proceed. You don't have enough balance."
             +"\nReturning you back to the main menu...");
           mainMenu(cus);
         }
         cus.debt+=tempNumber;
         Thread.sleep(1000);
         showCustomerInfo(cus);
         Thread.sleep(1000);
         System.out.println("\nProccess successfull. Returning you back to the main menu...\n");
         Thread.sleep(1000);
         mainMenu(cus);
     } catch (Exception e) {
         System.out.println("An error occured. Please try again.");
         Thread.sleep(1000);
         
         payDebt(cus);
     }
     }
         
 
 
 
 
 //to ask to the user if they want to do any more operations
 public static void newOperation(Customer cus) throws InterruptedException {
     String answer;
     try {
         
     
     System.out.println("\nWould you like to do another operation?(Type - Y/N)");
     answer = scanTxt.nextLine();
         if (answer.equalsIgnoreCase("Y")) {
             System.out.println("Returning you back to the main menu...");
             Thread.sleep(1000);
             mainMenu(cus);
         } else {
             System.out.println("\n~~~~~~~~~~~~~~~~~~~~|| Thanks for using my Program!!! ||~~~~~~~~~~~~~~~~~~~~\n");
             Thread.sleep(1000);
             coderInfo();
             scanDoub.close();
             scanInt.close();
             scanTxt.close();
            //System.exit(0);
         
         }
     } catch (Exception e) {
         System.out.println("An error occured. Please try again.");
         newOperation(cus);
     }

 }

 
 
 
 
 

 
 
 
 
 
 
    
}