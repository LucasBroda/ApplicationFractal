package fr.univartois.butinfo.fractals.complex;

public class ComplexDecorateurAddition implements IPixel {
	private IPixel complex;
	private NumberComplex constante;
	
	public void ComplexDecorateur(IPixel complex) {
		this.complex = complex;
	}

	public IComplex asComplex(int column,int row) {
		return complex.asComplex(column,row).add(constante);
	}
}
