package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

/**
 * Création de l'interface ISuiteComplexe permettant de représenter des suites complexes
 */
public interface ISuiteComplexe {
    /**
     *
     * @param precedent
     * @return l'élement suivant de la liste en fonction de la position de precedent
     */
    IComplex getNext(IComplex precedent);
}

