package dr.calculate.secondtEtap;

import java.math.BigInteger;

public class MultCriteria {

    private static int a;

    public void setA(int[][] inputMatrix) {
        int minIJ = Integer.MAX_VALUE;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (minIJ > inputMatrix[i][j]) {
                    minIJ = inputMatrix[i][j];
                }
            }
        }
        a = Math.abs(minIJ) + 1;
        this.a = a;
    }

    public int getA() {
//        System.out.print(a);
        return a;
    }

    private int[][] matrix = new int[12][16];

    public void setMatrix(int[][] inputMatrix, int a) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                matrix[i][j] = getA() + inputMatrix[i][j];
            }
        }
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println("");
//        }
        return matrix;
    }

    private static double[] mult = new double[12];

    public void setMult(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            mult[i] = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                mult[i] *= (matrix[i][j]);
//                System.out.println(mult[i]);
            }
//            System.out.println(mult[i]);
        }
        this.mult = mult;
    }

    public double [] getMult() {
//        System.out.println("");
//        for (int i = 0; i < mult.length; i++) {
//            System.out.print(mult[i] + "\t");
//        }
        return mult;
    }

}
