package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.red;

public class Eclipse {

    private final double rx;

    private final double ry;

    private final double cx;

    private final double cy;

    private final Color stroke;

    private final String fill;

    private final int strokeWidth;

    public Eclipse(double rx, double ry, double cx, double cy, Color stroke, String fill, int strokeWidth) {
        this.rx = rx;
        this.ry = ry;
        this.cx = cx;
        this.cy = cy;
        this.stroke = stroke;
        this.fill = fill;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "<ellipse"+" "+ cx+"="+75+" "+ cy+"="+75+" "+rx+"="+20+" "+ ry+"="+5+ stroke+"="+red+" "+fill+"="+"transparent"+" "+strokeWidth+"="+5+"/>";
    }
}
