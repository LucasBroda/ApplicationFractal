package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.util.Iterator;

/**
 * Création de la classe suiteChaotique permettant d'itérer une suite en implémentant l'itérateur précèdemment créé
 */
public abstract class SuiteChaotique implements ISuiteChaotique, Iterable<Double> {

    /**
     * Attribut permettant de représenter le nombre max d'itérations
     */
    protected final int nb_max_iterations;

    /**
     *
     * @param nb_max_iterations
     * Constructeur de la classe SuiteChaotique
     */
    public SuiteChaotique(int nb_max_iterations){
        this.nb_max_iterations = nb_max_iterations;
    }

    /**
     *
     * @return des itérations de la suite demandée
     */
    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,this);
    }

}
