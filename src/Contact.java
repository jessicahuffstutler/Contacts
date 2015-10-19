/**
 * Created by jessicahuffstutler on 10/7/15.
 */
public class Contact implements Comparable {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() { //empty contructor that works just like the default constructor

    }

    public Contact(String name, int age) { //Constructor
        this.name = name; //assigns a value to a variable. this.name refers to the "pubilc string name", the second name refers to the "String Name" from the parenthesis above.
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Contact c = (Contact) o;
        int result = name.compareTo(c.name);
        if (result == 0) {
            return age - c.age;
        } else {
            return result;
        }
    }
}
