package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.util.Iterator;

public class SuiteCirculaire extends SuiteChaotique implements ISuiteChaotique{

    public static double PI = 3.14;

    public SuiteCirculaire(IPoint premier, int nb_max_iterations) {
        super(nb_max_iterations);
    }

    @Override
    public double getNext(IPoint point) {
        return point.getY()+(point.getX()*Math.sin(2*PI*point.getY())/2*PI)+1/3;
    }

    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,this);
    }
}
