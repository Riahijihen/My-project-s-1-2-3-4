package com.jihen.MyProject.entities;

	import java.util.Date;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
	@Entity
	public class commande {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCom;
	private String nomCom;
	private Double prixCom;
	private Date dateCreation;
	@ManyToOne
	private Client client;
	public commande() {
	super();
	}

	public commande(String nomCom, Double prixCom, Date dateCreation) {
		super();
		this.nomCom = nomCom;
		this.prixCom = prixCom;
		this.dateCreation = dateCreation;
	}

	public Long getIdCom() {
		return idCom;
	}

	public void setIdCom(Long idCom) {
		this.idCom = idCom;
	}

	public String getNomCom() {
		return nomCom;
	}

	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}

	public Double getPrixCom() {
		return prixCom;
	}

	public void setPrixCom(Double prixCom) {
		this.prixCom = prixCom;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "commande [idCom=" + idCom + ", nomCom=" + nomCom + ", prixCom=" + prixCom + ", dateCreation="
				+ dateCreation + "]";
	}
	

}
