package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the livraison database table.
 * 
 */
@Entity
@Table(name="livraison")
@NamedQuery(name="Livraison.findAll", query="SELECT l FROM Livraison l")
public class Livraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=50)
	private String adresse;

	@Column(nullable=false, length=50)
	private String client;

	@Temporal(TemporalType.DATE)
	private Date dateli;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	private int nbl;

	@Column(nullable=false)
	private int numfou;

	@Column(nullable=false)
	private int numli;

	@Column(nullable=false)
	private int quantité;

	//bi-directional many-to-one association to Pizza
	@ManyToOne
	@JoinColumn(name="libelle", referencedColumnName="libelle", nullable=false)
	private Pizza pizza;

	public Livraison() {
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Date getDateli() {
		return this.dateli;
	}

	public void setDateli(Date dateli) {
		this.dateli = dateli;
	}

	public int getNbl() {
		return this.nbl;
	}

	public void setNbl(int nbl) {
		this.nbl = nbl;
	}

	public int getNumfou() {
		return this.numfou;
	}

	public void setNumfou(int numfou) {
		this.numfou = numfou;
	}

	public int getNumli() {
		return this.numli;
	}

	public void setNumli(int numli) {
		this.numli = numli;
	}

	public int getQuantité() {
		return this.quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	public Pizza getPizza() {
		return this.pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

}