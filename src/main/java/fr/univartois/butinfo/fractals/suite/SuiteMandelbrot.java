package fr.univartois.butinfo.fractals.suite;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

public class SuiteMandelbrot implements ISuiteComplexe {
    private NumberComplex z;
    private int nbrMaxIteration;

    public SuiteMandelbrot(NumberComplex z,int nbrMaxIteration ){
        this.z = z;
        this.nbrMaxIteration = nbrMaxIteration;
    }
    @Override
    public IComplex getNext(IComplex prec) {
    	if(prec == null) {
    		return (z.multiply(z)).add(z);
    	}
        return  (prec.multiply(prec)).add(z);
    }
    public Iterator<IComplex> iterator(){
        return new Iterateur(this,nbrMaxIteration);
    }
}
