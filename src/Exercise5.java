import java.util.ArrayList;

/**
 * Created by jessicahuffstutler on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {

        String s = "To be or not to be, that is the question.";

        System.out.println(s);

        //remove commas and periods
        s = s.replaceAll(",", "").replaceAll(".", "");
        //make it all lower case
        s = s.toLowerCase();
        //then split into words
        String[] words = s.split(" ");
        //remove duplicate words (you cant remove items from a primitive array because they are fixed in size...
        // ...so we want to have some collection that hold non duplicate words in it/we need to maintain order
        // (so no hash set b/c it doesn't maintain order)
        // we need an arrayList b/c we can keep adding to it
        ArrayList<String> newWords = new ArrayList();
        for (String word : words) {
            if (!newWords.contains(word)) {
                newWords.add(word);
            }
        }
        //create a new string without the duplicate words
        String newStr = "";
        for (String newWord : newWords) {
            if (!newStr.isEmpty()) {
                newStr += " " + newWord;
            }
            newStr += newWord;
        }

        System.out.println(newStr);
        //new sentence should read: "to be or not that is the question"
    }
}

//        for(String word : words) {
//            String cleanedWord = word.toLowerCase().replace(",", "").replace(".", "");
//            String cleanedSentence = ;
//            if (cleanedWord == ) { //if cleanedWord already exists...
//                words.remove(cleanedWord); //remove cleaned word
//            } else
//                cleanedSentence.add(cleanedWord); //else, add cleanedWord to cleanSentence.
//        }

