import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 11/10/15.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = 0;
//        Math way
//        while (num != 0) {
//            reversedNum = reversedNum * 10 + num % 10;
//            num = num / 10;
//            System.out.println(reversedNum);
//        }

//        String way:
        String numStr = String.valueOf(num);
        String numStrReversed = "";
        for(int i = numStr.length() - 1; i >= 0; i--) {
        numStrReversed += numStr.charAt(i);
        }
        int numReversed = Integer.valueOf(numStrReversed);
        System.out.println(numReversed);
    }

    //int numReversed = 54321;
}
