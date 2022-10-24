package fr.univartois.butinfo.fractals.complex;

public class NumberComplex implements IComplex {

    private int realPart;
    private int imaginaryPart;


    public NumberComplex(int realPart, int imaginaryPart) {
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
        return 0;
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

    @Override
    public int hashCode() {
        return super.hashCode();
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
