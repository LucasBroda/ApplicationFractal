package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.util.Iterator;

/**
 * Création de la classe IterateurChaotique permettant de créer un itérateur des suites chaotiques, prenant des points en paramètre
 **/
public class IterateurChaotique implements Iterator<Double> {

    /**
     * Attribut permettant de fixer le nombre d'itérations de base à 0
     */
    private int nb_iterations = 0;

    /**
     * Attribut permettant de représenter le nombre max d'itérations de la suite
     */
    private int nb_max_iterations;

    /**
     * Attribut représentant le point précédent d'une suite
     */
    private IPoint precedent;

    /**
     * Permet de représenter une suite chaotique
     */
    ISuiteChaotique suiteChaotique;

    /**
     *
     * @param nb_max_iterations
     * @param suiteChaotique
     * Constructeur de la classe IterateurChaotique
     */
    public IterateurChaotique(int nb_max_iterations, ISuiteChaotique suiteChaotique){
        this.nb_max_iterations = nb_max_iterations;
        this.suiteChaotique = suiteChaotique;
    }


    /**
     *
     * @return boolean permettant de savoir si une suite possède un élément suivant
     */
    public boolean hasNext(){
        if(nb_iterations == nb_max_iterations){
            return false;
        }
        return true;
    }

    /**
     *
     * @return l'élément suivant de la liste
     */
    @Override
    public Double next() {
        if(hasNext()){
            nb_iterations ++;
            return suiteChaotique.getNext(precedent);
        }
        return null;
    }



}
