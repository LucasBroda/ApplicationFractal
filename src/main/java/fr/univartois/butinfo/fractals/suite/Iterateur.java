package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

import java.util.Iterator;

public class Iterateur implements Iterator<IComplex>{

    private int nb_iterations = 0;

    private final int nb_max_iterations;

    private IComplex precedent;

    ISuiteComplexe suiteComplexe;

    public Iterateur(ISuiteComplexe suiteComplexe, int nb_max_iterations){
        this.suiteComplexe = suiteComplexe;
        this.nb_max_iterations = nb_max_iterations;
    }



    @Override
    public boolean hasNext() {
    	if(nb_iterations == 0) {
    		return true;
    	}
    	else if((nb_iterations == nb_max_iterations)||(precedent.abs()>2)) {
            return false;
        }
        return true;
    }
    @Override
    public IComplex next() {
        if(hasNext()){
            nb_iterations++;
            this.precedent = suiteComplexe.getNext(precedent);
            return precedent;
        }
        return null;
    }
	public int getNbrIteration() {
		return this.nb_iterations;
	}
}

