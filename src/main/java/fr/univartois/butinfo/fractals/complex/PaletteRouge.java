package fr.univartois.butinfo.fractals.complex;
import java.awt.Color;

public class PaletteRouge implements ICouleur{
	public final int MAX_ITERATION = 100;

	@Override
	public Color getCouleurStrategie(int nbrIteration) {
		return new Color(nbrIteration/MAX_ITERATION, 0, 0);
	}
	
	@Override
	public Color masque(Color couleur) {
		return couleur;
	}
}
