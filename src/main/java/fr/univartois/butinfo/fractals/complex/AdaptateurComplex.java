package fr.univartois.butinfo.fractals.complex;

public class AdaptateurComplex implements IPoint{

    NumberComplex complex;

    public AdaptateurComplex(NumberComplex complex) {
        this.complex = complex;
    }

    public AdaptateurComplex(double x, double y) {
    }

    @Override
    public double getX() {
        return complex.getRealPart();
    }

    @Override
    public double getY() {
        return complex.getImaginaryPart();
    }

    public double distance(IPoint point){
        return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow((getY()-point.getY()),2));
    }

    public NumberComplex convertion(){
        return new NumberComplex(getX(),getY());
    }
}
