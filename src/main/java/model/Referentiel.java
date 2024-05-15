package model;

import model.builder.ReferentielBuilder;

public class Referentiel {
    private int id;
    private String libelle;
    private String image;

    public Referentiel(ReferentielBuilder referentielBuilder) {
        this.id = referentielBuilder.getId();
        this.libelle = referentielBuilder.getLibelle();
        this.image = referentielBuilder.getImage();
    }

    public static ReferentielBuilder getBuilder(){
        return new ReferentielBuilder();
    }

}
