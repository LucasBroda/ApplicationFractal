package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.black;

public class Rectangle {

    private final double x;

    private final double y;

    private final double height;

    private final double width;

    private final Color stroke;

    private final String fill;

    private final int strokeWidth;

    public Rectangle(double x, double y, double height, double width, Color stroke, String fill, int strokeWidth) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.stroke = stroke;
        this.fill = fill;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "<rectangle :"+" "+ x +"="+60+" "+y+"="+10 +" "+ width+"="+30+" "+ height+"="+30+" "+stroke+"="+black+" "+fill+"="+"transparent"+" "+strokeWidth+"="+5+">/";
    }
}
