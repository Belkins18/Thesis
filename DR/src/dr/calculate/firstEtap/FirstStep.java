package dr.calculate.firstEtap;

public class FirstStep {
    private static int[][] XO = new int[dr.variables.Variables.rowNames.length][dr.variables.Variables.columnNames.length];

    public void setXO(int Co, int D2, int D4, double Ch, double a1[], double a2[],
            double a1z[], double a2z[], double Cs1[], double Cs2[], double dE,
            double dEzip, double dCszip) {
       for (int i = 0; i < XO.length; i++) {
            for (int j = 0; j < XO[i].length; j++) {
                XO[i][0] = (int) Math.round(Math.sqrt((2 * Co * D2) / (Ch + a1[i] * Cs1[i] * dE)));
                XO[i][1] = (int) Math.round(Math.sqrt((2 * Co * D2) / (Ch + a2[i] * Cs2[i] * dE)));
                XO[i][2] = (int) Math.round(Math.sqrt((Co * D2) / (Ch + a1[i] * Cs1[i] * dE)));
                XO[i][3] = (int) Math.round(Math.sqrt((Co * D2) / (Ch + a2[i] * Cs2[i] * dE)));
                XO[i][4] = (int) Math.round(Math.sqrt((2 * Co * D2) / (Ch + a1z[i] * (Cs1[i] + dCszip) * dEzip)));
                XO[i][5] = (int) Math.round(Math.sqrt((2 * Co * D2) / (Ch + a2z[i] * (Cs2[i] + dCszip) * dEzip)));
                XO[i][6] = (int) Math.round(Math.sqrt((Co * D2) / (Ch + a1z[i] * (Cs1[i] + dCszip) * dEzip)));
                XO[i][7] = (int) Math.round(Math.sqrt((Co * D2) / (Ch + a2z[i] * (Cs2[i] + dCszip) * dEzip)));

                XO[i][8] = (int) Math.round(Math.sqrt((2 * Co * D4) / (Ch + a1[i] * Cs1[i] * dE)));
                XO[i][9] = (int) Math.round(Math.sqrt((2 * Co * D4) / (Ch + a2[i] * Cs2[i] * dE)));
                XO[i][10] = (int) Math.round(Math.sqrt((Co * D4) / (Ch + a1[i] * Cs1[i] * dE)));
                XO[i][11] = (int) Math.round(Math.sqrt((Co * D4) / (Ch + a2[i] * Cs2[i] * dE)));
                XO[i][12] = (int) Math.round(Math.sqrt((2 * Co * D4) / (Ch + a1z[i] * (Cs1[i] + dCszip) * dEzip)));
                XO[i][13] = (int) Math.round(Math.sqrt((2 * Co * D4) / (Ch + a2z[i] * (Cs2[i] + dCszip) * dEzip)));
                XO[i][14] = (int) Math.round(Math.sqrt((Co * D4) / (Ch + a1z[i] * (Cs1[i] + dCszip) * dEzip)));
                XO[i][15] = (int) Math.round(Math.sqrt((Co * D4) / (Ch + a2z[i] * (Cs2[i] + dCszip) * dEzip)));
            }
        }
        this.XO = XO;
    }

    public int[][] getXO() {
        return XO;
    }
    
    public void PrintResult() {
        for (String columnName : dr.variables.Variables.columnNames) {
            System.out.print(columnName + "\t");
        }
        System.out.println("");
        for (int i = 0; i < XO.length; i++) {
            for (int j = 0; j < XO[i].length; j++) {
                System.out.print(XO[i][j] + "\t");
            }
            System.out.println("[" + (i + 1) + "]");
        }
        System.out.println("");
    }   
}
