import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by jessicahuffstutler on 10/19/15.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> people = new HashMap();

        for(String name : names) {
            for (String name2 : names) {
                if (!name.equals(name2)) {
                    //looping over each name here "do you have any list of contacts for alice?" if not we add them. each name will have 3 contacts, not themselves
                    Contact c = new Contact(name2, 0); //name and age in the contact object
                    //We could have done (instead of Contact c = new Contact(name2, 0);): Contact c = new Contact();
                    //We could have done (instead of Contact c = new Contact(name2, 0);): c.name = name2;
                    ArrayList<Contact> list = people.get(name);
                    if (list == null) {
                        list = new ArrayList();
                        list.add(c);
                        people.put(name, list);
                    } else {
                        list.add(c);
                    }
                }
            }
        }

        double randNum = Math.random();
        int index = (int) (randNum * 4);
        System.out.println(names[index]);

        Random rand = new Random();
        index = rand.nextInt(4); //should give us a number between 0 and 2
        System.out.println(names[index]);

    }
}
