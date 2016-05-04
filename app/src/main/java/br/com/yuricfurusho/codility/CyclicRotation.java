package br.com.yuricfurusho.codility;

import java.util.logging.Logger;

/**
 * Created by maryuri on 28/04/16.
 */
public class CyclicRotation {
//    [-1,3,-4,5,1,-6,2,1]
//    2147483647
    // [3, 8, 9, 7, 6]

    private static Logger LOGGER = Logger.getLogger(CyclicRotation.class.getName());

    public static void main(String[] args) {
        int[] arrayExemplo = {3, 8, 9, 7, 6};
        int[] arrayExtremo = {-1000, 8, 1000, 7, 6};


        int[] resultadoExemplo0 = CyclicRotation.solution(arrayExemplo, 0);
        int[] resultadoExemplo1 = CyclicRotation.solution(arrayExemplo, 1);
        int[] resultadoExemplo = CyclicRotation.solution(arrayExemplo, 3);
        int[] resultadoExemplo100 = CyclicRotation.solution(arrayExemplo, 100);
        int[] resultadoRodaTudo = CyclicRotation.solution(arrayExemplo, arrayExemplo.length);


        int[] resultadoExtremo = CyclicRotation.solution(arrayExtremo, 2);
        int[] resultadoExtremo3 = CyclicRotation.solution(arrayExtremo, 3);
        int[] resultadoExtremo4 = CyclicRotation.solution(arrayExtremo, 4);
    }


    public static int[] solution(int[] A, int K) {

        int[] rodado = new int[A.length];

        for (int i = 0; i < rodado.length; i++) {
            int newPosition = (i + K) % rodado.length;
            rodado[newPosition] = A[i];
        }

        return rodado;
    }


}
