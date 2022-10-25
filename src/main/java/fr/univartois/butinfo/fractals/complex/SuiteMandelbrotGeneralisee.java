package fr.univartois.butinfo.fractals.complex;

import java.util.function.BinaryOperator;

public class SuiteMandelbrotGeneralisee {

    BinaryOperator<IComplex> op;
    IComplex c;
    IComplex z;


    public SuiteMandelbrotGeneralisee(BinaryOperator<IComplex> op,IComplex c,IComplex z){
        this.op = op;
        this.c = c;
        this.z = z;
    }

    public IComplex suiteMandelbrotGeneralisee(){
        return op.apply(z,c);
    }
}
