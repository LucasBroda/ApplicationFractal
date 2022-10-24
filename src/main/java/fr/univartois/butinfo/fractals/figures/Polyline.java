package fr.univartois.butinfo.fractals.figures;

import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.orange;

public class Polyline {


    private final Color stroke;

    private final String fill;

    private final int strokeWidth;

    private final ArrayList<Integer> points = new ArrayList<>();

    public Polyline(Color stroke, String fill, int strokeWidth) {
        this.stroke = stroke;
        this.fill = fill;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "<polyline"+" "+ points+"="+"60 110 65 120 70 115 75 130 80 125 85 140 90 135 95 150 100 145"+
        stroke+"="+orange+" "+fill+"="+"transparent"+" "+strokeWidth+"="+5+"/>";
    }
}
