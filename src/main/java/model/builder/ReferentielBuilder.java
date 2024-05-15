package model.builder;

import model.Referentiel;

public class ReferentielBuilder {
    private int id;
    private String libelle;
    private String image;

    public int getId() {
        return id;
    }

    public ReferentielBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getLibelle() {
        return libelle;
    }

    public ReferentielBuilder setLibelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public String getImage() {
        return image;
    }

    public ReferentielBuilder setImage(String image) {
        this.image = image;
        return this;
    }

    public Referentiel build(){
        return new Referentiel(this);
    }
}
