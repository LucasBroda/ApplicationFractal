package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

import static java.awt.Color.red;

public class Circle extends BaseForme implements IFigure  {

    private final int radius;

    public Circle(int x, int y,int radius,Color color) {
        super(x,y,color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public String getSVG(){
        return "circle :"+" "+"cx="+x+" "+"cy="+y+" "+"radius="+radius+" "+"color="+color+"/>";
    }

}
