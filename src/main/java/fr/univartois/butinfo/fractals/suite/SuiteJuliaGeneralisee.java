package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;

import java.util.Iterator;
import java.util.function.BinaryOperator;

public class SuiteJuliaGeneralisee{
    BinaryOperator<IComplex> op;
    IComplex c;
    IComplex z;

    private final int nbMaxIterations;


    public SuiteJuliaGeneralisee(BinaryOperator<IComplex> op, IComplex c, IComplex z, int nbMaxIterations){
        this.op = op;
        this.c = c;
        this.z = z;
        this.nbMaxIterations = nbMaxIterations;
    }

    public IComplex suiteJuliaGeneralisee(){
        return op.apply(z,c);
    }

    public Iterator<IComplex> iterator(){
        return new Iterateur((ISuiteComplexe) this,nbMaxIterations);
    }





}
