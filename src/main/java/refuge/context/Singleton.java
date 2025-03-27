package refuge.context;

import refuge.DAO.DAOAchat;
import refuge.DAO.DAOAnimal;
import refuge.DAO.DAOEspece;
import refuge.DAO.DAOProduit;
import refuge.DAO.DAOUtilisateur;

public class Singleton {

	private static Singleton instance=null; 

	private DAOAchat daoAchat = new DAOAchat();
	private DAOAnimal daoAnimal = new DAOAnimal();
	private DAOEspece daoEspece = new DAOEspece();
	private DAOProduit daoProduit = new DAOProduit();
	private DAOUtilisateur daoUtilisateur = new DAOUtilisateur();



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

}