package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

public interface ISuiteComplexe {
    IComplex getNext(IComplex precedent);
}

