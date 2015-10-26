import java.util.HashMap;

/**
 * Created by jessicahuffstutler on 10/26/15.
 */
public class Exercise4 {

    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        HashMap<String, Integer> frequencies = new HashMap();
        String[] words = sentence.split(" "); //splitting the sentence above into an array of words using the spaces in the sentence as break points

        for(String word : words) {
            String cleanedWord = word.toLowerCase().replace(",", "").replace(".", ""); //making all letters lower case and removing commmas from a word.
            if (frequencies.get(cleanedWord) == null) {
                frequencies.put(cleanedWord, 1); //we haven't counted that word before so it gets a quantity of 1
            } else {
                int count = frequencies.get(cleanedWord);
                frequencies.put(cleanedWord, count + 1);
            }
        }

        System.out.println(frequencies);

//        alex's method
//        for(String word : words) {
//            int counter = 1;
//            for(String word2 : words) {
//                if (word2.equals(word)) {
//                    frequencies.put(word, counter);
//                    counter++;
//                }
//            }
//        }
    }
}
