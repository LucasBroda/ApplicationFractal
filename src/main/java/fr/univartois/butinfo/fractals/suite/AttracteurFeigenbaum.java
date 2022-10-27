package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.IPoint;
import fr.univartois.butinfo.fractals.suite.ISuiteChaotique;
import fr.univartois.butinfo.fractals.suite.SuiteChaotique;

import java.util.Iterator;

public class AttracteurFeigenbaum extends SuiteChaotique implements ISuiteChaotique {

    public AttracteurFeigenbaum(int nb_max_iterations) {
        super(nb_max_iterations);
    }

    @Override
    public double getNext(IPoint point) {
        return (point.getX()*(point.getY())*(1-(point.getY())));
    }

    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,this);
    }
}
