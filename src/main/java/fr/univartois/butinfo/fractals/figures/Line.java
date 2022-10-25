package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.black;

public class Line implements IFigure {

    private final Point points1;

    private final Point points2;

    private final Color color;

    public Line(Point points1,Point points2,Color color) {
        this.points1 = points1;
        this.points2 = points2;
        this.color = color;
    }

    public String getSVG(){
        return "<line:"+""+ "x1=" +points1.getX()+""+"y1="+points1.getY()+""+"x2="+points2.getX()+""+"y2="+points2.getY()+""+"color="+color+""+"/>";
    }
}
