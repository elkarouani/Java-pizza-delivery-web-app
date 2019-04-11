package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-04-11T20:44:49.662+0100")
@StaticMetamodel(Livraison.class)
public class Livraison_ {
	public static volatile SingularAttribute<Livraison, Long> nbl;
	public static volatile SingularAttribute<Livraison, String> client;
	public static volatile SingularAttribute<Livraison, String> adresse;
	public static volatile SingularAttribute<Livraison, Integer> quantite;
	public static volatile SingularAttribute<Livraison, Pizza> pizza;
}
