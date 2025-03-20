package refuge.model;

import java.time.LocalDate;

public class Animal{
	private Integer id;
	private String nom;
	private String race;
	private LocalDate naissance;
	private String description;
	
	public Animal(Integer id, String nom, String race, LocalDate naissance, String description) {
		this.id = id;
		this.nom = nom;
		this.race = race;
		this.naissance = naissance;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public LocalDate getNaissance() {
		return naissance;
	}
	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nom=" + nom + ", race=" + race + ", naissance=" + naissance + ", description="
				+ description + "]";
	}
}
