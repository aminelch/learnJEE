package org.isetn;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaisDate; 
	
	
	
	/*public Etudiant() {
		super();
	}*/



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Date getDateNais() {
		return dateNaisDate;
	}



	public void setDateNais(Date dateNais) {
		this.dateNaisDate = dateNais;
	}



//	public Etudiant(Long id, String nom, String prenom, Date dateNais,Formation formation) {
//		super();
//		this.id = id;
//		this.nom = nom;
//		this.prenom = prenom;
//		this.dateNaisDate = dateNais;
//		this.formation=formation;
//	}



	
	
	@ManyToOne
//	@JoinColumn(name="ID_FORMATION")
	private Formation formation;



	public Formation getFormation() {
		return formation;
	}



	public void setFormation(Formation formation) {
		this.formation = formation;
	}



}
	
	
	
	
	

