package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class ManagedPizza {
	private String title = "default";
	private List<String> pizzaList; 
	private String quantity;
	private String client;
	private String adresse;

	public void ajouter(ActionEvent event){
		System.out.println("well added {action works}");
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getPizzaList() {
		return pizzaList;
	}

	public void setPizzaList(List<String> pizzaList) {
		this.pizzaList = pizzaList;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
