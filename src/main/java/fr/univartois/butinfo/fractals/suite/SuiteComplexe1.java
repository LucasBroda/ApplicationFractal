package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

import java.util.Iterator;

/**
 *Création de la classe SuiteComplexe1 qui implémante un itérateur pour les suites complexes
 */
public class SuiteComplexe1 implements Iterable<IComplex>{

    /**
     * On crée un attribut représentant le nombre max d'itérations de la suite
     */
    final int nbMaxIterations;

    /**
     * On crée son constructeur
     * @param nbMaxIterations
     */
    public SuiteComplexe1(int nbMaxIterations){
        this.nbMaxIterations = nbMaxIterations;
    }

    /**
     *
     * @return des itérations de la suite choisie
     */
    public Iterator<IComplex> iterator(){
        return new Iterateur((ISuiteComplexe) this,nbMaxIterations);
    }
}
