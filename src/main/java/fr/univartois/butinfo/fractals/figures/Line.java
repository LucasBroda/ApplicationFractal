package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

public class Line extends BaseForme implements IFigure {

    private final Point points1;

    /**
     *
     * @param x
     * @param y
     * @param points1
     * @param color
     */
    public Line(int x, int y,Point points1,Color color) {
        super(x,y,color);
        this.points1 = points1;
    }

    /**
     *
     * @return le SVG de la figure
     */
    public String getSVG(){
        return "<line:"+""+ "x1=" +x+""+"y1="+y+""+"x2="+points1.getX()+""+"y2="+points1.getY()+""+"color="+color+""+"/>";
    }
}
