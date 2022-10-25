package fr.univartois.butinfo.fractals.complex;

import java.awt.Color;

public class masqueB extends PaletteDecorateur{
	public final int MAX_ITERATION = 100;

	public masqueB(ICouleur palette) {
		super(palette);
	}

	public Color getCouleurStrategie(int nbrIteration) {
		return new Color(nbrIteration/MAX_ITERATION, nbrIteration/MAX_ITERATION, nbrIteration/MAX_ITERATION);	
	}
	
	public Color masque(Color couleur) {
		return new Color(couleur.getRed(), couleur.getGreen(), 0);
	}
}