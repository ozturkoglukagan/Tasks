
import java.util.*;

class Task1{

    static double midtermGrade1;
    static double midtermGrade2;
    static double finalGrade;
    static Scanner scanNum= new Scanner(System.in);
    static Scanner scanTxt= new Scanner(System.in);
	


    public static void main(String[] args) {
        entrance();



    }
    //this method simply asks the user if they want to proceed or stop the program

    public static void reTrigger(){
        System.out.println("Do you want to calculate again? (Press Y/N)");
        String answer=scanTxt.nextLine();
        if(answer.equalsIgnoreCase("Y")){
            entrance();
        }else{
            System.out.println("Thanks for using my program (ﾉ◕ヮ◕)ﾉ ");
            scanNum.close();
            scanTxt.close();
        }
    }

    //this method stands to make our main method clearer. And to communicate with our user

    public static void entrance(){
        System.out.println("~~~~~~~~~~~~~~~~~> Welcome to my Letter Grade Finder Program <~~~~~~~~~~~~~~~~~\n");

        System.out.println("               Created by ozturkoglukagan(github)   02/23/21\n");

        System.out.println("-------------------------------------------------------------------------------\n");

        double avg = numberBender();

        System.out.println("First Midterm Grade  : " + midtermGrade1);
        System.out.println("Second Midterm Grade : " + midtermGrade2);
        System.out.println("Final Grade          : " + finalGrade);
        System.out.println("------------------------------");
        System.out.println("Average              : " + avg);
        System.out.println("Letter Grade         : " + avgLetter(avg));
        reTrigger();

    }
    //this method stands for taking the exam scores from the user and take an average of them.

    public static double numberBender() {
      try{
        System.out.println("Please enter your Midterm 1 Score: ");
        midtermGrade1=scanNum.nextDouble();

        if(midtermGrade1>100 || midtermGrade1 <0) {
            System.out.println("Please enter your grade between 0 and 100.");
            numberBender();
        }else {
            System.out.println("Please enter your Midterm 2 Score: ");
            midtermGrade2=scanNum.nextDouble();

            if(midtermGrade2>100 || midtermGrade2 <0) {
                System.out.println("Please enter your grade between 0 and 100.");
                numberBender();
            }else {
                System.out.println("Please enter your Final Score: ");
                finalGrade=scanNum.nextDouble();

                if(finalGrade>100 || finalGrade <0) {
                    System.out.println("Please enter your grade between 0 and 100.");
                    numberBender();
                }}}
            }catch (Exception e){
                System.out.println("An Error occured please try again.");
                
                entrance();


            }

        return ((midtermGrade1+midtermGrade2+finalGrade)/3);

    }
    // to assign a letter grade for the average

    public static String avgLetter(Double avg) {
        if(avg>=90) {
            return "A";
        }else if(avg>=80) {
            return "B";
        }else if(avg>=70) {
            return "C";
        }else if(avg>=60) {
            return "D";
        }
        return "F";

    }
}
