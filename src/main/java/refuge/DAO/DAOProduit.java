package refuge.dao;

import java.util.List;

import javax.persistence.EntityManager;

import refuge.context.Singleton;
import refuge.model.Produit;

public class DAOProduit implements IDAO<Produit, Integer> {
	@Override
	public List<Produit> findAll() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		List<Produit> produits = em.createQuery("FROM Produit").getResultList();

		em.close();
		return produits;
	}


	@Override
	public Produit findById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		Produit produit = em.find(Produit.class, id);

		em.close();
		return produit;
	}

	@Override
	public Produit save(Produit produit) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();

		produit = em.merge(produit);

		em.getTransaction().commit();
		em.close();
		return produit;
	}

	@Override
	public void delete(Integer id) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		Produit produit = em.find(Produit.class,id);
		em.getTransaction().begin();

		em.remove(produit);

		em.getTransaction().commit();
		em.close();
	}
}
