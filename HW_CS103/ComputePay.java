package HW_CS103;

public class ComputePay {
    /* 
    static int workHour=4 + 5 + 8 + 4;
    static double wage=8.75;
    static double pay=wage*workHour;
    static double tax=pay*0.20; */
    public static void main(String[] args){
            int workHour=4 + 5 + 8 + 4;
            double wage=8.75;
            double pay=wage*workHour;
            double tax=pay*0.20;

            //Calculate pay at work based on hours worked each day
            System.out.println("My total hours worked:\n"+workHour);

            System.out.println("My hourly salary:\n$"+wage);

            System.out.println("My total pay:\n" + pay);
 
            System.out.println("My taxes owed:\n" + tax); //20% tax of the earning
            

    }


}
