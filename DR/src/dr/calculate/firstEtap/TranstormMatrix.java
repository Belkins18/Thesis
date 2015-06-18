package dr.calculate.firstEtap;

import dr.variables.Variables;

public class TranstormMatrix {

    private static int TM[][] = new int[12][16];
 
    
    public void setTM(int[][] ZO) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 16; j++) {
                TM[i][j] = ZO[j][i];
            }
        }
        TranstormMatrix.TM = TM;
    }

    public int[][] getTM() {
        return TM;
    }

    
    public void PrintResult() {
        for (int i = 0; i < 16; i++) {
            System.out.print("E[" + (i+1) + "]" + "\t");
        }
        System.out.println("");
        for (int i = 0; i < TM.length; i++) {
            for (int j = 0; j < TM[i].length; j++) {
                System.out.print(TM[i][j] + "\t");
            }
            System.out.println("X[" + (i+1) + "]");
        }
        System.out.println("");
    }
}
