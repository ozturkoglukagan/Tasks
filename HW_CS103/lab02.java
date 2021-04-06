package HW_CS103;
public class lab02{
  
        public static void main(String[]args){
        drawTriangle();
        
    }

    public static void drawRectangle(){
   
        for(int i=0;i<6;i++){
            System.out.print("*");
        }
        
    System.out.println();
    for(int k=0;k<2;k++){
        System.out.print("*");
        for(int h=0;h<4;h++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        
    }
    
    for(int v=0;v<6;v++){
        System.out.print("*");

    }
    
    
    }
    public static void drawTriangle(){
        for(int line=1;line<6;line++){
            for(int i=0;i<line;i++){
                System.out.print(" ");
            }
            
            for(int j=0;j<11-2*line;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    
    }

    public static void drawFence(){
        for(int line=5;line>0;line--){
            for(int i=10;i>0;i--){
                System.out.print("|---");
            }
            System.out.println();
        } 
    }


} 