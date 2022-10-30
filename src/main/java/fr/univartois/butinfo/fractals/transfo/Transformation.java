package fr.univartois.butinfo.fractals.transfo;

import fr.univartois.butinfo.fractals.figures.IFigure;

public abstract class Transformation {

    protected IFigure figure;

    /**
     *
     * @param figure
     */
    protected Transformation(IFigure figure) {
        this.figure = figure;
    }

    /**
     *
     * @return Le SVG de la figure
     */
    public abstract String getSVG();
}
