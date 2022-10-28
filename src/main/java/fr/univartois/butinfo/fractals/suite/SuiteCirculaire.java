package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.util.Iterator;

public class SuiteCirculaire extends SuiteChaotique implements ISuiteChaotique{

    private IPoint depart;
    public static double PI = 3.14;

    public SuiteCirculaire(int nb_max_iterations) {
        super(nb_max_iterations);
    }

    @Override
    public double getNext(IPoint precedent) {
        if(precedent == null){
            return depart.getY()+(depart.getX()*Math.sin(2*PI*depart.getY())/2*PI)+1/3;
        }
        return precedent.getY()+(precedent.getX()*Math.sin(2*PI*precedent.getY())/2*PI)+1/3;
    }

    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,this);
    }
}
