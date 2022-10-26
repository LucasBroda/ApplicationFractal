package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

import java.util.Iterator;

public class SuiteComplexe1 implements Iterable<IComplex>{

    final int nbMaxIterations;

    public SuiteComplexe1(int nbMaxIterations){
        this.nbMaxIterations = nbMaxIterations;
    }

    public Iterator<IComplex> iterator(){
        return new Iterateur((ISuiteComplexe) this,nbMaxIterations);
    }
}
