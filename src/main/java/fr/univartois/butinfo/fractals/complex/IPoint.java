package fr.univartois.butinfo.fractals.complex;

public interface IPoint {

   double getX();
   double getY();

   default double distance(IPoint point){
      return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow((getY()-point.getY()),2));
   }

   default IComplex convertion(){
      return new NumberComplex(getX(),getY());
   }




}
