package br.com.yuricfurusho.codility;

/**
 * Created by maryuri on 28/04/16.
 */
public class EquiPoints {
    //[-1,3,-4,5,1,-6,2,1]
//    2147483647
    public static void main(String[] args) {
        int[] arrayExemplo = {-1, 3, -4, 5, 1, -6, 2, 1};
        int[] arrayExtremo = {-1, 3, -4, 5, -2147483647, -6, 2, 2147483647};


        long resultadoExemplo = EquiPoints.solution(arrayExemplo);

        System.out.println("resultadoExemplo: " + resultadoExemplo);

        long resultadoExtremo = EquiPoints.solution(arrayExtremo);
        System.out.println("resultadoExtremo: " + resultadoExtremo);
    }

    public static int solution(int[] A) {
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
            if (sumRight == sumLeft)
                return i;
        }

        return -1;

    }


}
