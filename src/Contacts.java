import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by jessicahuffstutler on 10/13/15.
 */
public class Contacts {
    public static void main(String[] args) {
        Contact bob = new Contact("Bob", 30); //make use of the constructor from "Contact.java"
        Contact alice = new Contact ("Alice", 20);
        Contact charlie = new Contact ("Charlie", 25);
        Contact alice2 = new Contact ("Alice", 10);

        ArrayList<Contact> contacts = new ArrayList<>(); //we are storing contact objects in here
        contacts.add(bob);
        contacts.add(alice);
        contacts.add(charlie);
        contacts.add(alice2);

        Collections.sort(contacts);

        ArrayList<Contact> contactsUnderThirty = new ArrayList();

        Contact contactToFind = null;
        for (Contact c : contacts) { //for loops are for looping over collections, left side of colon is temporary variable and right side is our list "contacts", think of colon as the word "in"
            if (c.age < 30) { //searching for people with age less than 30
                contactsUnderThirty.add(c);
            }
        }

        System.out.println(contactsUnderThirty);

        HashMap<String, Contact> contactMap = new HashMap();
        contactMap.put("Bob", bob); //putting contacts in the hashmap
        contactMap.put("Alice", alice);
        contactMap.put("Charlie", charlie);

        //contactToFind = contactMap.get("Alice");

        if (contactToFind == null) {
            System.out.println("Couldn't find contact.");
        } else {
            System.out.println("Found contact");
        }
    }
}
