package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.NumberComplex;

public class SuiteJulia extends SuiteComplexe1 implements ISuiteComplexe {

    NumberComplex c = new NumberComplex(-0.4,0.6);

    public SuiteJulia(NumberComplex premier, int nbMaxIterations) {
        super(premier, nbMaxIterations);
    }


    @Override
    public NumberComplex getNext(NumberComplex prec) {
        return (NumberComplex) prec.multiply(prec).add(c);
    }

}
