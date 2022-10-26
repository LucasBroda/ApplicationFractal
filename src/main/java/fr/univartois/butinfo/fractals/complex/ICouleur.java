package fr.univartois.butinfo.fractals.complex;
import java.awt.Color;

public interface ICouleur {
	Color getCouleurStrategie(float nbrIteration,float maxIteration);
	Color masque(Color couleur);
}
