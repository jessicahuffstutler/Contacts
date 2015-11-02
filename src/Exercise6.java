
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jessicahuffstutler on 10/28/15.
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(Arrays.asList("alice", "bob", "charlie", "david", "allen", "barbie", "colin", "dan")); //ititialize Arraylist on one line.

        //Take the first 5 (make a new ArrayList to store the first 5 in one command)
        //my alternative way: List<String> five = names.subList(0, 5); //List is an interface that ArrayList implements
        names = new ArrayList(names.subList(0, 5)); //first index is inclusive and end index is exclusive

        //End display = ["BOB", "CHARLIE", "DAVID"]
        solveViaTempLists(names);
        solveViaDirectModification(names);
        solveViaStream(names);
    }

    static void solveViaDirectModification(ArrayList<String> names) {
        //make every string inside uppercase (i.e. ALICE)
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i).toUpperCase();
            names.set(i, s); //directly replacing instead of creating a new ArrayList
        }

        //Remove the ones that start with "a"
        Iterator it = names.iterator(); //iterating over an ArrayList
        //search for "java remove while looping" to find this syntax
        while (it.hasNext()) { //if there is anything left in the ArrayList, keep looping
            String name =  (String) it.next(); //casting because it.next() wanted String but was thinking it was an object (actual item that we're iterating over)
            if (name.startsWith("A")) {
                it.remove();
            }
        }

        System.out.println(names);
    }

    static void solveViaTempLists(ArrayList<String> names) {
        //Make every string inside uppercase (i.e. ALICE)
        ArrayList<String> tempNames = new ArrayList();
        for (String name : names) {
            //name.toUpperCase(); //can't do this because it doesn't store it, we cant modify it because it doesnt save anywhere
            //so we created a second ArrayList above to store temporary names.
            tempNames.add(name.toUpperCase());
        }
        names = tempNames;

        //Remove the ones that start with "a"
        tempNames = new ArrayList();
        for (String name : names) {
            if (!name.startsWith("A")) {
                tempNames.add(name);
            }
        }

        names = tempNames;

        System.out.println(names);

    }

    static void solveViaStream(ArrayList<String> names) {
        List<String> newNames =
                names
                .stream() //calls method called stream.
                .map((name) -> { //map function takes an anonymous function
                    return name.toUpperCase();
                })
                .filter((name) -> { //filter function tells if name should be included in the results
                    return !name.startsWith("A");
                })
                .collect(Collectors.toList()); //turn this string back into a list

        System.out.println(newNames);
    }
}
