package fr.univartois.butinfo.fractals.complex;

import java.awt.Color;

public class masqueG extends PaletteDecorateur{
	public final int MAX_ITERATION = 100;

	public masqueG(ICouleur palette) {
		super(palette);
	}

	public Color getCouleurStrategie(float nbrIteration,float maxIteration) {
		return new Color((float)(nbrIteration/maxIteration),(float)( nbrIteration/maxIteration),(float)( nbrIteration/maxIteration));	
	}
	
	public Color masque(Color couleur) {
		return new Color(couleur.getRed()/255, (float)0, couleur.getBlue()/255);
	}
}
