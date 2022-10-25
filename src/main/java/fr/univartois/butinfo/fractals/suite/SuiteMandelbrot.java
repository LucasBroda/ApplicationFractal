package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.NumberComplex;

public class SuiteMandelbrot extends SuiteComplexe1 implements ISuiteComplexe {

    public SuiteMandelbrot(NumberComplex premier, int nbMaxIterations) {
        super(premier, nbMaxIterations);
    }

    @Override
    public NumberComplex getNext(NumberComplex prec) {
        return (NumberComplex) prec.multiply(prec).add(prec);
    }

}

