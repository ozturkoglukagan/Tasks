package HW_CS103.Exam_trials;

public class midterm1_01 {

    public static void main(String[] args){
         
         System.out.println(6 + (18 % (17 - 12)));

    }
    public static void drawPyramidOfNumbers(){

        for(int line = 4;line>=0;line--){
            
            for(int column=0;column<=line;column++){
                System.out.print(" ");
            }
            for(int numbahs=0;numbahs<5-line;numbahs++){
                System.out.print(numbahs+" ");

            }
            System.out.println();
        }
    }
    public static void drawPyramidOfNumbers2(){
        int count=1;
        for(int line = 4;line>=0;line--){
            
            for(int column=0;column<=line;column++){
                System.out.print(" ");
            }
            for(int numbahs=0;numbahs<5-line;numbahs++){
                System.out.print(count+" ");
                count++;

            }
            System.out.println();
        }
    }

    public static void drawTriangle(){
        for(int row=5; row>0;row--){
            for(int line=0;line<row;line++){
                System.out.print("*");
            }
            for(int shabe=0;shabe<11-2*row;shabe++){
                System.out.print("O");

            }
            System.out.println();
        }
    }

    public static void drawReverseTriangle(){
        for(int line=0;line<7;line++){

            for(int blanks=0;blanks<line;blanks++){
                System.out.print(" ");

            }
            for(int triangle=0;triangle<13-2*line;triangle++){
                System.out.print("X");
                
            }
            System.out.println();

        }
    }

    public static void drawX(){
        for(int i=6;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("0");
            }
            
            System.out.println("X");

        }


    }

    public static void drawFence(){
        for(int row=10;row>0;row--){
            System.out.print("|");
            for(int blocks=0;blocks<10;blocks++){
                System.out.print("---|");
            }
            System.out.println();

        }

    }


    public static void drawSideTriangle(){
        for(int line=8;line>0;line--){

            for(int fhalf=0;fhalf<line;fhalf++){
                System.out.print("8");
            }
            for(int fhalf=8;fhalf>line;fhalf--){
                System.out.print("0");
            }
            System.out.println();

        }
    }
    public static void drawPyramid(){
        for(int row=0;row<3;row++){
            for(int shaper=2;shaper>row;shaper--){
                System.out.print("*");
            }
            System.out.print("/");

            for(int blanks=0;blanks<row;blanks++){
                System.out.print("00");
            }
            
            System.out.println("\\");
        }
    }

    public static void drawReversePyramid(){
        for(int row=3;row>0;row--){
            for(int shaper=3;shaper>row;shaper--){
                System.out.print("*");
            }
            System.out.print("\\");

            for(int blanks=0;blanks<row-1;blanks++){
                System.out.print("00");
            }
            
            System.out.println("/");
        }
    }
    public static void drawDoublePyramid(){
        for(int row=3;row>0;row--){
            for(int shaper=3;shaper>row;shaper--){
                System.out.print("*");
            }
            System.out.print("X");

            for(int blanks=0;blanks<2*row-1;blanks++){
                System.out.print("0");
            }
            
            System.out.println("X");
        }
        System.out.println("***X");
        for(int row=0;row<3;row++){
            for(int shaper=2;shaper>row;shaper--){
                System.out.print("*");
            }
            System.out.print("X");

            for(int blanks=0;blanks<2*row+1;blanks++){
                System.out.print("0");
            }
            
            System.out.println("X");
        }
    }
    public static void zeroToTriangle(){
        for(int row=4;row>0;row--){
            for(int stars=1;stars<row;stars++){
                System.out.print("*");

            }
            for(int xs=0;xs<9-2*row;xs++){
                System.out.print("0");

            }
            System.out.println();
        }
    }
    public static void zeroToTriangle2(){
        int maks=4;
        for(int row=0;row<maks;row++){
            for(int stars=0;stars<row;stars++){
                System.out.print("*");

            }
            for(int xs=0;xs<2*maks+1-2*row;xs++){
                System.out.print("0");

            }
            System.out.println();
        }
    }
}
