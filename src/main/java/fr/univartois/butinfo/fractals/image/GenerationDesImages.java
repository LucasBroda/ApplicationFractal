package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.io.IOException;

import fr.univartois.butinfo.fractals.complex.Iterateur;
import fr.univartois.butinfo.fractals.complex.NumberComplex;
import fr.univartois.butinfo.fractals.complex.PaletteGrey;
import fr.univartois.butinfo.fractals.complex.SuiteJulia;
import fr.univartois.butinfo.fractals.complex.SuiteMandelbrot;

public class GenerationDesImages implements IBuilderImage {
	private int width;
	private int height;
	private NumberComplex centre;
	private NumberComplex zoom;
	private String suite;
	private int nbrIteration;

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setCentre(NumberComplex nbrComplex) {
		this.centre = nbrComplex;
	}

	@Override
	public void setZoom(NumberComplex zoom) {
		this.zoom = zoom;
	}

	@Override
	public void setSuiteComplex(String suite) {
		this.suite = suite;
	}

	public IFractalImage getResult() throws IOException {
		CreateImage image = new CreateImage(this.width, this.height);
		PaletteGrey palette = new PaletteGrey();
		Iterateur iterator = null;
		NumberComplex nbr_compl = new NumberComplex(0,0);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (this.suite == "Julia") {
					NumberComplex compl = new NumberComplex(i, j);
					SuiteJulia typeSuite = new SuiteJulia(compl, this.nbrIteration);
					iterator = new Iterateur(typeSuite, this.height, compl);
				}
				if (this.suite == "Mandelbrot") {
					NumberComplex compl = new NumberComplex(i, j);
					SuiteMandelbrot typeSuite = new SuiteMandelbrot(compl, this.nbrIteration);
					iterator = new Iterateur(typeSuite, this.height, compl);
				}
				if (iterator != null)
					while (iterator.hasNext()) {
						iterator.next();
					}
				Color couleur = palette.getCouleurStrategie(iterator.getIteration());
				image.setColor(i, j, couleur);
			}
		}
		setCentre((NumberComplex) (nbr_compl.add(this.zoom)).multiply(this.zoom));
		image.saveAs("/");
		return image;
	}

}
