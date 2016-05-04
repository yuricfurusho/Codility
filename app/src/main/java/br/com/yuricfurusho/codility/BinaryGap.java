package br.com.yuricfurusho.codility;

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

        int gapSize = findBiggestGap(binary);

        return gapSize;
    }

    private static int findBiggestGap(String string) {
        char c;
        int count = 0;
        int maior = 0;

        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);

            if (c == '0') {
                count++;
            } else {
                if (count > maior) {
                    maior = count;
                }
                count = 0;
            }
        }
        return maior;
    }

    public static String BinaryOf(int decimalNumber) {
        if (decimalNumber <= 1) {
            return Integer.toString(decimalNumber);
        }

        return BinaryOf(decimalNumber / 2) + "" + decimalNumber % 2;
    }

}
