package HW_CS103.quizzes;

public class MysteryNums { 
    
    static int x = 15; 
    static int y = 144;
    public static void main(String[] args) { 
            calculateSum(x, y);
    } 
    public static void calculateSum(int first, int last) { 
        int count=0;
        
        for(int number=first;number<last+1;number++){
            count+=number*number;
                }
        System.out.println("The sum of "+first+" squared to "+last+" squared is:  "+count);
    }
}
