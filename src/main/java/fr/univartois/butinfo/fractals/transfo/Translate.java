package fr.univartois.butinfo.fractals.transfo;

import fr.univartois.butinfo.fractals.figures.IFigure;

public class Translate extends Transformation{

    private final double translateX;

    private final double translateY;


    /**
     *
     * @param figure
     * @param translateX
     * @param translateY
     */
    public Translate(IFigure figure,double translateX, double translateY) {
        super(figure);
        this.translateX = translateX;
        this.translateY = translateY;
    }

    /**
     *
     * @return Le SVG de la figure
     */
    @Override
    public String getSVG() {
        return "<g transformation=\"translate(" + translateX + translateY + ")\">" + figure.getSVG() + "</g>";
    }
}
