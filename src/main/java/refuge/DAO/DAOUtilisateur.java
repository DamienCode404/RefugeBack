package refuge.dao;

import java.util.List;

import javax.persistence.EntityManager;

import refuge.context.Singleton;
import refuge.model.Admin;
import refuge.model.Client;
import refuge.model.Utilisateur;
import refuge.model.Worker;

public class DAOUtilisateur implements IDAO<Utilisateur, Integer> {
	@Override
	public List<Utilisateur> findAll() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		List<Utilisateur>  utilisateurs = em.createQuery("FROM Utilisateur").getResultList();

		em.close();
		return utilisateurs;
	}

	@Override
	public Utilisateur findById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		Utilisateur utilisateur = em.find(Utilisateur.class, id);

		em.close();
		return utilisateur;
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();

		utilisateur = em.merge(utilisateur);

		em.getTransaction().commit();
		em.close();
		return utilisateur;
	}

	@Override
	public void delete(Integer id) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		Utilisateur utilisateur = em.find(Utilisateur.class,id);
		em.getTransaction().begin();

		em.remove(utilisateur);

		em.getTransaction().commit();
		em.close();
	}
	
	public List<Admin> findAllAdmin() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		List<Admin> admins = em.createQuery("FROM Admin").getResultList();

		em.close();
		return admins;
	}
	

	public List<Worker> findAllWorker() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		List<Worker> workers = em.createQuery("FROM Worker").getResultList();

		em.close();
		return workers;
	}
	
	public List<Client> findAllClient() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		List<Client> clients = em.createQuery("FROM Worker").getResultList();

		em.close();
		return clients;
	}
	
	/*
	public Client findByIdWithAchats(Integer idClient) 
	{
		
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		Query query = em.createQuery("SELECT c FROM Client c LEFT JOIN FETCH c.achats where c.id = :id");
		query.setParameter("id", idClient);
		Client client = (Client) query.getSingleResult();

		em.close();
		return client;
		
	}
	
	
	public Fournisseur findByIdWithStock(Integer idFournisseur) 
	{
		
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		Fournisseur fournisseur =em.createQuery("SELECT f FROM Fournisseur f LEFT JOIN FETCH f.stock where f.id = :id",Fournisseur.class).setParameter("id", idFournisseur).getSingleResult();

		em.close();
		return fournisseur;
		
	}
	*/
}
