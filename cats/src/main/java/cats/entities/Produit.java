package cats.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Produit implements Serializable {
	/* private static final long serialVersionUID = 1L; */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reference;
	private String designation;
	private double prix;

	public Produit() {
	}

	public Produit(Long ref, String des, double prix) {
		super();
		this.reference = ref;
		this.designation = des;
		this.prix = prix;
	}

	// Getters et Setters
	public Long getReference() {
		return reference;
	}

	public void setReference(Long reference) {
		this.reference = reference;
	}

	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
