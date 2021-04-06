package HW_CS103;

public class Oops {
    public static void main(String[] args) {
        //replaced int with double because of the line 10 and initialized to print in line 7
        double x=0;
        System.out.println("x is " + x);
        
        //removed int part because x declared already 
        x = 15.2; // set x to 15.2

        //replaced the wrong “ with "
        System.out.println("x is now " + x);
        
        //to set y to the value of x+1 y needs to hold double value
        double y; // set y to 1 more than x
        
        //removed int both because x holds double value and it is declared already
        y = x+1;

        //added missing double quotes for "and"
        System.out.println("x and y are " + x + " and " + y);
        }
    
}
