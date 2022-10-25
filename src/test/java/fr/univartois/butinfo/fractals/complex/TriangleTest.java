package fr.univartois.butinfo.fractals.complex;

import fr.univartois.butinfo.fractals.figures.Triangle;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void testCreerTriangle() {
        IPoint[] points = new IPoint[3];
        points[0] = new AdaptateurComplex(new NumberComplex(160, 130));
        points[1] = new AdaptateurComplex(new NumberComplex(180, 100));
        points[2] = new AdaptateurComplex(new NumberComplex(200, 130));
        Color color = Color.RED;
        Triangle figureTriangle = new Triangle(points, color);
//        System.out.println(figureTriangle.getSVG());
        String pointsStr = points[0].getX() + " " + points[0].getY() + ", " + points[1].getX() + " " + points[1].getY() + ", " + points[2].getX() + " " + points[2].getY();
        String expected = "<polygon points=\"" + pointsStr + "\" fill=\"" + color + "\"/>";
        assertEquals(expected, figureTriangle.getSVG());
    }

}