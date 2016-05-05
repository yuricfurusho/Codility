package br.com.yuricfurusho.codility;

import java.util.logging.Logger;

/**
 * Created by maryuri on 28/04/16.
 */
public class NegativeBinaryBase {
//    [1,0,0,1,1]
//    [1,0,0,1,1,1]


    private static Logger LOGGER = Logger.getLogger(NegativeBinaryBase.class.getName());

    public static void main(String[] args) {

        int[] arrayExemplo9 = {1, 0, 0, 1, 1}; //9
        int[] arrayExemplo23 = {1, 0, 0, 1, 1, 1};
        int[] arrayExtremo2 = {5, 5, 1, 0, 2, 3, 5};


        int[] resultadoExemplo9 = NegativeBinaryBase.solution(arrayExemplo9);
        System.out.println("resultadoExemplo9: " + resultadoExemplo9);


        int[] resultadoExemplo23 = NegativeBinaryBase.solution(arrayExemplo23);
        System.out.println("resultadoExemplo23: " + resultadoExemplo23);


        int[] resultadoExtremo2 = NegativeBinaryBase.solution(arrayExtremo2);
        System.out.println("resultadoExtremo2: " + resultadoExtremo2);
    }

    public static int[] solution(int[] A) {
        // write your code in Java SE 8

        int decimal = decimalOf(A);

        int[] negativeNegativebinary = negativeBinaryOf(decimal * -1);

        int[] trimmedArray = trimZeros(negativeNegativebinary);

        return trimmedArray;
    }

    private static int decimalOf(int[] B) {
        int sum = 0;
        for (int i = 0; i < B.length; i++) {

            sum = (int) (sum + B[i] * Math.pow(-2, i));

        }

        return sum;
    }

    private static int[] trimZeros(int[] A) {
        return A;
    }

    public static int[] negativeBinaryOf(int decimalNumber) {

        string result = string.Empty;

        while (value != 0)
        {
            int remainder = value % -2;
            value = value / -2;

            if (remainder < 0)
            {
                remainder += 2;
                value += 1;
            }

            result = remainder.ToString() + result;
        }

        return result;
    }

}
