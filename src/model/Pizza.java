package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the pizza database table.
 * 
 */
@Entity
@Table(name="pizza")
@NamedQuery(name="Pizza.findAll", query="SELECT p FROM Pizza p")
public class Pizza implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(nullable=false)
	private int libelle;
	
	@Column(nullable=false)
	private float prix;

	//bi-directional many-to-one association to Livraison
	@OneToMany(mappedBy="pizza")
	private Set<Livraison> livraisons;

	public Pizza() {
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Set<Livraison> getLivraisons() {
		return this.livraisons;
	}

	public void setLivraisons(Set<Livraison> livraisons) {
		this.livraisons = livraisons;
	}

	public Livraison addLivraison(Livraison livraison) {
		getLivraisons().add(livraison);
		livraison.setPizza(this);

		return livraison;
	}

	public Livraison removeLivraison(Livraison livraison) {
		getLivraisons().remove(livraison);
		livraison.setPizza(null);

		return livraison;
	}

}