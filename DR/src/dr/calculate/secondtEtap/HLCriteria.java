package dr.calculate.secondtEtap;

import dr.variables.Variables;
import static dr.variables.Variables.columnNames2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HLCriteria {
//==============================================================================
    private static double[] sumeqI = new double[Variables.columnNames2.length];

    public void setSumeqI(int[][] ZO) {
        double q = 1f / ZO[0].length;
        for (int i = 0; i < ZO.length; i++) {
            for (int j = 0; j < ZO[i].length; j++) {
                sumeqI[i] += Math.round(ZO[i][j] * q);
            }
        }
        this.sumeqI = sumeqI;
    }

    public double[] getSumeqI() {
//        System.out.println(Arrays.toString(sumeqI));
        return sumeqI;
    }
//==============================================================================
    private static int[] minI = new int[Variables.columnNames2.length];

    public void setMinI(int[][] ZO) {
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
    private static double[] er = new double[columnNames2.length];
    double nu = 0.5;

    public void setEr(double[] SumeqI, int[] MinI) {
        for (int i = 0; i < columnNames2.length; i++) {
            er[i] = getSumeqI()[i] * nu + (1 - nu) * getMinI()[i];
        }
        this.er = er;
    }

    public double[] getEr() {
//        System.out.println(Arrays.toString(er));
        return er;
    }
//==============================================================================
    private List<Integer> result = new ArrayList<>();

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
        System.out.println(result);
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
