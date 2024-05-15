package model.builder;

import model.Apprenant;
import model.HeureGes;
import model.Presence;
import model.Promotion;

public class PresenceBuilder {
    private int id;
    private Apprenant apprenant;
    private HeureGes heureArrivee;
    private Promotion promotion;

    public int getId() {
        return id;
    }

    public PresenceBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public Apprenant getApprenant() {
        return apprenant;
    }

    public PresenceBuilder setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
        return this;
    }

    public HeureGes getHeureArrivee() {
        return heureArrivee;
    }

    public PresenceBuilder setHeureArrivee(HeureGes heureArrivee) {
        this.heureArrivee = heureArrivee;
        return this;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public PresenceBuilder setPromotion(Promotion promotion) {
        this.promotion = promotion;
        return this;
    }
    public Presence build(){
        return new Presence(this);
    }
}
