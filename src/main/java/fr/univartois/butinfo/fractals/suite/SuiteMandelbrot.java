package fr.univartois.butinfo.fractals.suite;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

/**
 * Création de la classe permettant de représenter la suite de Mandelbrot
 */
public class SuiteMandelbrot implements ISuiteComplexe {

    /**
     * Le nombre complexe z
     */
    private NumberComplex z;

    /**
     * Le nombre max d'itérations de la suite Mandelbrot
     */
    private int nbrMaxIteration;

    /**
     * Le constructeur de notre classe
     * @param z
     * @param nbrMaxIteration
     */
    public SuiteMandelbrot(NumberComplex z,int nbrMaxIteration ){
        this.z = z;
        this.nbrMaxIteration = nbrMaxIteration;
    }

    /**
     * L'implémentation de la méthode getNext(), on utilisera toujours l'élément précédent de la suite pour déterminer le prochain
     * @param prec
     * @return
     */
    @Override
    public IComplex getNext(IComplex prec) {
    	if(prec == null) {
    		return (z.multiply(z)).add(z);
    	}
        return  (prec.multiply(prec)).add(z);
    }

    /**
     *
     * @return des itérations de la suite de Mandelbrot
     */
    public Iterator<IComplex> iterator(){
        return new Iterateur(this,nbrMaxIteration);
    }
}
