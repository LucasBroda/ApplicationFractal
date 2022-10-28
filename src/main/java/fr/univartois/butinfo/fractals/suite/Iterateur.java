package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

import java.util.Iterator;

/**
 * Création de la classe Itérateur permettant de créer un itérateur d'une suite complexe
 */
public class Iterateur implements Iterator<IComplex>{

    /**
     * Attribut permettant de fixer le nombre d'itérations de base à 0
     */
    private int nb_iterations = 0;

    /**
     * Attribut permettant de représenter le nombre max d'itérations
     */
    private final int nb_max_iterations;

    /**
     * Attribut permettant de représenter un attribut précédent dans une suite
     */
    private IComplex precedent;

    /**
     * Attribut permettant de représenter une suite complexe
     */
    ISuiteComplexe suiteComplexe;

    /**
     *
     * @param suiteComplexe
     * @param nb_max_iterations
     * constructeur de la classe Iterateur
     */
    public Iterateur(ISuiteComplexe suiteComplexe, int nb_max_iterations){
        this.suiteComplexe = suiteComplexe;
        this.nb_max_iterations = nb_max_iterations;
    }


    /**
     *
     * @return un boolean nous permettant de savoir si une suite a un élément suivant ou non
     */

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

    /**
     *
     * @return le terme suivant d'une suite
     */
    @Override
    public IComplex next() {
        if(hasNext()){
            nb_iterations++;
            this.precedent = suiteComplexe.getNext(precedent);
            return precedent;
        }
        return null;
    }

    /**
     *
     * @return le nombre d'itérations courant
     */
	public int getNbrIteration() {
		return this.nb_iterations;
	}
}

