package fr.univartois.butinfo.fractals.complex;

public class ComplexDecorateurAddition extends Plan implements IPlan {
	private IPlan plan;
	private float constante;
	
	public ComplexDecorateurAddition(int width, int height,IPlan plan,float constante) {
		super(width, height);
		this.plan = plan;
	}

	public NumberComplex asComplex(int column,int row) {
		 double re = plan.asComplex(column,row).getRealPart()+constante;
		 double im = plan.asComplex(column, row).getImaginaryPart()+constante;
		 return new NumberComplex(re,im);
	}
}
