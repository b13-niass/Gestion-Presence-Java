package model;

import model.builder.DateGesBuilder;

public class DateGes {
    private int id;
    private int jour;
    private int mois;
    private int annee;

    public DateGes(DateGesBuilder dateGesBuilder) {
        this.id = dateGesBuilder.getId();
        this.jour = dateGesBuilder.getJour();
        this.mois = dateGesBuilder.getMois();
        this.annee = dateGesBuilder.getAnnee();
    }

    public static DateGesBuilder getBuilder() {
        return new DateGesBuilder();
    }
}
