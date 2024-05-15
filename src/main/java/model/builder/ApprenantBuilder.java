package model.builder;

import model.Apprenant;
import model.User;

public class ApprenantBuilder {
    private int id;
    private String matricule;
    private int referentiel;
    private int promotion;
    private User user;

    public int getId() {
        return id;
    }

    public ApprenantBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getMatricule() {
        return matricule;
    }

    public ApprenantBuilder setMatricule(String matricule) {
        this.matricule = matricule;
        return this;
    }

    public int getReferentiel() {
        return referentiel;
    }

    public ApprenantBuilder setReferentiel(int referentiel) {
        this.referentiel = referentiel;
        return this;
    }

    public int getPromotion() {
        return promotion;
    }

    public ApprenantBuilder setPromotion(int promotion) {
        this.promotion = promotion;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ApprenantBuilder setUser(User user) {
        this.user = user;
        return this;
    }

    public Apprenant build() {
        return new Apprenant(this);
    }
}
