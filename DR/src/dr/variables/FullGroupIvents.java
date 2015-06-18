package dr.variables;

public class FullGroupIvents {

    //init a1[]
    private double a1[] = new double[16];

    public void setA1(double a1plus, double a1minus) {
        int[] var = {1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < a1.length; i++) {
            if (var[i] == 1) {
                a1[i] = a1plus;
            } else {
                a1[i] = a1minus;
            }
        }
        this.a1 = a1;
    }

    public double[] getA1() {
        return a1;
    }

    public void getPrintA1() {
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + (i + 1) + "]=" + a1[i]);
        }
    }

    //init a2[]
    private double a2[] = new double[16];

    public void setA2(double a2plus, double a2minus) {
        int[] var = {1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < a2.length; i++) {
            if (var[i] == 1) {
                a2[i] = a2plus;
            } else {
                a2[i] = a2minus;
            }
        }
        this.a2 = a2;
    }

    public double[] getA2() {
        return a2;
    }

    //init a1z[]
    private double a1z[] = new double[16];

    public void setA1z(double a1plusZip, double a1minusZip) {
        int[] var = {1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < a1z.length; i++) {
            if (var[i] == 1) {
                a1z[i] = a1plusZip;
            } else {
                a1z[i] = a1minusZip;
            }
        }
        this.a1z = a1z;
    }

    public double[] getA1z() {
        return a1z;
    }

    //init a2z[]
    private double a2z[] = new double[16];

    public void setA2z(double a2plusZip, double a2minusZip) {
        int[] var = {1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0};
        for (int i = 0; i < a2z.length; i++) {
            if (var[i] == 1) {
                a2z[i] = a2plusZip;
            } else {
                a2z[i] = a2minusZip;
            }
        }
        this.a2z = a2z;
    }

    public double[] getA2z() {
        return a2z;
    }

    //init Cs1[]
    private double Cs1[] = new double[16];

    public void setCs1(double CsIl, double CsIh) {
        int[] var = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < Cs1.length; i++) {
            if (var[i] == 1) {
                Cs1[i] = CsIl;
            } else {
                Cs1[i] = CsIh;
            }
        }
        this.Cs1 = Cs1;
    }

    public double[] getCs1() {
        return Cs1;
    }

    //init Cs2[]
    private double Cs2[] = new double[16];

    public void setCs2(double CsIIl, double CsIIh) {
        int[] var = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < Cs1.length; i++) {
            if (var[i] == 1) {
                Cs2[i] = CsIIl;
            } else {
                Cs2[i] = CsIIh;
            }
        }
        this.Cs2 = Cs2;
    }

    public double[] getCs2() {
        return Cs2;
    }

    //init Cn[]
    private double Cn[] = new double[16];

    public void setCn(double Cnl, double Cnh) {
        int[] var = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < Cs1.length; i++) {
            if (var[i] == 1) {
                Cn[i] = Cnl;
            } else {
                Cn[i] = Cnh;
            }
        }
        this.Cn = Cn;
    }

    public double[] getCn() {
        return Cn;
    }
    //init D[]
//    private int D[] = new int[16];
//
//    public void setD(int D2, int D4) {
//        int[] var = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
//        for (int i = 0; i < D.length; i++) {
//            if (var[i] == 1) {
//                D[i] = D2;
//            } else {
//                D[i] = D4;
//            }
//        }
//        this.D = D;
//    }
//
//    public int[] getD() {
//        return D;
//    }
}
