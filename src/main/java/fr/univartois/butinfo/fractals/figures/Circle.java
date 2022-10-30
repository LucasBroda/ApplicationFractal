package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

public class Circle extends BaseForme implements IFigure  {

    private final int radius;

    /**
     *
     * @param x
     * @param y
     * @param radius
     * @param color
     */
    public Circle(int x, int y,int radius,Color color) {
        super(x,y,color);
        this.radius = radius;
    }

    /**
     *
     * @return la largeur
     */
    @Override
    public int getWidth() {
        return radius * 2;
    }

    /**
     *
     * @return la longueur
     */
    @Override
    public int getHeight() {
        return radius * 2;
    }

    /**
     *
     * @return le SVG de la figure
     */
    public String getSVG(){
        return "circle :"+" "+"cx="+x+" "+"cy="+y+" "+"radius="+radius+" "+"color="+color+"/>";
    }

}
