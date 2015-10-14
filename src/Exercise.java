import java.util.ArrayList;

/**
 * Created by jessicahuffstutler on 10/14/15.
 */
public class Exercise {
    public static void main(String[] args) {
        Contact alice = new Contact();
        alice.name = "Alice"; //setting field
        alice.age = 25;

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.age = 35;

        ArrayList<Contact> contacts = new ArrayList<>(); //switching over to arraylist FROM THE ARRAY BELOW because arraylist is dynamic and we can keep adding on to it
        contacts.add(alice); //now we are storing the alice and bob Contact inside of the ArrayList.
        contacts.add(bob);
        //ALT: List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Austin"); => not the best option, esp if you already know all the values
        //String[] names = {"Alice", "Bob", "Charlie", "Austin"}; //creating an array; alt creation "String[] names = new String[4];" Next Line: "names[0] = "Alice"" Next Line: "names[1] = "Bob""

        for (Contact contact : contacts) { //for will be used to loop over a collection (array or arrayList); left of colon is variable representing the item you are looking at right now and right of colon is the collection you're looping over)
            if (contact.name.startsWith("A")) { //example of pulling the field out to do something with it
                System.out.println(contact.name);
            }
        }
    }
}
