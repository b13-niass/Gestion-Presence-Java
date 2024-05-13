package promotion;

import auther.DateGes;

public class Promotion {
	private int id;
	private String libelle;
	private DateGes dateDebut;
	private DateGes dateFin;
	private int statut;
	
	public Promotion() {
	}

	public Promotion(int id, String libelle, DateGes dateDebut, DateGes dateFin, int statut) {
		this.id = id;
		this.libelle = libelle;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.statut = statut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public DateGes getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(DateGes dateDebut) {
		this.dateDebut = dateDebut;
	}

	public DateGes getDateFin() {
		return dateFin;
	}

	public void setDateFin(DateGes dateFin) {
		this.dateFin = dateFin;
	}

	public int getStatut() {
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}
	
	
}
