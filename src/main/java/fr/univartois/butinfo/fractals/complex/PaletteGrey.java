package fr.univartois.butinfo.fractals.complex;
import java.awt.Color;

public class PaletteGrey implements ICouleur{

	@Override
	public Color getCouleurStrategie(float nbrIteration,float maxIteration) {
		return new Color(nbrIteration/maxIteration, nbrIteration/maxIteration, nbrIteration/maxIteration);
	}

	@Override
	public Color masque(Color couleur) {
		return couleur;
	}
}

