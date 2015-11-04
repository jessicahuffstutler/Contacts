import java.util.ArrayList;

/**
 * Created by jessicahuffstutler on 11/4/15.
 */
public class Exercise9 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "David", "Charlie"};
        ArrayList<String> sortedNames = new ArrayList();

        for (String name : names) { //we have to loop through the String[] names to compare
            //Below: we are sorting the names as we add them to sortedNames
            int index = 0; //starting at 0 so if there is nothing in sortedNames it is placed at 0
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index++;
                } else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}
