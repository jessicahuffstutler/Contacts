import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 10/15/15.
 */
public class Exercise2 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //sayHello(scanner);

        HashMap<String, ArrayList<String>> groups = new HashMap();//storing letter as a key, and the value will be storing an arraylist of strings.
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};
        //we want one key as A with an array list containing Alice, Austin and Albert. one key as B with Arraylist containing Bob
        for (String name : words) {
            //String firstLetter = name.substring(0,1); //it's giving you the first character but we will use the ... below
            String firstLetter = String.valueOf(name.charAt(0)); //getting that value of the character at the first place.
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null) {
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list); //storing the arraylist inside of the hashmap
            } else {
                list.add(name); //arraylist is already in there so we don't need groups.put because the arraylist already exists
            }
        }

        System.out.println(groups);
    }

    static void sayHello(Scanner scanner) {
        //String input = "";
        //do {
        //    System.out.println();
        //    input = scanner.nextLine();
        //} while (!input.equals("hello"));
        //the above commented out code was Landon's code for this activity using a do, while loop.

        while (true) {
            System.out.println("Please enter 'hello'");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("hello")) { //using ignore case
                System.out.println("Thank you");
                System.exit(0);
            }
        }
    }
}
