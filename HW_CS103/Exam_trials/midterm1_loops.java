package HW_CS103.Exam_trials;

public class midterm1_loops {
    public static void main(String[] args){
        drawPyramidOfNumbers();

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
    
    public static void pyramid(){
        for(int row=4;row>0;row--){
            for(int stars=1;stars<row;stars++){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int blanks=0;blanks<8-2*row;blanks++){
                System.out.print(" ");

            }
            System.out.print("\\");
            for(int stars=1;stars<row;stars++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void reversePyramid(){
        for(int row=0;row<4;row++){
            for(int stars=0;stars<row;stars++){
                System.out.print(" ");

            }
            System.out.print("\\");
            for(int blanks=0;blanks<6-2*row;blanks++){
                System.out.print(" ");

            }
            System.out.print("/");
            for(int stars=0;stars<row;stars++){
                System.out.print(" ");
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
