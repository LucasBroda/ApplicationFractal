package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.black;

public class Line extends BaseForme implements IFigure {

    private final Point points1;

    private final Color color;

    public Line(int x, int y,Point points1,Color color) {
        super(x,y,color);
        this.points1 = points1;
        this.color = color;
    }

    public String getSVG(){
        return "<line:"+""+ "x1=" +x+""+"y1="+y+""+"x2="+points1.getX()+""+"y2="+points1.getY()+""+"color="+color+""+"/>";
    }
}
