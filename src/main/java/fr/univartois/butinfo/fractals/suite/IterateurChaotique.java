package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.util.Iterator;

public class IterateurChaotique implements Iterator<Double> {
    private int nb_iterations = 0;
    private int nb_max_iterations;

    private IPoint precedent;
    ISuiteChaotique suiteChaotique;

    public IterateurChaotique(int nb_max_iterations, ISuiteChaotique suiteChaotique){
        this.nb_max_iterations = nb_max_iterations;
        this.suiteChaotique = suiteChaotique;
    }



    public boolean hasNext(){
        if(nb_iterations == nb_max_iterations){
            return false;
        }
        return true;
    }

    @Override
    public Double next() {
        if(hasNext()){
            nb_iterations ++;
            return suiteChaotique.getNext(precedent);
        }
        return null;
    }



}
