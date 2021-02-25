

import java.util.Scanner;


public class Task2 {
    static Scanner scanTxt=new Scanner(System.in);
    static Scanner scanNum=new Scanner(System.in);
    static String nnames[] = new String[2];
    //to take nicknames from user
    public static void nickName(){
        System.out.println("Please enter Player 1 Nickname: ");
        nnames[0]= scanTxt.nextLine();

        System.out.println("Please enter Player 2 Nickname: ");
        nnames[1]= scanTxt.nextLine();

    }
    public static void main(String[] args) {
        overLay();

    }
    public static String gameCode(){
        System.out.println("Please use numbers for your selection:\n \n1-Rock \n2-Paper \n3-Scissors\n ");
        String winner=nnames[0];
        /*int input1=5;
        int input2=5;*/
        int[] input=new int[2];
        //New Version
        try {
            for (int i=0;i<2;i++){
                System.out.println(nnames[i] + " Please enter the number of your choosing: ");
                input[i]=scanNum.nextInt();
                if(input[i]<=0){
                    System.out.println("Please enter 1,2 or 3 as number.");
                    gameCode();
                }
                if(input[i]>3){
                    System.out.println("Please enter 1,2 or 3 as number.");
                    gameCode();
                }
            }



            //Old version
            /* System.out.println(nnames[0] + " Please enter the number of your choosing: ");
           input1=scanNum.nextInt();
            if(input1<=0||input2<=0){
                System.out.println("Please enter 1,2 or 3 as number.");
                gameCode();
            }
            if(input1>3||input2>3){
                System.out.println("Please enter 1,2 or 3 as number.");
                gameCode();
            }
           System.out.println(nnames[1] + " Please enter the number of your choosing: ");
           input2=scanNum.nextInt();
           if(input1<=0||input2<=0){
               System.out.println("Please enter 1,2 or 3 as number.");
               gameCode();
           }
           if(input1>3||input2>3){
               System.out.println("Please enter 1,2 or 3 as number.");
               gameCode();
           }*/

        }catch (Exception e) {
           System.out.println("Please enter 1,2 or 3 as number.\n-----------------------");
        }   //to choose the winner by the users input
            if(input[0]==input[1]){
                System.out.println("----- Tie !! -----");
                gameCode();
            }else
           if(input[0]==1&&input[1]==3){
               return winner;
           }else if(input[0]==2&&input[1]==1){
               return winner;
           }else if(input[0]==3&&input[1]==2){
               return winner;
           }
            winner=nnames[1];

       return winner;
    }
    //this method stands to keep our main method clear
    public static void overLay(){
        System.out.println("~~~~~~~~~~~~~~~~~~~> Welcome to my Rock Paper Scissors Game <~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("               Created by Github: ozturkoglukagan   02/23/21\n");

        System.out.println("--------------------------------------------------------------------------------\n");
        nickName();
        chooseWinner();
        
    }
    //to run the game and choose an winner
    public static void chooseWinner(){
        String won=gameCode();
        System.out.println("---------------------------------|| WINNER ||-----------------------------------\n");
        System.out.println("                            "+won+" is the winner!!\n");
        reTrigger();

    }

    //simple retrigger mechanism if the users want to play again
    public static void reTrigger(){
        System.out.println("Do you want to play again? (Press Y/N)");
        String answer=scanTxt.nextLine();
        //eliminating human error
        if(answer.equalsIgnoreCase("Y")){
            gameCode();
            chooseWinner();
        }else{
            System.out.println("Thanks for using my program (ﾉ◕ヮ◕)ﾉ ");
            scanNum.close();
            scanTxt.close();
        }
    }
}


