package fr.univartois.butinfo.fractals.complex;

public class NumberComplex implements IComplex {

    private final double realPart;
    private final double imaginaryPart;


    /**
     *
     * @param realPart
     * @param imaginaryPart
     */
    public NumberComplex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     *
     * @return la partie réelle du nombre
     */
    @Override
    public double getRealPart() {
        return realPart;
    }

    /**
     *
     * @return la partie imaginaire du nombre
     */
    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    /**
     *
     * @return le module du nombre
     */
    @Override
    public double abs() {
        return Math.sqrt((realPart * realPart) + (imaginaryPart * imaginaryPart));
    }

    /**
     *
     * @return l'inverse du nombre
     */
    @Override
    public IComplex negate() {
        return new NumberComplex(-this.realPart,-this.imaginaryPart);
    }


    /**
     *
     * @return le conjugué du nombre
     */
    @Override
    public IComplex conjugate() {
        return new NumberComplex(this.realPart,-this.imaginaryPart);
    }

    /**
     *
     * @param other Le nombre complexe à ajouter à ce nombre.
     *
     * @return le nombre complex avec ses nouveaux paramètres
     */
    @Override
    public IComplex add(IComplex other) {
        return new NumberComplex(this.realPart+ other.getRealPart(),this.imaginaryPart+other.getImaginaryPart());
    }

    /**
     *
     * @param other Le nombre complexe à soustraire de ce nombre.
     *
     * @return le nombre complex avec ses nouveaux paramètres
     */
    @Override
    public IComplex subtract(IComplex other) {
        return new NumberComplex(this.realPart-other.getRealPart(),this.imaginaryPart-other.getImaginaryPart());
    }

    /**
     *
     * @param value La valeur par laquelle multiplier ce nombre.
     *
     * @return le nombre complex avec ses nouveaux paramètres
     */
    @Override
    public IComplex multiply(double value) {
        return new NumberComplex(this.realPart*value,this.imaginaryPart*value);
    }

    /**
     *
     * @param other Le nombre complexe à mulitplier par ce nombre.
     *
     * @return le nombre complex avec ses nouveaux paramètres
     */
    @Override
    public IComplex multiply(IComplex other) {
        double reel = (this.realPart*other.getRealPart())-(this.imaginaryPart*other.getImaginaryPart());
        double imaginaire = (this.imaginaryPart*other.getRealPart())+(this.realPart*other.getImaginaryPart());
        return new NumberComplex(reel,imaginaire);
    }

    /**
     *
     * @param other Le nombre complexe qui divise ce nombre.
     *
     * @return le nombre complex avec ses nouveaux paramètres
     */
    @Override
    public IComplex divide(IComplex other) {
        double quotient = (other.getRealPart()*other.getRealPart())+(other.getImaginaryPart()*other.getImaginaryPart());
        double reel = (this.realPart*other.getRealPart())+(this.imaginaryPart*other.getImaginaryPart());
        double imaginaire = (this.imaginaryPart*other.getRealPart())-(this.realPart*other.getImaginaryPart()) ;
        double re = reel/quotient;
        double im = imaginaire/quotient;
        return new NumberComplex(re,im);
    }

    /**
     *
     * @return le hashcode du nombre
     */
    public int hashCode() {
        int hash = 1;
        hash = hash * 15 + (int) realPart;
        hash = hash * 16 + (int) imaginaryPart;
        return hash;
    }

    /**
     *
     * @param obj
     * @return l'égalité du nombre complex
     */
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

    /**
     *
     * @return l'affichage du nombre complexe
     */
    @Override
    public String toString() {
        return this.realPart +" "+"+"+" "+ this.imaginaryPart+"i";
    }
}
