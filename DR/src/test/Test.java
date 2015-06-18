package test;

public class Test {

    public static int arr[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

    public static int newarr[][] = new int[3][3];

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

    }
}
