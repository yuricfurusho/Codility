package br.com.yuricfurusho.codility;

import java.text.StringCharacterIterator;
import java.util.logging.Logger;

/**
 * Created by maryuri on 28/04/16.
 */
public class BinaryGap {
//    [-1,3,-4,5,1,-6,2,1]
//    2147483647

    private static Logger LOGGER = Logger.getLogger(BinaryGap.class.getName());

    public static void main(String[] args) {

        long resultadoNove = BinaryGap.solution(9);

        System.out.println("resultadoNove: " + resultadoNove);

        long resultadoQuinze = BinaryGap.solution(15);
        System.out.println("resultadoQuinze: " + resultadoQuinze);

        long resultado529 = BinaryGap.solution(529);
        System.out.println("resultado529: " + resultado529);

        long resultadoMax = BinaryGap.solution(2147483647);
        System.out.println("resultadoQuinze: " + resultadoMax);
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        String binary = BinaryOf(N);

        int gapSize = countBiggestZeroSequence(binary);

        return gapSize;
    }

    private static int countBiggestZeroSequence(String s) {
        StringCharacterIterator iterator = new StringCharacterIterator(s);
        int count = 0;
        if (iterator.current() == '0') {
            count++;
            iterator.next();
        } else {

            count = 0;
        }
        return null;
    }

    public static String BinaryOf(int decimalNumber) {
        if (decimalNumber <= 1) {
            return Integer.toString(decimalNumber);   // KICK OUT OF THE RECURSION
        }

        return BinaryOf(decimalNumber / 2)  + "" +  decimalNumber % 2;
    }

}
