package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

public class Rectangle extends BaseForme implements IFigure {

    private final int height;

    private final int width;

    /**
     *
     * @param x
     * @param y
     * @param height
     * @param width
     * @param color
     */
    public Rectangle(int x, int y,int height, int width, Color color) {
        super(x,y,color);
        this.height = height;
        this.width = width;
    }

    /**
     *
     * @return la largeur
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     *
     * @return la longueur
     */
    @Override
    public int getHeight() {
        return height;
    }

    /**
     *
     * @return le SVG de la figure
     */
    public String getSVG(){
        return "<rectangle :"+" "+ "x="+x+" "+"y="+y+" "+ "width="+getWidth()+" "+ "height="+getHeight()+" "+"color="+color+">/";
    }
}
