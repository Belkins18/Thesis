package dr.calculate.firstEtap;

public class SecondStep {

    private static int[][] YO = new int[dr.variables.Variables.rowNames.length][dr.variables.Variables.columnNames.length];

    public void setYO(double a1[], double a2[], int D2, int D4, double Cs1[], double Cs2[],
            double Cn[], double En, double dE, int Co, double Ch, int[][] XO) {
        for (int i = 0; i < YO.length; i++) {
            for (int j = 0; j < YO[i].length; j++) {
                YO[i][0] = (int) Math.round(a1[i] * D2 * Cs1[i] - a1[i] * D2 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D2 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D2);
                YO[i][1] = (int) Math.round(a2[i] * D2 * Cs2[i] - a2[i] * D2 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D2 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D2);
                YO[i][2] = (int) Math.round(a1[i] * D2 * Cs1[i] - a1[i] * D2 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D2 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D2);
                YO[i][3] = (int) Math.round(a2[i] * D2 * Cs2[i] - a2[i] * D2 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D2 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D2);
                YO[i][4] = (int) Math.round(a1[i] * D2 * Cs1[i] - a1[i] * D2 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D2 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D2);
                YO[i][5] = (int) Math.round(a2[i] * D2 * Cs2[i] - a2[i] * D2 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D2 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D2);
                YO[i][6] = (int) Math.round(a1[i] * D2 * Cs1[i] - a1[i] * D2 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D2 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D2);
                YO[i][7] = (int) Math.round(a2[i] * D2 * Cs2[i] - a2[i] * D2 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D2 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D2);

                YO[i][8] = (int) Math.round(a1[i] * D4 * Cs1[i] - a1[i] * D4 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D4 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D4);
                YO[i][9] = (int) Math.round(a2[i] * D4 * Cs2[i] - a2[i] * D4 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D4 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D4);
                YO[i][10] = (int) Math.round(a1[i] * D4 * Cs1[i] - a1[i] * D4 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D4 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D4);
                YO[i][11] = (int) Math.round(a2[i] * D4 * Cs2[i] - a2[i] * D4 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D4 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D4);
                YO[i][12] = (int) Math.round(a1[i] * D4 * Cs1[i] - a1[i] * D4 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D4 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D4);
                YO[i][13] = (int) Math.round(a2[i] * D4 * Cs2[i] - a2[i] * D4 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D4 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D4);
                YO[i][14] = (int) Math.round(a1[i] * D4 * Cs1[i] - a1[i] * D4 * Cs1[i] * En - a1[i] * Cs1[i] * dE * XO[i][0] / 2 - Co * D4 / XO[i][0] - Ch * XO[i][0] / 2 - Cn[i] * D4);
                YO[i][15] = (int) Math.round(a2[i] * D4 * Cs2[i] - a2[i] * D4 * Cs2[i] * En - a2[i] * Cs2[i] * dE * XO[i][1] / 2 - Co * D4 / XO[i][1] - Ch * XO[i][1] / 2 - Cn[i] * D4);
            }
        }
        this.YO = YO;
    }

    public int[][] getYO() {
        return YO;
    }
    
    public void PrintResult() {
        for (String columnName : dr.variables.Variables.columnNames) {
            System.out.print(columnName + "\t");
        }
        System.out.println("");
        for (int i = 0; i < YO.length; i++) {
            for (int j = 0; j < YO[i].length; j++) {
                System.out.print(YO[i][j] + "\t");
            }
            System.out.println("[" + (i + 1) + "]");
        }
        System.out.println("");
    }   

}
