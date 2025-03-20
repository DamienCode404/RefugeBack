package refuge.model;

import java.time.LocalDate;

public class Achat{
	private Integer id;
	private Integer qte;
	private Double prix;
	private LocalDate date;
	
	public Achat(Integer id, Integer qte, Double prix, LocalDate date) {
		this.id = id;
		this.qte = qte;
		this.prix = prix;
		this.date = date;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQte() {
		return qte;
	}
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Achat [id=" + id + ", qte=" + qte + ", prix=" + prix + ", date=" + date + "]";
	}
	
}
