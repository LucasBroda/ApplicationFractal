package fr.univartois.butinfo.fractals.complex;

public class NumberComplex implements IComplex {

    private final double realPart;
    private final double imaginaryPart;


    public NumberComplex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public double abs() {
        return Math.sqrt((realPart * realPart) + (imaginaryPart * imaginaryPart));
    }

    @Override
    public IComplex negate() {
        return new NumberComplex(-this.realPart,-this.imaginaryPart);
    }


    @Override
    public IComplex conjugate() {
        return new NumberComplex(this.realPart,-this.imaginaryPart);
    }

    @Override
    public IComplex add(IComplex other) {
        return new NumberComplex(this.realPart+ other.getRealPart(),this.imaginaryPart+other.getImaginaryPart());
    }

    @Override
    public IComplex subtract(IComplex other) {
        return new NumberComplex(this.realPart-other.getRealPart(),this.imaginaryPart-other.getImaginaryPart());
    }

    @Override
    public IComplex multiply(double value) {
        return new NumberComplex(this.realPart*value,this.imaginaryPart*value);
    }

    @Override
    public IComplex multiply(IComplex other) {
        double reel = (this.realPart*other.getRealPart())-(this.imaginaryPart*other.getImaginaryPart());
        double imaginaire = (this.imaginaryPart*other.getImaginaryPart())-(this.realPart*other.getRealPart());
        return new NumberComplex(reel,imaginaire);
    }
    @Override
    public IComplex divide(IComplex other) {
        double quotient = (other.getRealPart()*other.getRealPart())+(other.getImaginaryPart()*other.getImaginaryPart());
        double reel = (this.realPart*other.getRealPart())+(this.imaginaryPart*other.getImaginaryPart());
        double imaginaire = (this.imaginaryPart*other.getRealPart())-(this.realPart*other.getImaginaryPart()) ;
        double re = reel/quotient;
        double im = imaginaire/quotient;
        return new NumberComplex(re,im);
    }

    public int hashCode() {
        int hash = 1;
        hash = hash * 15 + (int) realPart;
        hash = hash * 16 + (int) imaginaryPart;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        NumberComplex other = (NumberComplex) obj;
        IComplex diff = this.subtract(other);
        return diff.abs()<=0.0001;
    }

    @Override
    public String toString() {
        return this.realPart +" "+"+"+" "+ this.imaginaryPart+"i";
    }
}
