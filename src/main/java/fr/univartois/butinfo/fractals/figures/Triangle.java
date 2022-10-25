package fr.univartois.butinfo.fractals.figures;

import fr.univartois.butinfo.fractals.complex.IPoint;

import java.awt.*;

public class Triangle {

    private final Color color;

    public IPoint[] points;

    public Triangle(IPoint[] points, Color color) {
        this.points = new IPoint[3];
        this.points[0] = points[0];
        this.points[1] = points[1];
        this.points[2] = points[2];
        this.color = color;
    }

    public String getSVG() {
        StringBuilder pointsSb = new StringBuilder();
        for (IPoint point: points) {
            pointsSb.append(point.getX()).append(" ").append(point.getY()).append(", ");
        }
        return "<polygon points=\"" + pointsSb.substring(0, pointsSb.length() - 2) + "\" fill=\"" + color + "\"/>";
    }
}
