package fr.univartois.butinfo.fractals.complex;

import java.awt.Color;

public abstract class PaletteDecorateur implements ICouleur{
	protected ICouleur palette;

	public PaletteDecorateur(ICouleur palette) {
		this.palette = palette;
	}

	@Override
	public Color masque(Color couleur) {
		return palette.masque(couleur);
	}
}
