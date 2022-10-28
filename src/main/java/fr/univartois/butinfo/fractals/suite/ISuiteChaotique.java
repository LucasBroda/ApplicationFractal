package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IPoint;

/**
 * Création de l'interface ISuiteChaotique permettant de représenter des suites chaotiques
 */
public interface ISuiteChaotique {

    /**
     *
     * @param point
     * @return l'élement suivant de la suite en fonction de la position du point passé en paramètre
     */
    double getNext(IPoint point);
}
