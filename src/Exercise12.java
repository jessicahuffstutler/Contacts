import java.util.ArrayList;

/**
 * Created by jessicahuffstutler on 12/3/15.
 */
//laziness
public class Exercise12 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        ArrayList<String> shortNames = new ArrayList();
        for (String name : names) {
            if (name.length() > 5) {
                break;
            }
            shortNames.add(name);
        }
        System.out.println(shortNames);
    }
}
