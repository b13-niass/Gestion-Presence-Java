package referentiel;

public class Referentiel {
	private int id;
	private String libelle;
	private String image;
	
	public Referentiel() {
	}

	public Referentiel(int id, String libelle, String image) {
		this.id = id;
		this.libelle = libelle;
		this.image = image;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
