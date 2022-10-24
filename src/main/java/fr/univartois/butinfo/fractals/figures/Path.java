package fr.univartois.butinfo.fractals.figures;

import java.awt.*;
import java.util.ArrayList;

import static java.awt.Color.blue;

public class Path {
    private final Color stroke;

    private final String fill;

    private final int strokeWidth;

    private final ArrayList<String> d = new ArrayList<>();

    public Path(Color stroke, String fill, int strokeWidth) {
        this.stroke = stroke;
        this.fill = fill;
        this.strokeWidth = strokeWidth;
    }

    public String getSVG(){
        return "<path" +" "+d+"="+"M20,230 Q40,205 50,230 T90,230"+" "+fill+"="+"none"+" "+ stroke+"="+blue+" "+ strokeWidth+"="+5+"/>";
    }
}
