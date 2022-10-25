package fr.univartois.butinfo.fractals.transfo;

import fr.univartois.butinfo.fractals.figures.IFigure;

public abstract class Transformation {

    protected IFigure figure;

    public Transformation(IFigure figure) {
        this.figure = figure;
    }

    public abstract String getSVG();
}
