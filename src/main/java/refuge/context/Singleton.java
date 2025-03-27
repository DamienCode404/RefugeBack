package refuge.context;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import refuge.dao.DAOAchat;
import refuge.dao.DAOAnimal;
import refuge.dao.DAOEspece;
import refuge.dao.DAOProduit;
import refuge.dao.DAOUtilisateur;

public class Singleton {

	private static Singleton instance=null; 

	private DAOAchat daoAchat = new DAOAchat();
	private DAOAnimal daoAnimal = new DAOAnimal();
	private DAOEspece daoEspece = new DAOEspece();
	private DAOProduit daoProduit = new DAOProduit();
	private DAOUtilisateur daoUtilisateur = new DAOUtilisateur();
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("contextJPA");



	private Singleton() {}



	public static Singleton getInstance() {
		if(instance==null) 
		{
			instance=new Singleton();
		}
		return instance;
	}



	public DAOAchat getDaoAchat() {
		return daoAchat;
	}



	public void setDaoAchat(DAOAchat daoAchat) {
		this.daoAchat = daoAchat;
	}



	public DAOAnimal getDaoAnimal() {
		return daoAnimal;
	}



	public void setDaoAnimal(DAOAnimal daoAnimal) {
		this.daoAnimal = daoAnimal;
	}



	public DAOEspece getDaoEspece() {
		return daoEspece;
	}



	public void setDaoEspece(DAOEspece daoEspece) {
		this.daoEspece = daoEspece;
	}



	public DAOProduit getDaoProduit() {
		return daoProduit;
	}



	public void setDaoProduit(DAOProduit daoProduit) {
		this.daoProduit = daoProduit;
	}



	public DAOUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}



	public void setDaoUtilisateur(DAOUtilisateur daoUtilisateur) {
		this.daoUtilisateur = daoUtilisateur;
	}



	public EntityManagerFactory getEmf() {
		return emf;
	}



	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public void closeEmf() 
	{
		this.emf.close();
	}
	
	

}