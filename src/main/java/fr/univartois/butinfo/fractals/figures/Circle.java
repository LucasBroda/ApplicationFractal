package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.red;

public class Circle {

    private final double r;

    private final double cx;

    private final double cy;

    private final Color stroke;

    private final String fill;

    private final int strokeWidth;

    public Circle(double r, double cx, double cy, Color stroke, String fill, int strokeWidth) {
        this.r = r;
        this.cx = cx;
        this.cy = cy;
        this.stroke = stroke;
        this.fill = fill;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "circle :"+" "+cx+"="+25+" "+cy+"="+75+" "+r+"="+20+" "+stroke+"="+red+" "+ fill+"="+"transparent"+" "+strokeWidth+"="+5+"/>";
    }
}
