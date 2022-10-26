package fr.univartois.butinfo.fractals.complex;

import java.awt.Color;

public class masqueB extends PaletteDecorateur{

	public masqueB(ICouleur palette) {
		super(palette);
	}

	public Color getCouleurStrategie(float nbrIteration,float maxIteration) {
		return new Color(nbrIteration/maxIteration, nbrIteration/maxIteration, nbrIteration/maxIteration);	
	}
	
	public Color masque(Color couleur) {
		return new Color((float)(couleur.getRed()/255), (float)(couleur.getGreen()/255), (float) 0);
	}
}