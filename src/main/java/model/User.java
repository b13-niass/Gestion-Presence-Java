package model;

import model.builder.UserBuilder;

public class User {
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
    private int role;

    public User(UserBuilder userBuilder) {
        this.id = userBuilder.getId();
        this.nom = userBuilder.getNom();
        this.prenom = userBuilder.getPrenom();
        this.email = userBuilder.getEmail();
        this.telephone = userBuilder.getTelephone();
        this.genre = userBuilder.getGenre();
        this.dateNaissance = userBuilder.getDateNaissance();
        this.lieuNaissance = userBuilder.getLieuNaissance();
        this.numeroCNI = userBuilder.getNumeroCNI();
        this.image = userBuilder.getImage();
        this.role = userBuilder.getRole();
    }

    public static UserBuilder getBuilder(){
        return new UserBuilder();
    }

}
