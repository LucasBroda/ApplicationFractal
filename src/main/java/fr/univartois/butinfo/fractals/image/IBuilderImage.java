package fr.univartois.butinfo.fractals.image;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface IBuilderImage {
    void setWidth(int width);
    void setHeight(int height);
    void setCentreX(double centreX);
    void setCentreY(double centreY);
    void setZoom(double zoom);
    void setSuiteComplexName(String suite);
    void setOutput(String outputFile);
    void setNbiteration(int nbIteration);
    void setPaletteName(String paleteColor);
}





