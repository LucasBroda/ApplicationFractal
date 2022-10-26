package fr.univartois.butinfo.fractals.complex;

import fr.univartois.butinfo.fractals.suite.ISuiteChaotique;
import fr.univartois.butinfo.fractals.suite.SuiteChaotique;

public class AttracteurFeigenbaum extends SuiteChaotique implements ISuiteChaotique {

    public AttracteurFeigenbaum(AdaptateurComplex premier, int nb_max_iterations) {
        super(premier, nb_max_iterations);
    }

    @Override
    public double getNext(IPoint point) {
        return (point.getX()*(point.getY())*(1-(point.getY())));
    }
}
