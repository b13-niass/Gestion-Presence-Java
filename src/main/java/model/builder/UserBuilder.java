package model.builder;

import model.DateGes;
import model.User;

public class UserBuilder {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private int genre;
    private DateGes dateNaissance;
    private String lieuNaissance;
    private String numeroCNI;
    private String image;

    public int getId() {
        return id;
    }

    public UserBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public UserBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public UserBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public UserBuilder setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public int getGenre() {
        return genre;
    }

    public UserBuilder setGenre(int genre) {
        this.genre = genre;
        return this;
    }

    public DateGes getDateNaissance() {
        return dateNaissance;
    }

    public UserBuilder setDateNaissance(DateGes dateNaissance) {
        this.dateNaissance = dateNaissance;
        return this;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public UserBuilder setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
        return this;
    }

    public String getNumeroCNI() {
        return numeroCNI;
    }

    public UserBuilder setNumeroCNI(String numeroCNI) {
        this.numeroCNI = numeroCNI;
        return this;
    }

    public String getImage() {
        return image;
    }

    public UserBuilder setImage(String image) {
        this.image = image;
        return this;
    }

    public User build(){
        return new User(this);
    }
}
