package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;

import java.util.Iterator;
import java.util.function.BinaryOperator;

/**
 * Création de la classe permettant de représenter la suite de Mandelbrot de manière généralisée
 */
public class SuiteMandelbrotGeneralisee implements ISuiteComplexe{

    /**
     * Comme pour Julia, on crée un attribut op de type BinaryOperator, pour créer notre expression lambda
     */
    BinaryOperator<IComplex> op;

    /**
     * L'attribut permettant de représenter le nombre complexe z
     */
    IComplex z;

    /**
     * Ici on crée une constante c pour représenter la suite de Mandelbrot généralisée du sujet
     */
    IComplex c;

    /**
     * Le nombre max d'itérations
     */
    private final int nbMaxIterations;

    /**
     * Le constructeur de la classe
     * @param op
     * @param z
     * @param c
     * @param nbMaxIterations
     */
    public SuiteMandelbrotGeneralisee(BinaryOperator<IComplex> op, IComplex z, IComplex c,int nbMaxIterations){
        this.op = op;
        this.z = z;
        this.c = c;
        this.nbMaxIterations = nbMaxIterations;
    }


    /**
     * L'implémentation de la méthode getNext() de l'interface
     * @param precedent
     * @return l'élément suivant de la suite
     */
    @Override
    public IComplex getNext(IComplex precedent) {
        if(precedent == null){
            return op.apply(z,c);
        }
        return op.apply(precedent,c);
    }

    /**
     *
     * @return des itérations de la suite
     */
    public Iterator<IComplex> iterator(){
        return new Iterateur((ISuiteComplexe) this,nbMaxIterations);
    }
}
