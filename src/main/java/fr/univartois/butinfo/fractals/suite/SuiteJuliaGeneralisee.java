package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.IComplex;

import java.util.Iterator;
import java.util.function.BinaryOperator;

/**
 * On crée la classe permettant de représentant la suite de Julia avec n'importe quelle formule.
 */
public class SuiteJuliaGeneralisee implements ISuiteComplexe{
    /**
     * On crée un attribut op, de type BinaryOperator prenant un nombre complexe,
     * cet attribut va nous permettre d'utiliser n'importe quelle formule pour représenter
     * notre via la création d'une expression lambda.
     */
    BinaryOperator<IComplex> op;

    /**
     * Notre constante c
     */
    IComplex c;

    /**
     * Notre nombre complexe z
     */
    IComplex z;

    /**
     * Notre attribut représentant le nombre max d'itérations
     */
    private final int nbMaxIterations;


    /**
     * Le constructeur de notre classe
     * @param op
     * @param c
     * @param z
     * @param nbMaxIterations
     */
    public SuiteJuliaGeneralisee(BinaryOperator<IComplex> op, IComplex c, IComplex z, int nbMaxIterations){
        this.op = op;
        this.c = c;
        this.z = z;
        this.nbMaxIterations = nbMaxIterations;
    }

    /**
     * L'implémentation de notre méthode getNext(), ici on l'adaptera pour utiliser notre BinaryOperator
     * @param precedent
     * @return
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
     * @return des itérations de notre suite de Julia généralisée
     */
    public Iterator<IComplex> iterator(){
        return new Iterateur((ISuiteComplexe) this,nbMaxIterations);
    }

}
