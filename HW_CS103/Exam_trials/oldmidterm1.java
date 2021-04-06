package HW_CS103.Exam_trials;

public class oldmidterm1 {
    public static void main (String[] args){
        for(int row=0;row<4;row++){
            for(int stars=0;stars<row;stars++){
                System.out.print("*");
            }
        
            for(int plus=0;plus<7-2*row;plus++){
                System.out.print("+");
            }
            
            for(int stars=0;stars<row;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        Harmonic();
        sumOfDigits();
        chocolates();
        loops();
    }
    public static void Harmonic(){
        int x=14, y=23,z=8;
        double h=(x*y*z*1.0)/(y*z+x*z+x*y*1.0);
        System.out.println("Harmonic mean is equal to "+h);
    }  
    public static int number=3126;      
    public static void sumOfDigits(){
       int digits1000s=(number-number%1000)/1000;
       int digits100s=(number%1000-number%100)/100;
       int digits10s=(number%100-number%10)/10;
       int digits1s=number%10;
       System.out.println(digits1000s+","+digits100s+","+digits10s+","+digits1s);
       int sum=digits1000s+digits100s+digits10s+digits1s;
       System.out.println("Sum of digits: "+ sum);
    }
    public static void chocolates(){
        int weight=65;
        int height=172;
        int age=23;
        double choCal=230;
        double BMR=655.1+9.6*weight+1.85*height-4.7*age;
        double division=BMR/choCal;
        System.out.println("The woman can eat "+ division +" chocolate bars."+BMR);
            
    }
    public static void loops(){
        int count=-5;
        for(int i=5;i>0;i--){
           System.out.print(count+" ");
           count+=12;

        }
        System.out.println();
        for(int f=1;f<6;f++){
            System.out.print(f*f*f+" ");
        }
        System.out.println();
        for(int k=1;k<10;k+=2){
            System.out.print(k*k+" ");
        }
        System.out.println();
    }

    

}
