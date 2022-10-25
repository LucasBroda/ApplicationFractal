package fr.univartois.butinfo.fractals.complex;
import java.awt.Color;

public interface ICouleur {
	Color getCouleurStrategie(int nbrIteration);
	Color masque(Color couleur);
}
