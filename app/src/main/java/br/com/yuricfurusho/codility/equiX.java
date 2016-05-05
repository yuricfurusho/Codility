package br.com.yuricfurusho.codility;

import java.util.logging.Logger;

/**
 * Created by maryuri on 28/04/16.
 */
public class equiX {
//    (5, [5,5,1,7,2,3,5])
//    (1, [5,5,1,7,2,3,5])
//    (100000, [5,5,1,7,2,3,5])
//    (5, [5,5,1,100000,2,3,5])
//    (5, [5,5,1,0,2,3,5])


    private static Logger LOGGER = Logger.getLogger(equiX.class.getName());

    public static void main(String[] args) {
        int[] arrayExemplo = {5, 5, 1, 7, 2, 3, 5};
        int[] arrayExtremo = {5, 5, 1, 100000, 2, 3, 5};
        int[] arrayExtremo2 = {5, 5, 1, 0, 2, 3, 5};


        long resultadoExemplo = equiX.solution(5, arrayExemplo);
        System.out.println("resultadoExemplo: " + resultadoExemplo);


        long resultadoExtremo = equiX.solution(5, arrayExtremo);
        System.out.println("resultadoExtremo: " + resultadoExtremo);


        long resultadoExtremo2 = equiX.solution(5, arrayExtremo2);
        System.out.println("resultadoExtremo2: " + resultadoExtremo2);
    }


    public static int solution(int X, int[] A) {
        // write your code in Java SE 8

        int countX = 0;
        int countNotX = 0;

        for (int i = 0; i < A.length; i++) {
            if (X != A[i]) {
                countNotX++;
            }
        }

        for (int K = 0; K < A.length; K++) {
            int startLeft = 0;
            int endLeft = K-1;
            int startRight = K;
            int endRight = A.length-1;

            if (endLeft >= 0) {
                if (X == A[endLeft]) {
                    countX++;
                } else {
                    countNotX--;
                }
            }

            if (countX == countNotX) {
                return K;
            }

        }

        return -1;
    }


    public static int solutionold(int[] A) {
        // write your code in Java SE 8

        long sumLeft = 0;
        long sumRight = 0;
        long sumTotal = 0;
        for (int j = 0; j < A.length; j++) {
            sumTotal = sumTotal + A[j];
        }
        for (int i = 0; i < A.length; i++) {
            if (i > 0) {
                sumLeft = sumLeft + A[i - 1];
            }
            sumRight = sumTotal - A[i] - sumLeft;
            LOGGER.info("i:" + i);
            if (sumRight == sumLeft)
                return i;
        }

        return -1;

    }


}
