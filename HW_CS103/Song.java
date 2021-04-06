package HW_CS103;

public class Song {
    static String sheep = "sheep";
    static String hen = "hen";
    static String duck = "duck";
    static String goose = "goose";
    static String cat = "cat";

    public static void main(String[] args) {
        playSong();
    
    }

    public static void playSong(){
        // First verse
        boughtFed(cat);
        System.out.println("Cat goes fiddle-i-fee.\n");

        // Second verse
        boughtFed(hen);
        henCat();

        // Third Verse
        boughtFed(duck);
        System.out.println("Duck goes quack, quack,");
        henCat();

        // Fourth verse
        boughtFed(goose);
        gooseDuck();
        henCat();

        // Fifth verse
        boughtFed(sheep);
        System.out.println("Sheep goes baa, baa,");
        gooseDuck();
        henCat();
        
    }
   

    // To eliminate redundancy I preferred to create method to print the same lines for each animal
    public static void boughtFed(String animal){
        System.out.println("Bought me a "+animal+" and the "+animal+" pleased me,");
        System.out.println("I fed my "+animal+" under yonder tree.");

    }
    
    
    // This two lines occures more than once so I put them in a method
    public static void henCat(){
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
        System.out.println("Cat goes fiddle-i-fee.\n");
    
    }


    // This two lines occures more than once so I put them in a method
    public static void gooseDuck(){
        System.out.println("Goose goes hissy, hissy,");
        System.out.println("Duck goes quack, quack,");
        
    }

}
