package dr.calculate.secondtEtap;

import dr.variables.Variables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MMCriteria {

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
        System.out.println(Arrays.toString(minI));
        return minI;
    }

    private  List<Integer> result = new ArrayList<>();

    public void setRes(int[] minI) {
        int max = minI[0];
        for (int i = 1; i < minI.length; i++) {
            if (max < minI[i]) {
                max = minI[i];
            }
        }
        for (int i = 0; i < minI.length; i++) {
            if (max == minI[i]) {
                result.add(i + 1);
//                System.out.println(Variables.recomendate[i]);
            }
            System.out.println("");
        }
        this.result = result;
    }

    public List<Integer> getResult() {
        System.out.println(result);
        return result;
    }
    
    private static String str = "";

    public void setStr(int[] minI) {
        int max = minI[0];
        for (int i = 1; i < minI.length; i++) {
            if (max < minI[i]) {
                max = minI[i];
            }
        }
        for (int i = 0; i < minI.length; i++) {
            if (max == minI[i]) {
                result.add(i + 1);
                str += Variables.recomendate[i]+ " \n";
                System.out.println(Variables.recomendate[i]);
            }
           
            System.out.println("");
        }
        this.str = str;
    }

    public String getString() {
        System.out.println();
        return str;
    }
}
