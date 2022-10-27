package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.IPoint;
import fr.univartois.butinfo.fractals.suite.ISuiteChaotique;
import fr.univartois.butinfo.fractals.suite.SuiteChaotique;

import java.util.Iterator;

public class AttracteurFeigenbaum extends SuiteChaotique implements ISuiteChaotique {

    private IPoint depart;

    public AttracteurFeigenbaum(int nb_max_iterations) {
        super(nb_max_iterations);
    }

    @Override
    public double getNext(IPoint precedent) {
        if(precedent == null){
            return (depart.getX()*(depart.getY())*(1-(depart.getY())));
        }
        return (precedent.getX()*(precedent.getY())*(1-(precedent.getY())));
    }

    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,this);
    }
}
