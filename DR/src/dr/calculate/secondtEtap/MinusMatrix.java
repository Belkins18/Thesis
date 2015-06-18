package dr.calculate.secondtEtap;

public class MinusMatrix {

    private int[][] MinusMatrix = new int[dr.variables.Variables.rowNames.length][dr.variables.Variables.columnNames2.length];

    public void setMinusMatrix(int[][] ZO) {
        
        int[][] matrix = ZO;
        for (int i = 0; i < MinusMatrix.length; i++) {
            for (int j = 0; j < MinusMatrix[i].length; j++) {
                MinusMatrix[i][j] = matrix[i][j] * (-1);
            }
        }
        this.MinusMatrix = MinusMatrix;
    }

    public int[][] getMinusMatrix() {
        return MinusMatrix;
    }
    public void getPrintResult() {
        for (String columnName : dr.variables.Variables.columnNames2) {
            System.out.print(columnName + "\t");
        }
        System.out.println("");
        for (int i = 0; i < MinusMatrix.length; i++) {
            for (int j = 0; j < MinusMatrix[i].length; j++) {
                System.out.print(MinusMatrix[i][j] + "\t");
            }
            System.out.println("[" + (i + 1) + "]");
        }
        System.out.println("");
    }   
}
