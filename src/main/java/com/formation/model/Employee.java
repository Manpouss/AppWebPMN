package com.formation.model;

public class Employee {
	protected int numemp;
	protected String nomemp;
	protected String prenomemp;
	protected String poste;
	protected float salaire;
	protected float prime;
	protected String codeprojet;
	protected int superieur;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int numemp, String nomemp, String prenomemp, String poste, float salaire, float prime,
			String codeprojet, int superieur) {
		super();
		this.numemp = numemp;
		this.nomemp = nomemp;
		this.prenomemp = prenomemp;
		this.poste = poste;
		this.salaire = salaire;
		this.prime = prime;
		this.codeprojet = codeprojet;
		this.superieur = superieur;
	}


	public int getNumemp() {
		return numemp;
	}
	public void setNumemp(int numemp) {
		this.numemp = numemp;
	}
	public String getNomemp() {
		return nomemp;
	}
	public void setNomemp(String nomemp) {
		this.nomemp = nomemp;
	}
	public String getPrenomemp() {
		return prenomemp;
	}
	public void setPrenomemp(String prenomemp) {
		this.prenomemp = prenomemp;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public float getPrime() {
		return prime;
	}
	public void setPrime(float prime) {
		this.prime = prime;
	}
	public String getCodeprojet() {
		return codeprojet;
	}
	public void setCodeprojet(String codeprojet) {
		this.codeprojet = codeprojet;
	}
	public int getSuperieur() {
		return superieur;
	}
	public void setSuperieur(int superieur) {
		this.superieur = superieur;
	}
	@Override
	public String toString() {
		return "Employee [numemp=" + numemp + ", nomemp=" + nomemp + ", prenomemp=" + prenomemp + ", poste=" + poste
				+ ", salaire=" + salaire + ", prime=" + prime + ", codeprojet=" + codeprojet + ", superieur="
				+ superieur + "]";
	}
	
	
}
