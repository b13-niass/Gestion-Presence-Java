package presence;

import apprenant.Apprenant;
import auther.HeureGes;
import promotion.Promotion;

public class Presence {
	private int id;
	private Apprenant apprenant;
	private HeureGes heureArrivee;
	private Promotion promotion;
	
	public Presence() {
	}

	public Presence(int id, Apprenant apprenant, HeureGes heureArrivee, Promotion promotion) {
		this.id = id;
		this.apprenant = apprenant;
		this.heureArrivee = heureArrivee;
		this.promotion = promotion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Apprenant getApprenant() {
		return apprenant;
	}

	public void setApprenant(Apprenant apprenant) {
		this.apprenant = apprenant;
	}

	public HeureGes getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(HeureGes heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	

}
