package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.util.Iterator;

public abstract class SuiteChaotique implements ISuiteChaotique, Iterable<Double> {

    private final IPoint premier;

    private final int nb_max_iterations;

    public SuiteChaotique(IPoint premier, int nb_max_iterations){
        this.premier = premier;
        this.nb_max_iterations = nb_max_iterations;
    }
    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,premier,this);
    }

}
