package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;

import java.util.function.BinaryOperator;

public class SuiteMandelbrotGeneralisee implements ISuiteComplexe{

    BinaryOperator<IComplex> op;

    IComplex z;

    IComplex c;

    private final int nbMaxIterations;

    public SuiteMandelbrotGeneralisee(BinaryOperator<IComplex> op, IComplex z, IComplex c,int nbMaxIterations){
        this.op = op;
        this.z = z;
        this.c = c;
        this.nbMaxIterations = nbMaxIterations;
    }


    @Override
    public IComplex getNext(IComplex precedent) {
        if(precedent == null){
            return op.apply(z,c);
        }
        return op.apply(precedent,c);
    }
}
