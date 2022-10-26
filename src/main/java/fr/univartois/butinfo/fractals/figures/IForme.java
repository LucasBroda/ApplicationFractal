package fr.univartois.butinfo.fractals.figures;

public interface IForme {

    int getX();

    int getY();

    void move(int x, int y);

    int getWidth();

    int getHeight();

    boolean isInsideBounds(int x, int y);
}
