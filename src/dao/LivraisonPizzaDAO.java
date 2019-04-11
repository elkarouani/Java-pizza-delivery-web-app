package dao;

import java.util.List;

import javax.persistence.*;

import model.Livraison;

//import model.Livraison;
//import model.Pizza;

public class LivraisonPizzaDAO implements LivraisonPizzaDAOInterface {
	@PersistenceContext(unitName = "CommanderPizza")
	private EntityManager em;
	
	public LivraisonPizzaDAO(EntityManager em) {
		em = Persistence.createEntityManagerFactory("CommanderPizza").createEntityManager();
		this.em = em;
	}

	@Override
	public boolean addLivraisonPizza(Livraison livraison) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getAllPizzaLibelle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
