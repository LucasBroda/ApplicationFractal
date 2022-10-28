package fr.univartois.butinfo.fractals.complex;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Plan implements IPlan{
	private int width;
	private int height;

	private final IPlan plan = new Plan(this.width,this.height);
	
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

	public IComplex determineComplex(NumberComplex nbr) {
		if(nbr.getRealPart() > this.height || nbr.getImaginaryPart() > this.width){
			System.out.println("Le nombre complexe est en dehors de l'image");
			return null;
		}
		else {
			return new NumberComplex(nbr.getRealPart(), nbr.getImaginaryPart());
		}

	}

	public IPoint determinePoint(IPoint point){
		if(point.getX() > this.height || point.getY() > this.width){
			System.out.println("Le point est en dehors de l'image");
			return null;
		}
		else {
			return new AdaptateurComplex(point.getX(), point.getY());
		}
	}

}
