package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;

import java.util.Iterator;
import java.util.function.BinaryOperator;

public class SuiteMandelbrotGeneralisee implements ISuiteComplexe {
    BinaryOperator<IComplex> op;
    IComplex c;
    IComplex z;

    private final int nbMaxIterations;


    public SuiteMandelbrotGeneralisee(BinaryOperator<IComplex> op, IComplex z, IComplex c, int nbMaxIterations){
        this.op = op;
        this.c = c;
        this.z = z;
        this.nbMaxIterations = nbMaxIterations;
    }

    @Override
    public IComplex getNext(IComplex precedent) {
        if(precedent == null){
            return z.multiply(z).add(z);
        }
        return precedent.multiply(precedent).add(z);
    }


    public Iterator<IComplex> iterator(){
        return new Iterateur((ISuiteComplexe) this,nbMaxIterations);
    }



}

