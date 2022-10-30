package fr.univartois.butinfo.fractals.transfo;

import fr.univartois.butinfo.fractals.figures.IFigure;

public class Rotate extends Transformation {

    private final double rotation;

    /**
     *
     * @param figure
     * @param rotation
     */
    public Rotate(IFigure figure, double rotation) {
        super(figure);
        this.rotation = rotation;
    }

    /**
     *
     * @return Le SVG de la figure
     */
    @Override
    public String getSVG() {
        return "<g transform=\"rotate(" + rotation + ")\">" + figure.getSVG() + "</g>";
    }
}
