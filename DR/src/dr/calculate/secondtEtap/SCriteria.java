package dr.calculate.secondtEtap;

import dr.variables.Variables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCriteria {

    private int[] maxJ = new int[Variables.columnNames.length];

    public void setMaxJ(int[][] ZO) {
        maxJ = new int[Variables.columnNames.length];
        for (int i = 0; i < ZO.length; i++) {
            for (int j = 0; j < ZO[i].length; j++) {
                if (maxJ[j] < ZO[i][j]) {
                    maxJ[j] = ZO[i][j];
                }
            }
        }
        this.maxJ = maxJ;
    }

    public int[] getMaxJ() {
//        for (int i = 0; i < maxJ.length; i++) {
//            System.out.print(maxJ[i] + "\t");
//        }
        System.out.println(Arrays.toString(maxJ));
        return maxJ;
    }

    private int[][] matrixZal = new int[dr.variables.Variables.columnNames2.length][dr.variables.Variables.columnNames.length];

    public void setMatrixZal(int[][] ZO, int[] maxJ) {
        for (int i = 0; i < ZO.length; i++) {
            for (int j = 0; j < ZO[i].length; j++) {
                matrixZal[i][j] = maxJ[j] - ZO[i][j];

                if (matrixZal[i][0] == maxJ[i]) {

                }
            }
        }
        this.matrixZal = matrixZal;
    }

    public int[][] getMatrixZal() {
//        for (int i = 0; i < matrixZal.length; i++) {
//            for (int j = 0; j < matrixZal[i].length; j++) {
//                System.out.print(matrixZal[i][j] + "\t");
//            }
//            System.out.println("X[" + (i + 1) + "]");
//        }
//        System.out.println("");
        return matrixZal;
    }

    private int[] er = new int[matrixZal.length];

    public void setER(int[][] matrixZal) {
        for (int i = 0; i < matrixZal.length; i++) {
            er[i] = Integer.MIN_VALUE;
            for (int j = 0; j < matrixZal[i].length; j++) {
                if (er[i] < matrixZal[i][j]) {
                    er[i] = matrixZal[i][j];
                }
            }
        }
        this.er = er;
    }

    public int[] getER() {
        System.out.println(Arrays.toString(er));
        return er;
    }

    private List<Integer> result = new ArrayList<>();

    public void setResult(int[] er) {
        int min = er[0];
        for (int i = 1; i < er.length; i++) {
            if (min > er[i]) {
                min = er[i];
            }
        }
        for (int i = 0; i < er.length; i++) {
            if (min == er[i]) {
                result.add(i + 1);
            }
        }
        this.result = result;
    }

    public List<Integer> getResult() {
        System.out.println(result);
        return result;
    }
}
