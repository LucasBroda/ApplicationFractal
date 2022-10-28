package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

public class Rectangle extends BaseForme implements IFigure {

    private final int height;

    private final int width;

    public Rectangle(int x, int y,int height, int width, Color color) {
        super(x,y,color);
        this.height = height;
        this.width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public String getSVG(){
        return "<rectangle :"+" "+ "x="+x+" "+"y="+y+" "+ "width="+getWidth()+" "+ "height="+getHeight()+" "+"color="+color+">/";
    }
}
