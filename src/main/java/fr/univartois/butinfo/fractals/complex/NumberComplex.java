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
        return null;
    }

    @Override
    public IComplex conjugate() {
        return null;
    }

    @Override
    public IComplex add(IComplex other) {
        return null;
    }

    @Override
    public IComplex subtract(IComplex other) {
        return null;
    }

    @Override
    public IComplex multiply(double value) {
        return null;
    }

    @Override
    public IComplex multiply(IComplex other) {
        return null;
    }

    @Override
    public IComplex divide(IComplex other) {
        return null;
    }

    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + (int) realPart;
        hash = hash * 31 + (int) imaginaryPart;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
