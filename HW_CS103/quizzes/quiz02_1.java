package HW_CS103.quizzes;

public class quiz02_1{
    
        public static void main(String[] args) {
            int x;
            int y;
            int z;
            x = 10;
            y = x++ + 10;
            z = --y + x;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
            x *= 2;
            y = y - 1;
            z = z / 4;
            System.out.println();
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }
    /*public static void drawRectangle(){
        System.out.println("----");
        System.out.println("| |");
        System.out.println("| |");
        System.out.println("----");
    }
    

    public static void drawF(){
        System.out.println("----");
        System.out.println("|--");
        System.out.println("|");

    }*/
    
    
}

