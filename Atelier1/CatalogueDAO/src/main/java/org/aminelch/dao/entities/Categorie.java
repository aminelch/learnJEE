package org.aminelch.dao.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "CATEGORIES")
public class Categorie implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CODE_CAT")
private Long codeCategorie;
@NotEmpty
private String nomCategorie;
@Lob
private byte[] photo;
@OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
private Collection<Produit> produits;

//Constructeurs
public Categorie() {
}
}
public Categorie(String nomCategorie) {
this.nomCategorie = nomCategorie;
}
//Getters et Setters
