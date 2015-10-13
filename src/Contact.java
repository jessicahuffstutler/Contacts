/**
 * Created by jessicahuffstutler on 10/7/15.
 */
public class Contact {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() { //Constructor; no arguments (whats inside the parenthesis)
        this.name = "Jessica Huffstutler";
        this.email = "jessica.huffstutler@gmail.com";
    }

    public Contact(String name, String address, String email, int age) { //Constructor with 4 different arguments
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName){
        this.name = newName; //this."name" refers to the first instance of name in the code,(field) not after void (argument), which we changed to newName to reduce confusion
    }

    public static boolean isValidName(String name) { //static method
        return name.length() != 0;
    }
}
