package fr.kubrrickTutorial.simplelist;

public class Personne {
	
	
	private String nom;
	private String prenom;
	private int age;
	private String adresse;
	private String telephone;
	
	
	public Personne(String nom, String prenom, int age, String adresse, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.telephone = telephone;
	}



	public String getNom() {
		return nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public int getAge() {
		return age;
	}
	
	
	public String getAdresse(){
		return adresse;
	}
	
	public String getTelephone(){
		return telephone;
	}

}
