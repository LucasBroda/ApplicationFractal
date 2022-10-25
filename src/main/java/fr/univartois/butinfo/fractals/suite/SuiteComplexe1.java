package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

import java.util.Iterator;

public class SuiteComplexe1 implements Iterable<IComplex>{

    private final NumberComplex premier;
    private final int nbMaxIterations;

    public SuiteComplexe1(NumberComplex premier,int nbMaxIterations){
        this.nbMaxIterations = nbMaxIterations;
        this.premier = premier;
    }

    public Iterator<IComplex> iterator(){
        return new Iterateur((ISuiteComplexe) this,nbMaxIterations,premier);
    }
}