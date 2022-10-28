package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.IPoint;
import fr.univartois.butinfo.fractals.suite.ISuiteChaotique;
import fr.univartois.butinfo.fractals.suite.SuiteChaotique;

import java.util.Iterator;


/**
 * Classe permettant de représenter la suite de Feigenbaum via l'interface ISuiteChaotique
 */
public class AttracteurFeigenbaum extends SuiteChaotique implements ISuiteChaotique {

    /**
     * Attribut équivalent à x0/premier terme de la suite
     */
    private IPoint depart;

    /**
     * Super constructeur de la classe SuiteChaotique
     * @param nb_max_iterations
     */
    public AttracteurFeigenbaum(int nb_max_iterations) {
        super(nb_max_iterations);
    }

    /**
     *
     * @param precedent
     * @return l'élement suivant de la liste
     * La condition nous sert à vérifier si nous sommes au premier terme de la suite
     */
    @Override
    public double getNext(IPoint precedent) {
        if(precedent == null){
            return (depart.getX()*(depart.getY())*(1-(depart.getY())));
        }
        return (precedent.getX()*(precedent.getY())*(1-(precedent.getY())));
    }

    /**
     *
     * @return des itérations de la suite chaotique passée en paramètres
     */
    @Override
    public Iterator<Double> iterator() {
        return new IterateurChaotique(nb_max_iterations,this);
    }
}
