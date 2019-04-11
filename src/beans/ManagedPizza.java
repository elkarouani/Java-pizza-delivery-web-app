package beans;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class ManagedPizza implements ManagedPizzaInterface {
	private List<String> pizzaList; 
	private String quantity;
	private String client;
	private String adresse;

	public void ajouter(ActionEvent event){
		System.out.println("well added {action works}");
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

	@Override
	public void fillWithPizzaLibelle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Integer> getLaPizzaPlusLivree() {
		// TODO Auto-generated method stub
		return null;
	}
}
