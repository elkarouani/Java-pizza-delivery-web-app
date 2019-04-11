package dao;

import java.util.List;

import model.Livraison;

public interface LivraisonPizzaDAOInterface {

	public boolean addLivraisonPizza(Livraison livraison);
	
	public List<String> getAllPizzaLibelle();
	
}
