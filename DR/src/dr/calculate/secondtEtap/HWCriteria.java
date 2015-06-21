package dr.calculate.secondtEtap;

import dr.variables.Variables;
import static dr.variables.Variables.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HWCriteria {
//==============================================================================

    private static int[] minI = new int[columnNames2.length];

    public void setMinI(int[][] ZO) {
        int[] minI = new int[ZO.length];
        for (int i = 0; i < ZO.length; i++) {
            minI[i] = Integer.MAX_VALUE;
            for (int j = 0; j < ZO[i].length; j++) {
                if (minI[i] > ZO[i][j]) {
                    minI[i] = ZO[i][j];
                }
            }
        }
        this.minI = minI;
    }

    public int[] getMinI() {
//        System.out.println(Arrays.toString(minI));
        return minI;
    }
//==============================================================================
    private static int[] maxI = new int[columnNames2.length];

    public void setMaxI(int[][] ZO) {
        int[] maxI = new int[ZO.length];
        for (int i = 0; i < ZO.length; i++) {
            maxI[i] = Integer.MIN_VALUE;
            for (int j = 0; j < ZO[i].length; j++) {
                if (maxI[i] < ZO[i][j]) {
                    maxI[i] = ZO[i][j];
                }
            }
        }
        this.maxI = maxI;
    }

    public int[] getMaxI() {
//        System.out.println(Arrays.toString(maxI));
        return maxI;
    }
//==============================================================================
    private static double[] er = new double[columnNames2.length];
    double c = 0.5;

    public void setEr(int[] minI, int[] maxI) {
        for (int i = 0; i < columnNames2.length; i++) {
            er[i] = getMinI()[i] * c + (1 - c) * getMaxI()[i];
        }
        this.er = er;
    }

    public double[] getEr() {
        System.out.println(Arrays.toString(er));
        return er;
    }
//==============================================================================
    private static List<Integer> result = new ArrayList<>();

    public void setRes(double[] er) {
        double max = er[0];
        for (int i = 1; i < er.length; i++) {
            if (max < er[i]) {
                max = er[i];
            }
        }
        for (int i = 0; i < er.length; i++) {
            if (max == er[i]) {
                result.add(i + 1);
            }
        }
        this.result = result;
    }

    public List<Integer> getResult() {
        return result;
    }
//==============================================================================
    private static String str = "";

    public void setStr(double[] er) {
        double max = er[0];
        for (int i = 1; i < er.length; i++) {
            if (max < er[i]) {
                max = er[i];
            }
        }
        for (int i = 0; i < er.length; i++) {
            if (max == er[i]) {
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
