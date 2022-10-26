package fr.univartois.butinfo.fractals.complex;

public class Plan implements IPlan{
	private int width;
	private int height;
	
	public Plan(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public NumberComplex asComplex(int row, int column) {
		 double re = (column + .5) - (width / 2.);
		 double im = (height / 2.) - (row + .5);
		 return new NumberComplex(re, im);
		 }

}
