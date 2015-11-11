import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 11/11/15.
 */
public class Exercise11 {
    public static void main(String[] args) {
        /*
        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.println("Please type a word");
        inputString = in.nextLine();

        int length = inputString.length();
        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end)/2;

        for(i = begin; 1 <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }

        if (i == middle + i) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        */


        System.out.println(isPalindrome("Hello")); //false
        System.out.println(isPalindrome("racecar")); //true
        System.out.println(isPalindrome("hannah"));

        System.out.println(isPal("Hello")); //false
        System.out.println(isPal("racecar")); //true
        System.out.println(isPal("hannah"));
    }

    static boolean isPalindrome(String s) {
        //does string forward == string backwards?
        int n = s.length();

        for(int i = 0; i < n/2 +1; ++i) { //n/2 -> the +1 doesnt seem to be necessary
            if(s.charAt(i) != s.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPal(String s) {
        //does string forward == string backwards?
        String reversedS = new String();

        for(int i = s.length()-1; i>=0; i--) {
            reversedS += s.charAt(i);
            }
        return s.toLowerCase().equals(reversedS.toLowerCase());
    }
}
