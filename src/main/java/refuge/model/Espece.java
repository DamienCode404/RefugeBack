package refuge.model;

public class Espece{
	private Integer id;
	private String libelle;
	
	public Espece(Integer id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Espece [id=" + id + ", libelle=" + libelle + "]";
	}

	
}
