package HW_CS103;

public class HW_01{


    public static void main(String[] args){
       question2();
       question3();
    }

    public static void question2(){
        int i = 2;
        int j = 3;
        int k = 4;
    
        int x = i + j + k;
        
        i = x - i - j;
        //System.out.println("This is i: "+i+"\nThis is j: "+j+"\nThis is k: "+k+"\nThis is x: "+x);
        j = x - j - k;
        //System.out.println("\nThis is i: "+i+"\nThis is j: "+j+"\nThis is k: "+k+"\nThis is x: "+x);
        k = x - i - k;

        System.out.println("\nThis is i: "+i+"\nThis is j: "+j+"\nThis is k: "+k);
        // i=4 , j=2 , k=1
    }

    public static void question3(){
        System.out.println("2 + 2" + 3 + 4);
        System.out.println("hello 34 " + 2 * 4);
        System.out.println(2 + "(int) 2.0" + 2 * 2 + 2);
        System.out.println(4 + 1 + 9 + "." + (-3 + 10) + 11 / 3);
        System.out.println(8 + 6 * - 2 + 4 + "0" + (2 + 5));
        System.out.println(1 + 1 + "8 – 2" + (8 - 2) + 1 + 1);
        System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3);
        System.out.println("1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9));
        System.out.println(53 / 5 / (0.6 + 1.4) / 2 + 13 / 2);
        System.out.println(89 % 10 / 4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2);
        


    }


}