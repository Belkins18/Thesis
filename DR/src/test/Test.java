package test;

public class Test {

    public static int arr[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

    public static int newarr[][] = new int[3][3];
    
     private static double [] mult = new double[3];

    public  void setMult(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            mult[i] = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                mult[i] = (matrix[i][j]);
            }
            System.out.println(mult[i]);
        }
        this.mult = mult;
    }

    public double [] getMult() {
        System.out.println("");
        for (int i = 0; i < mult.length; i++) {
            System.out.print(mult[i]+"\t");
        }
        return mult;
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("///////////////////");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newarr[i][j]=arr[j][i];
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                System.out.print(newarr[i][j] + "\t");
            }
            System.out.println("");
        }

        
        
        Test t =new Test();
        t.setMult(arr);
        t.getMult();
    }
}
