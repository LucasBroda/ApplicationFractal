package fr.univartois.butinfo.fractals.complex;

/**
 * La classe permettant de créer l'adaptateur
 */
public class AdaptateurComplex implements IPoint{

    /**
     * On crée un attribut représentant un nombre complexe
     */
    NumberComplex complex;

    /**
     * Le constructeur de la classe
     * @param complex
     */
    public AdaptateurComplex(NumberComplex complex) {
        this.complex = complex;
    }

    /**
     * Un constructeur permettant de retournant une instance d'AdapteurComplex avec des points en paramètres
     * @param x
     * @param y
     */
    public AdaptateurComplex(double x, double y) {
    }

    /**
     *
     * @return l'abscisse du nombre complexe, ici, pour représenter l'abscisse, on prendra la partie réelle du nombre complexe
     */
    @Override
    public double getX() {
        return complex.getRealPart();
    }

    /**
     *
     * @return l'ordonnée du nombre complexe, pour la représenter, on prendra la partie imaginaire du nombre complexe
     */
    @Override
    public double getY() {
        return complex.getImaginaryPart();
    }

    /**
     *
     * @param point
     * @return la distance entre deux points
     */
    public double distance(IPoint point){
        return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow((getY()-point.getY()),2));
    }

    /**
     * Méthode permettant de convertir un point en nombre complexe
     * @return une instance de NumberComplex avec en paramètre les coordonnées d'un point
     */
    public NumberComplex convertion(){
        return new NumberComplex(getX(),getY());
    }
}
