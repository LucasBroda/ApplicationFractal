package fr.univartois.butinfo.fractals.suite;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

public class SuiteJulia implements ISuiteComplexe {

    private NumberComplex c = new NumberComplex(-0.4,0.6);
    private NumberComplex z;
    private int nbrMaxIteration;

    public SuiteJulia(NumberComplex z,int nbrMaxIteration ){
        this.z = z;
        this.nbrMaxIteration = nbrMaxIteration;
    }
    @Override
    public IComplex getNext(IComplex prec) {
    	if(prec == null) {
    		return (z.multiply(z)).add(c);
    	}
        return  (prec.multiply(prec)).add(c);
    }
    public Iterator<IComplex> iterator(){
        return new Iterateur(this,nbrMaxIteration);
    }
}
