package fr.univartois.butinfo.fractals.figures;

import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.green;
import static java.awt.Color.orange;

public class Polygone {

    private final Color stroke;

    private final String fill;

    private final int strokeWidth;

    private final ArrayList<Integer> points = new ArrayList<>();

    public Polygone(Color stroke, String fill, int strokeWidth) {
        this.stroke = stroke;
        this.fill = fill;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "<polyline"+" "+ points+"50 160 55 180 70 180 60 190 65 205 50 195 35 205 40 190 30 180 45 180"+
        stroke+"="+green+""+ fill+"="+"transparent"+""+ strokeWidth+"="+5+"/>";
    }
}
