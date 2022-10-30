package fr.univartois.butinfo.fractals.figures;

import java.awt.*;

public abstract class BaseForme implements IForme{

    int x;
    int y;
    public final Color color;


    /**
     *
     * @param x
     * @param y
     * @param color
     */
    protected BaseForme(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     *
     * @return x
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     *
     * @return y
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     *
     * @return la largeur
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     *
     * @return la hauteur
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     *
     * @param x
     * @param y
     */
    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    /**
     *
     * @param x
     * @param y
     * @return la distance entre les points x et y
     */
    public boolean isInsideBounds(int x, int y) {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

}
