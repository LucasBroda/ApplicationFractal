package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.IPoint;

public class SuiteChaotique implements ISuiteChaotique{

    private int nb_iterations;
    private int nb_max_iterations;

    private final AdaptateurComplex precedent;

    ISuiteChaotique suiteChaotique;

    public SuiteChaotique(int nb_iterations,int nb_max_iterations,AdaptateurComplex precedent, ISuiteChaotique suiteChaotique){
        this.nb_iterations = nb_iterations;
        this.nb_max_iterations = nb_max_iterations;
        this.precedent = precedent;
        this.suiteChaotique = suiteChaotique;
    }

    public boolean hasNext(){
        if(nb_iterations == nb_max_iterations){
            return false;
        }
        return true;
    }
    @Override
    public AdaptateurComplex getNext(IPoint point) {
        if(hasNext()){
            nb_iterations ++;
            return suiteChaotique.getNext(precedent);
        }
        return null;
    }
}
