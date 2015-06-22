package dr.calculate.secondtEtap;

import dr.variables.Variables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GCriteria {
//==============================================================================
    private static double[][] inputValue = new double[Variables.columnNames2.length][Variables.columnNames.length];

    public void setInputValue(int[][] minusMatrix) {
        double q = 1f / minusMatrix[0].length;
        for (int i = 0; i < minusMatrix.length; i++) {
            for (int j = 0; j < minusMatrix[i].length; j++) {
                inputValue[i][j] = minusMatrix[i][j] * q;
            }
        }
        this.inputValue = inputValue;
    }

    public double[][] getInputValue() {
        return inputValue;
    }
//==============================================================================
    private static double[] minI = new double[Variables.columnNames2.length];

    public void setMinI(double [][] InputValue) {
        for (int i = 0; i < InputValue.length; i++) {
            minI[i] = Integer.MAX_VALUE;
            for (int j = 0; j < InputValue[i].length; j++) {
                if (minI[i] > InputValue[i][j]) {
                    minI[i] = InputValue[i][j];
                }
            }
        }
        this.minI = minI;
    }

    public double [] getMinI() {
        System.out.println(Arrays.toString(minI));
        return minI;
    }
//==============================================================================
    private List<Integer> result = new ArrayList<>();

    public void setRes(double [] minI) {
        double max = minI[0];
        for (int i = 1; i < minI.length; i++) {
            if (max < minI[i]) {
                max = minI[i];
            }
        }
        for (int i = 0; i < minI.length; i++) {
            if (max == minI[i]) {
                result.add(i + 1);
            }
        }
        this.result = result;
    }

    public List<Integer> getResult() {
        System.out.println(result);
        return result;
    }
//==============================================================================
    private static String str = "";

    public void setStr(double [] minI) {
        double max = minI[0];
        for (int i = 1; i < minI.length; i++) {
            if (max < minI[i]) {
                max = minI[i];
            }
        }
        for (int i = 0; i < minI.length; i++) {
            if (max == minI[i]) {
                result.add(i + 1);
                str += Variables.recomendate[i] + " \n";
                System.out.println(Variables.recomendate[i]);
            }
        }
        this.result = result;
    }

    public String getString() {
        return str;
    }
//==============================================================================
}
