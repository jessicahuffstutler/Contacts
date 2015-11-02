import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by jessicahuffstutler on 11/2/15.
 */
public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        //loop over names
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(new File("people.csv")); //red underline: had to options enter to add method to exception

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //split line into array of columns
            String[] columns = line.split(","); //splitting the lines from people.csv by each comma
//            String firstName = columns[1];
//            String lastName = columns[2];

            //add first and last name into the arraylist called names
            names.add(columns[1] + " " + columns[2]);
//            names.add(firstName);
//            names.add(lastName);
        }

        //implement searching
        String searchTerm = "ali"; //searching for all names starting with "ali"
        ArrayList<String> results = new ArrayList<>();
        //fill up results with all the names that contain searchTerm (case insensitive)
        searchTerm = searchTerm.toLowerCase();
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm)) { //searching for the name to match the searchTerm if it is made lower case and contains "ali"
                results.add(name);
            }
        }

        System.out.println(results);

        //using streams -> functional approach, may be better because it can be parallelized.
        final String searchTerm2 = searchTerm;
        List<String> results2 =
                names
                .stream() //to parallelize this we would change this to ".parallelstream()"
                .filter((name) -> {
                    return name.toLowerCase().contains(searchTerm2);
                })
                .collect(Collectors.toList());

        System.out.println(results2);
    }
}
