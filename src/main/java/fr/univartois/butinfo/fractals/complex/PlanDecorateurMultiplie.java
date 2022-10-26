package fr.univartois.butinfo.fractals.complex;

public class PlanDecorateurMultiplie implements IPlan {
	private IPlan plan;
	private double multiplicater;
	
	public PlanDecorateurMultiplie(IPlan plan,double multiplicater) {
		this.plan = plan;
		this.multiplicater = multiplicater;
	}

	public NumberComplex asComplex(int column,int row) {
		 double re = plan.asComplex(column,row).getRealPart()*multiplicater;
		 double im = plan.asComplex(column, row).getImaginaryPart()*multiplicater;
		 return new NumberComplex(re,im);
	}
}
