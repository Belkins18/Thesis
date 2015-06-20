package dr.calculate.secondtEtap;

import dr.variables.Variables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLCriteria {

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
        System.out.println(Arrays.toString(sumeqI));
        return sumeqI;
    }

    private List<Integer> result = new ArrayList<>();

    public void setRes(double[] sumeqI) {
        double max = sumeqI[0];
        for (int i = 1; i < sumeqI.length; i++) {
            if (max < sumeqI[i]) {
                max = sumeqI[i];
            }
        }
        for (int i = 0; i < sumeqI.length; i++) {
            if (max == sumeqI[i]) {
                result.add(i + 1);
                System.out.println(Variables.recomendate[i]);
            }
        }
        this.result = result;
    }

    public List<Integer> getResult() {
        System.out.println(result);
        return result;
    }
}
