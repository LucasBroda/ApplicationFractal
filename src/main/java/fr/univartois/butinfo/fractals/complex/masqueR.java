package fr.univartois.butinfo.fractals.complex;

import java.awt.Color;

public class masqueR extends PaletteDecorateur{
	public final int MAX_ITERATION = 100;

	public masqueR(ICouleur palette) {
		super(palette);
	}

	public Color getCouleurStrategie(float nbrIteration,float maxIteration) {
		return new Color((float)(nbrIteration/maxIteration),(float)(nbrIteration/maxIteration),(float)(nbrIteration/maxIteration));	
	}
	
	public Color masque(Color couleur) {
		return new Color((float)0,(float) couleur.getGreen(),(float) couleur.getBlue());
	}
}
