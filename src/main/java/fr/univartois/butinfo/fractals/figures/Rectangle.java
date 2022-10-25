package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.black;

public class Rectangle {

    private final Point points;

    private final double height;

    private final double width;

    private final Color color;

    public Rectangle(Point points,double height, double width, Color color) {
        this.points = points;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public String getSVG(){
        return "<rectangle :"+" "+ "x="+points.getX()+" "+"y="+points.getY()+" "+ "width="+width+" "+ "height="+height+" "+"color="+color+">/";
    }
}
