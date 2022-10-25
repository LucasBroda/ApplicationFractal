package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.red;

public class Circle implements IFigure {

    private final double r;

    private final Point points;

    private final Color stroke;

    private final String fill;

    private final int strokeWidth;

    public Circle(double r, Point points, Color stroke, String fill, int strokeWidth) {
        this.r = r;
        this.points = points;
        this.stroke = stroke;
        this.fill = fill;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "circle :"+" "+"cx="+points.getX()+" "+"cy="+points.getY()+" "+"r="+r+" "+"stroke="+stroke+" "+ "fill="+fill+" "+"strokeWidth="+strokeWidth+"/>";
    }

}
