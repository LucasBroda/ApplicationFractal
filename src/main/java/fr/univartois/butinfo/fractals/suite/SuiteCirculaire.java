package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.util.Iterator;

/**
 * Création de la classe suiteCirculaire permettant de représenter une suite circulaire
 */
public class SuiteCirculaire extends SuiteChaotique implements ISuiteChaotique{

    /**
     * Attribut permettant de représenter le point de départ
     */
    private IPoint depart;

    /**
     * Création d'une constante représentant PI
     */
    public static double PI = 3.14;

    /**
     *
     * @param nb_max_iterations
     * Super constructeur de la classe suiteChaotique
     */
    public SuiteCirculaire(int nb_max_iterations) {
        super(nb_max_iterations);
    }

    /**
     *
     * @param precedent
     * @return l'élément suivant de la suite circulaire
     */
    @Override
    public double getNext(IPoint precedent) {
        if(precedent == null){
            return depart.getY()+(depart.getX()*Math.sin(2*PI*depart.getY())/2*PI)+1/3;
        }
        return precedent.getY()+(precedent.getX()*Math.sin(2*PI*precedent.getY())/2*PI)+1/3;
    }

    /**
     *
     * @return des itérations de la suite circulaire
     */
    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,this);
    }
}
