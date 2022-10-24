package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.black;

public class Line {

    private final double x1;

    private final double x2;

    private final double y1;

    private final double y2;

    private final Color stroke;

    private final float strokeWidth;

    public Line(double x1, double x2, double y1, double y2, Color stroke, float strokeWidth) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.stroke = stroke;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "<line"+" "+x1+"="+10+" "+x2+"="+50+" "+y1+"="+110+" "+y2+"="+150+ stroke+"="+black+" "+strokeWidth+"="+5+"/>";
    }
}
