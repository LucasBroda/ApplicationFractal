package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.io.IOException;

import fr.univartois.butinfo.fractals.suite.Iterateur;
import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;
import fr.univartois.butinfo.fractals.complex.PaletteDecorateur;
import fr.univartois.butinfo.fractals.complex.PaletteGrey;
import fr.univartois.butinfo.fractals.complex.PaletteRouge;
import fr.univartois.butinfo.fractals.complex.Plan;
import fr.univartois.butinfo.fractals.complex.PlanDecorateurMultiplie;
import fr.univartois.butinfo.fractals.suite.SuiteJulia;
import fr.univartois.butinfo.fractals.suite.SuiteMandelbrot;
import fr.univartois.butinfo.fractals.complex.ComplexDecorateurAddition;

public class GenerationDesImages implements IBuilderImage {
	private int width;
	private int height;
	private double centreX;
	private double centreY;
	private double zoom;
	private String suite;
	private int nbrIterationMax;
	private String outputFile;
	private String paleteColor;
	
	@Override
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void setCentreX(double centreX) {
			this.centreX = centreX;
	}
	@Override
	public void setCentreY(double centreY) {
			this.centreY = centreY;
	}
	@Override
	public void setZoom(double zoom) {
		this.zoom = zoom;
	}
	@Override
	public void setSuiteComplexName(String suite) {
			this.suite = suite;
	}
	@Override
	public void setOutput(String outputFile) {
		this.outputFile = outputFile;
	}
	@Override
	public void setNbiteration(int nbIterationMax) {
		this.nbrIterationMax = nbIterationMax;
	}
	@Override
	public void setPaletteName(String paleteColor) {
		this.paleteColor = paleteColor;
	}
	public IFractalImage getResult() throws IOException {
		CreateImage image = new CreateImage(this.width, this.height);
		PaletteGrey palette = new PaletteGrey();
		Iterateur iterator = null;
		Plan plan = new Plan(this.width,this.height);
		PlanDecorateurMultiplie zoomPlan = new PlanDecorateurMultiplie(plan,zoom);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				NumberComplex point = zoomPlan.asComplex(j, i);
				if (this.suite.equals("Julia")) {
					SuiteJulia typeSuite = new SuiteJulia(point,this.nbrIterationMax);
					iterator = (Iterateur) typeSuite.iterator();
				}
				if (this.suite.equals("Mandelbrot")) {
					SuiteMandelbrot typeSuite = new SuiteMandelbrot(point,this.nbrIterationMax);
					iterator = (Iterateur) typeSuite.iterator();
				}
				if (iterator != null) {
					while(iterator.hasNext()) {
						iterator.next();
					}
					Color couleur = palette.getCouleurStrategie(iterator.getNbrIteration(),(float)this.nbrIterationMax);
					image.setColor(i, j, couleur);
				}
			}
		}
		image.saveAs(this.outputFile);
		return image;
	}
}
