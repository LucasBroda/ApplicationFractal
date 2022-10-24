package fr.univartois.butinfo.fractals.complex;

public class ComplexDecorateurMultiplie implements IPixel {
	private IPixel complex;
	private NumberComplex multiplicatuer;
	
	public void ComplexDecorateur(IPixel complex) {
		this.complex = complex;
	}

	public IComplex asComplex(int column,int row) {
		return complex.asComplex(column,row).multiply(multiplicatuer);
	}
}
