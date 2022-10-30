package fr.univartois.butinfo.fractals.complex;

/**
 * Création de l'interface permettant de représenter un point
 */
public interface IPoint {

   /**
    *
    * @return l'abscisse du point
    */
   double getX();

   /**
    *
    * @return l'ordonnée du point
    */
   double getY();

   /**
    *
    * @param point
    * @return la distance entre deux points
    */
   default double distance(IPoint point){
      return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow((getY()-point.getY()),2));
   }

   /**
    * Permet de convertir un point en nombre complexe
    * @return une instance de NumberComplex avec en paramètres les coordonnées du point
    */
   default IComplex convertion(){
      return new NumberComplex(getX(),getY());
   }




}
