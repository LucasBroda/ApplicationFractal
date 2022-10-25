package fr.univartois.butinfo.fractals.image;

import fr.univartois.butinfo.fractals.complex.NumberComplex;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface IBuilderImage {
    void setWidth(int width);
    void setHeight(int height);
    void setCentre(NumberComplex nbrComplex);
    void setZoom(NumberComplex zoom);
    void setSuiteComplex(String suite);
}
