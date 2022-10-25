package fr.univartois.butinfo.fractals.suite;

import fr.univartois.butinfo.fractals.complex.AdaptateurComplex;
import fr.univartois.butinfo.fractals.complex.IPoint;

public interface ISuiteChaotique {

    AdaptateurComplex getNext(IPoint point);
}
