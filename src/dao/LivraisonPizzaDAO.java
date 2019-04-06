package dao;

import javax.persistence.*;

//import model.Livraison;
//import model.Pizza;

public class LivraisonPizzaDAO {
	@PersistenceContext(unitName = "CommanderPizza")
	private EntityManager em;
	
	public LivraisonPizzaDAO(EntityManager em) {
		em = Persistence.createEntityManagerFactory("CommanderPizza").createEntityManager();
		this.em = em;
	}
	
	private int addLivraisonPizza() {
		EntityTransaction entityTransaction = em.getTransaction();
//		Pizza pizza = new Pizza();
//		pizza.setLibelle("KingCollection");
//		pizza.setPrix(100);
//		Livraison livraison = new Livraison();
//		livraison.setAdresse("This is an adresse");
//		livraison.setClient("Client1");
		try {
			entityTransaction.begin();
//			this.em.persist(livraison);
			System.out.println("Livraison est enregistré avec succées");
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
