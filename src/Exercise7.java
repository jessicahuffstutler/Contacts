import java.util.*;

/**
 * Created by jessicahuffstutler on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones"};
        //reverse the array -> Jones, Charlie, Brown, Bob, Smith, Alice
        List<String> list = Arrays.asList(names);
        Collections.reverse(list);

        System.out.println(list);

        //convert the array into a HashMap (Key value pair Alice (Value) Smith (Key)
        HashMap<String, String> nameMap = new HashMap();

        for(int i = 0; i< names.length; i+=2) {
            if (names.length > i+1) {
                nameMap.put(names[i], names[i=1]);
            }

        }

        //OR
        //for(int i = 0; i< names.length; i+=2) {
        //    try {
        //        nameMap.put(names[i], names[i=1]);
        //    } catch (Exception e) {
        //      }
        //}

        System.out.println(nameMap);
    }
}
