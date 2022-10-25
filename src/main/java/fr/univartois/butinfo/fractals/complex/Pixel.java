package fr.univartois.butinfo.fractals.complex;

public class Pixel implements IPixel{
	private int width;
	private int height;
	
	public Pixel(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public IComplex asComplex(int row, int column) {
		 double re = (column + .5) - (width / 2.);
		 double im = (height / 2.) - (row + .5);
		 return new NumberComplex(re, im);
		 }

}
