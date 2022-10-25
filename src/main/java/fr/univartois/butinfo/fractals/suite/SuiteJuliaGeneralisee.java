package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;

import java.util.function.BinaryOperator;

public class SuiteJuliaGeneralisee{
    BinaryOperator<IComplex> op;
    IComplex c;
    IComplex z;


    public SuiteJuliaGeneralisee(BinaryOperator<IComplex> op,IComplex c,IComplex z){
        this.op = op;
        this.c = c;
        this.z = z;
    }

    public IComplex suiteJuliaGeneralisee(){
        return op.apply(z,c);
    }





}