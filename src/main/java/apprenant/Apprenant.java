package apprenant;

import auther.DateGes;

public class Apprenant {
	private int id;
    private String matricule;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private int genre;
    private DateGes dateNaissance;
    private String lieuNaissance;
    private String numeroCNI;
    private String image;
    private int referentiel;
    private int promotion;
    
    
	public Apprenant() {
		
	}


	public Apprenant(int id, String matricule, String nom, String prenom, String email, String telephone, int genre,
			DateGes dateNaissance, String lieuNaissance, String numeroCNI, String image, int referentiel,
			int promotion) {
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.genre = genre;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.numeroCNI = numeroCNI;
		this.image = image;
		this.referentiel = referentiel;
		this.promotion = promotion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public int getGenre() {
		return genre;
	}


	public void setGenre(int genre) {
		this.genre = genre;
	}


	public DateGes getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(DateGes dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getLieuNaissance() {
		return lieuNaissance;
	}


	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}


	public String getNumeroCNI() {
		return numeroCNI;
	}


	public void setNumeroCNI(String numeroCNI) {
		this.numeroCNI = numeroCNI;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public int getReferentiel() {
		return referentiel;
	}


	public void setReferentiel(int referentiel) {
		this.referentiel = referentiel;
	}


	public int getPromotion() {
		return promotion;
	}


	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
	
	
}
