package fr.univartois.butinfo.fractals.complex;

import java.util.Iterator;

public class Iterateur implements Iterator<IComplex>{

    private static int nb_iterations = 0;

    private final int nb_max_iterations;

    private final NumberComplex precedent;

    ISuiteComplexe suiteComplexe;

    public Iterateur(ISuiteComplexe suiteComplexe, int nb_max_iterations, NumberComplex precedent){
        this.suiteComplexe = suiteComplexe;
        this.nb_max_iterations = nb_max_iterations;
        this.precedent = precedent;
    }

    @Override
    public boolean hasNext() {
        if(nb_iterations == nb_max_iterations || suiteComplexe.getNext(precedent).abs()>2){
            return false;
        }
        return true;
    }

    @Override
    public IComplex next() {
        if(hasNext()){
            nb_iterations++;
            return suiteComplexe.getNext(precedent);
        }
        return null;

    }
}

