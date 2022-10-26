package fr.univartois.butinfo.fractals.complex;
import java.awt.Color;

public class PaletteRouge implements ICouleur{

	@Override
	public Color getCouleurStrategie(float nbrIteration, float maxIteration) {
		return new Color(nbrIteration/maxIteration, (float)0, (float)0);
	}
	
	@Override
	public Color masque(Color couleur) {
		return couleur;
	}
}
