package fr.univartois.butinfo.fractals.suite;

import java.util.Iterator;

import fr.univartois.butinfo.fractals.complex.IComplex;
import fr.univartois.butinfo.fractals.complex.NumberComplex;

/**
 * On crée la classe représentant la suite de Julia
 */
public class SuiteJulia implements ISuiteComplexe {

    /**
     * On crée un attribut représentant la constante c de la formule de Julia, c est un nombre complexe.
     */
    private NumberComplex c = new NumberComplex(-0.4,0.6);

    /**
     * On crée un attribut z représentant le nombre complexe z de la formule, cet attribut est amené à changer de valeur.
     */
    private NumberComplex z;

    /**
     * On crée encore une fois un attribut représentant le nombre max d'itérations,
     * élément indispensable pour itérer la suite car cet attribut représente la limite de celle-ci.
     */
    private int nbrMaxIteration;

    /**
     * Le constructeur de z et du nombre max d'itérations, on ne met pas l'attribut c car
     * c'est une constante et qu'on lui a déjà attribué une valeur.
     * @param z
     * @param nbrMaxIteration
     */
    public SuiteJulia(NumberComplex z,int nbrMaxIteration ){
        this.z = z;
        this.nbrMaxIteration = nbrMaxIteration;
    }

    /**
     * On implémente la méthode getNext() de notre interface ISuiteComplexe
     * @param prec
     * @return l'élément suivant de la liste, par rapport à l'élément précédent de la liste
     */
    @Override
    public IComplex getNext(IComplex prec) {
    	if(prec == null) {
    		return (z.multiply(z)).add(c);
    	}
        return  (prec.multiply(prec)).add(c);
    }

    /**
     * On crée toujours notre itérateur de la suite
     * @return des itérations de la suite de Julia
     */
    public Iterator<IComplex> iterator(){
        return new Iterateur(this,nbrMaxIteration);
    }
}
