package fr.univartois.butinfo.fractals.complex;
import java.awt.Color;

public class PaletteGrey implements ICouleur{
	public final int MAX_ITERATION = 100;

	@Override
	public Color getCouleurStrategie(int nbrIteration) {
		return new Color(nbrIteration/MAX_ITERATION, nbrIteration/MAX_ITERATION, nbrIteration/MAX_ITERATION);	
	}

	@Override
	public Color masque(Color couleur) {
		return couleur;
	}
}

