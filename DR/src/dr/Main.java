package dr;

import dr.calculate.firstEtap.FirstStep;
import dr.calculate.firstEtap.SecondStep;
import dr.calculate.firstEtap.ThirdStep;
import dr.calculate.firstEtap.TranstormMatrix;
import dr.calculate.secondtEtap.BLCriteria;
import dr.calculate.secondtEtap.GCriteria;
import dr.calculate.secondtEtap.HLCriteria;
import dr.calculate.secondtEtap.HWCriteria;
import dr.calculate.secondtEtap.MMCriteria;
import dr.calculate.secondtEtap.MinusMatrix;
import dr.calculate.secondtEtap.MultCriteria;
import dr.calculate.secondtEtap.SCriteria;
import dr.variables.FullGroupIvents;
import dr.variables.Variables;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        dr.variables.Variables variables = new Variables();
        //=== Input model data ===//
        variables.setD2(32000);
        variables.setD4(42000);
        variables.setCh(4.97);
        variables.setCo(12);
        variables.setCnl(19.79);
        variables.setCnh(21.77);
        variables.setdCnzip(0.857);
        variables.setdCszip(1.03);
        variables.setCsIl(23.75);
        variables.setCsIh(27.31);
        variables.setCsIIl(27.00);
        variables.setCsIIh(30.52);
        //alpha paramerts
        variables.setA1plus(0.98);
        variables.setA1plusZip(1.0);
        variables.setA1minus(0.94);
        variables.setA1minusZip(0.96);

        variables.setA2plus(0.95);
        variables.setA2plusZip(1.0);
        variables.setA2minus(0.85);
        variables.setA2minusZip(0.9);
        //
        variables.setEn(0.002);
        variables.setEnzip(0.001);
        variables.setdE(0.0365);
        variables.setdEzip(0.0183);
//==============================================================================
        dr.variables.FullGroupIvents fullGroupIvents = new FullGroupIvents();
        fullGroupIvents.setA1(variables.getA1plus(), variables.getA1minus());
        fullGroupIvents.setA2(variables.getA2plus(), variables.getA2minus());
        fullGroupIvents.setA1z(variables.getA1plusZip(), variables.getA1minus());
        fullGroupIvents.setA2z(variables.getA2plusZip(), variables.getA2minusZip());

        fullGroupIvents.setCs1(variables.getCsIl(), variables.getCsIh());
        fullGroupIvents.setCs2(variables.getCsIIl(), variables.getCsIIh());
        fullGroupIvents.setCn(variables.getCnl(), variables.getCnh());

//        fullGroupIvents.setD(variables.getD2(), variables.getD4());
        System.out.println("a1 = " + Arrays.toString(fullGroupIvents.getA1()) + ";");
        System.out.println("a2 = " + Arrays.toString(fullGroupIvents.getA2()) + ";");
        System.out.println("a1z = " + Arrays.toString(fullGroupIvents.getA1z()) + ";");
        System.out.println("a2z = " + Arrays.toString(fullGroupIvents.getA2z()) + ";");
        System.out.println("");
        System.out.println("Cs1 = " + Arrays.toString(fullGroupIvents.getCs1()) + ";");
        System.out.println("Cs2 = " + Arrays.toString(fullGroupIvents.getCs2()) + ";");
        System.out.println("Cn = " + Arrays.toString(fullGroupIvents.getCn()) + ";");
//        System.out.println("D = " + Arrays.toString(fullGroupIvents.getD()) + ";");
        System.out.println("");
        System.out.print("//==============================================================================" + "\n");
//==============================================================================
        dr.calculate.firstEtap.FirstStep fs = new FirstStep();
        fs.setXO(variables.getCo(), variables.getD2(), variables.getD4(), variables.getCh(),
                fullGroupIvents.getA1(), fullGroupIvents.getA2(), fullGroupIvents.getA1z(), fullGroupIvents.getA2z(),
                fullGroupIvents.getCs1(), fullGroupIvents.getCs2(),
                variables.getdE(), variables.getdEzip(), variables.getdCszip());
//        System.out.println(Arrays.deepToString(fs.getXO()));
        fs.PrintResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        dr.calculate.firstEtap.SecondStep ss = new SecondStep();
        ss.setYO(fullGroupIvents.getA1(), fullGroupIvents.getA2(), variables.getD2(), variables.getD4(),
                fullGroupIvents.getCs1(), fullGroupIvents.getCs2(), fullGroupIvents.getCn(),
                variables.getEn(), variables.getdE(), variables.getCo(), variables.getCh(),
                fs.getXO());
//        System.out.println(Arrays.deepToString(ss.getYO()));
        ss.PrintResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================     
         dr.calculate.firstEtap.ThirdStep ts = new ThirdStep();
         ts.setZO(fullGroupIvents.getA1(), fullGroupIvents.getA2(), variables.getD2(), variables.getD4(),
                fullGroupIvents.getCs1(), fullGroupIvents.getCs2(), fullGroupIvents.getCn(),
                variables.getEn(), variables.getdE(), variables.getCo(), variables.getCh(),
                fs.getXO());
//        System.out.println(Arrays.deepToString(ts.getZO()));
        ts.PrintResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        dr.calculate.firstEtap.TranstormMatrix tm = new TranstormMatrix();
        tm.setTM(ts.getZO());
        tm.PrintResult();
        System.out.println("//==============================================================================" + "\n");        
//==============================================================================        
        System.out.println("//=== MiniMax Criteria ===" + "\n");
        MMCriteria mmCriteria = new MMCriteria();
        mmCriteria.setMinI(tm.getTM());
        mmCriteria.setRes(mmCriteria.getMinI());
        mmCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        System.out.println("//=== BL Criteria ===" + "\n");
        BLCriteria blCriteria = new BLCriteria();
        blCriteria.setSumeqI(tm.getTM());
        blCriteria.setRes(blCriteria.getSumeqI());
        blCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        System.out.println("//=== S Criteria ===" + "\n");
        SCriteria sCriteria = new SCriteria();
        sCriteria.setMaxJ(tm.getTM());
//        sCriteria.getMaxJ();
        sCriteria.setMatrixZal(tm.getTM(), sCriteria.getMaxJ());
//        sCriteria.PrintResult(sCriteria.getMatrixZal());
        sCriteria.setER(sCriteria.getMatrixZal());
        sCriteria.setResult(sCriteria.getER());
        sCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        System.out.println("//=== HW Criteria ===" + "\n");
        HWCriteria hwCriteria = new HWCriteria();
        hwCriteria.setMinI(tm.getTM());
        hwCriteria.setMaxI(tm.getTM());
        hwCriteria.setEr(hwCriteria.getMinI(), hwCriteria.getMaxI());
        hwCriteria.setRes(hwCriteria.getEr());
        hwCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
        System.out.println("//=== HL Criteria ===" + "\n");
        HLCriteria hLCriteria = new HLCriteria();
        hLCriteria.setSumeqI(tm.getTM());
        hLCriteria.setMinI(tm.getTM());
        hLCriteria.setEr(hLCriteria.getSumeqI(), hLCriteria.getMinI());
        hLCriteria.setRes(hLCriteria.getEr());
        hLCriteria.getResult();
        System.out.println("//==============================================================================" + "\n");
//==============================================================================
         System.out.println("//=== G Criteria ===" + "\n");
         GCriteria gCriteria = new GCriteria();
         MinusMatrix minusMatrix = new MinusMatrix();
         minusMatrix.setMinusMatrix(tm.getTM());
         gCriteria.setInputValue(minusMatrix.getMinusMatrix());
//         gCriteria.setInputValue(tm.getTM());
         gCriteria.setMinI(gCriteria.getInputValue());
         System.out.println(Arrays.deepToString(gCriteria.getInputValue()));
         gCriteria.setRes(gCriteria.getMinI());
         gCriteria.getResult();
//==============================================================================
         System.out.println("//=== П Criteria ===" + "\n");
         MultCriteria multCriteria = new MultCriteria();
         multCriteria.setA(minusMatrix.getMinusMatrix());
//         multCriteria.setA(tm.getTM());
         multCriteria.getA();
         multCriteria.setMatrix(minusMatrix.getMinusMatrix(), multCriteria.getA());
//         multCriteria.getMatrix();
         multCriteria.setMult(multCriteria.getMatrix());
         multCriteria.getMult();
//==============================================================================
         MainForm form = new MainForm();
         form.setVisible(true);
    }
}
