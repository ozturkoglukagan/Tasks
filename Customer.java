import java.io.File;
import java.io.FileWriter;

public class Customer {
    

    int id;
    String name;
    String surname;
    int birthyear;
    double tckn;
    double balance;
    double debt;
    
    //our constructor to have as a base
    public Customer(int id, String name, String surname, int birthyear, double tckn, double balance, Double debt) {
    this.id=id;
    this.name=name;
    this.surname=surname;
    this.birthyear=birthyear;
    this.tckn=tckn;
    this.balance=balance;
    this.debt=debt;

    }

    public void save_customer() {

        String path_name = this.id + "_"+this.name+".txt";

        String content = this.print_customer(false);

        try {
        FileWriter myWriter = new FileWriter(new File(path_name));

        myWriter.write(content);
        myWriter.write("Kagan @2021");
        myWriter.close();
        }catch(Exception e){
            System.out.println("Error on saving customer!!");
        }
        



    }

    public String print_customer(boolean willPrint){

        
        String customerStr = "\n--------------|| Customer "+ this.id +" ||--------------"+
        "\nName            : "+this.name+
        "\nSurname         : "+this.surname+
        "\nBirth Year      : "+this.birthyear+
        "\nTCKN            : "+this.tckn+
        "\nBalance         : "+this.balance+
        "\nDebt            : "+this.debt;
        if (willPrint){
            System.out.println(customerStr);
        }
        
        return customerStr;
   
    }


	

    

    
}
