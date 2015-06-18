package dr.variables;

public class Variables {
//==============================================================================
    //=== Input model data ===//

    private static int D2;//= 32000;
    private static int D4;//= 42000;
    private static double Ch;//= 4.97;
    private static int Co; //= 12;
    private static double Cnl; //= 19.79;
    private static double Cnh; //= 21.77;
    private static double dCnzip;//= 0.857;
    private static double dCszip; //= 1.03;
    private static double CsIl; //= 23.75;
    private static double CsIh; //= 27.31;
    private static double CsIIl; //= 27;
    private static double CsIIh; //= 30.52;

    /**
     *
     * @param D2
     */
    public void setD2(int D2) {
        Variables.D2 = D2;
    }

    public int getD2() {
        return D2;
    }

    /**
     *
     * @param D4
     */
    public void setD4(int D4) {
        Variables.D4 = D4;
    }

    public int getD4() {
        return D4;
    }

    /**
     *
     * @param Ch
     */
    public void setCh(double Ch) {
        Variables.Ch = Ch;
    }

    public double getCh() {
        return Ch;
    }

    /**
     *
     * @param Co
     */
    public void setCo(int Co) {
        Variables.Co = Co;
    }

    public int getCo() {
        return Co;
    }

    /**
     *
     * @param Cnl
     */
    public void setCnl(double Cnl) {
        Variables.Cnl = Cnl;
    }

    public double getCnl() {
        return Cnl;
    }

    /**
     *
     * @param Cnh
     */
    public void setCnh(double Cnh) {
        Variables.Cnh = Cnh;
    }

    public double getCnh() {
        return Cnh;
    }

    /**
     *
     * @param dCnzip
     */
    public void setdCnzip(double dCnzip) {
        Variables.dCnzip = dCnzip;
    }

    public double getdCnzip() {
        return dCnzip;
    }

    /**
     *
     * @param dCszip
     */
    public void setdCszip(double dCszip) {
        Variables.dCszip = dCszip;
    }

    public double getdCszip() {
        return dCszip;
    }

    /**
     *
     * @param CsIl
     */
    public void setCsIl(double CsIl) {
        Variables.CsIl = CsIl;
    }

    public double getCsIl() {
        return CsIl;
    }

    /**
     *
     * @param CsIh
     */
    public void setCsIh(double CsIh) {
        Variables.CsIh = CsIh;
    }

    public double getCsIh() {
        return CsIh;
    }

    /**
     *
     * @param CsIIl
     */
    public void setCsIIl(double CsIIl) {
        Variables.CsIIl = CsIIl;
    }

    public double getCsIIl() {
        return CsIIl;
    }

    /**
     *
     * @param CsIIh
     */
    public void setCsIIh(double CsIIh) {
        Variables.CsIIh = CsIIh;
    }

    public double getCsIIh() {
        return CsIIh;
    }
//==============================================================================
    //alpha paramerts
    private double a1plus; //= 0.98;
    private double a1plusZip; //= 1.0;
    private double a1minus;//= 0.94;
    private double a1minusZip; //= 0.96;

    private double a2plus; //= 0.95;
    private double a2plusZip; //= 1.0;
    private double a2minus; //= 0.85;
    private double a2minusZip; //= 0.9;

    /**
     *
     * @param a1plus
     */
    public void setA1plus(double a1plus) {
        this.a1plus = a1plus;
    }

    public double getA1plus() {
        return a1plus;
    }

    /**
     *
     * @param a1plusZip
     */
    public void setA1plusZip(double a1plusZip) {
        this.a1plusZip = a1plusZip;
    }

    public double getA1plusZip() {
        return a1plusZip;
    }

    /**
     *
     * @param a1minus
     */
    public void setA1minus(double a1minus) {
        this.a1minus = a1minus;
    }

    public double getA1minus() {
        return a1minus;
    }

    /**
     *
     * @param a1minusZip
     */
    public void setA1minusZip(double a1minusZip) {
        this.a1minusZip = a1minusZip;
    }

    public double getA1minusZip() {
        return a1minusZip;
    }

    /**
     *
     * @param a2plus
     */
    public void setA2plus(double a2plus) {
        this.a2plus = a2plus;
    }

    public double getA2plus() {
        return a2plus;
    }

    /**
     *
     * @param a2plusZip
     */
    public void setA2plusZip(double a2plusZip) {
        this.a2plusZip = a2plusZip;
    }

    public double getA2plusZip() {
        return a2plusZip;
    }

    /**
     *
     * @param a2minus
     */
    public void setA2minus(double a2minus) {
        this.a2minus = a2minus;
    }

    public double getA2minus() {
        return a2minus;
    }

    /**
     *
     * @param a2minusZip
     */
    public void setA2minusZip(double a2minusZip) {
        this.a2minusZip = a2minusZip;
    }

    public double getA2minusZip() {
        return a2minusZip;
    }

//==============================================================================
    private double En; //= 0.002;
    private double Enzip; //= 0.001;
    private double dE; //= 0.0365;
    private double dEzip; //= 0.0183;

    /**
     *
     * @param En
     */
    public void setEn(double En) {
        this.En = En;
    }

    public double getEn() {
        return En;
    }

    /**
     *
     * @param Enzip
     */
    public void setEnzip(double Enzip) {
        this.Enzip = Enzip;
    }

    public double getEnzip() {
        return Enzip;
    }

    /**
     *
     * @param dE
     */
    public void setdE(double dE) {
        this.dE = dE;
    }

    public double getdE() {
        return dE;
    }

    /**
     *
     * @param dEzip
     */
    public void setdEzip(double dEzip) {
        this.dEzip = dEzip;
    }

    public double getdEzip() {
        return dEzip;
    }
//==============================================================================
    public static String[] columnNames = {"x1", "x2", "x3.1", "x3.2", "x4", "x5",
        "x6.1", "x6.2", "x7", "x8", "x9.1", "x9.2", "x10", "x11", "x12.1", "x12.2"};
    public static String[] columnNames2 = {"x1", "x2", "x3", "x4", "x5", "x6",
        "x7", "x8", "x9", "x10", "x11", "x12"};
    public static String[] columnNames3 = {"F1", "F2", "F3", "F4", "F5", "F6",
        "F7", "F8", "F9", "F10", "F11", "F12"};
     public static String[] rowNames = {"omega-1", "omega-2", "omega-3", "omega-4",
        "omega-5", "omega-6", "omega-7", "omega-8",
        "omega-9", "omega-10", "omega-11", "omega-12",
        "omega-13", "omega-14", "omega-15", "omega-16"};
}
