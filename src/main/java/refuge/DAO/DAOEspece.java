package refuge.dao;

import java.util.List;

import javax.persistence.EntityManager;

import refuge.context.Singleton;
import refuge.model.Espece;

public class DAOEspece implements IDAO<Espece, Integer> {
	@Override
	public List<Espece> findAll() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		List<Espece>  especes = em.createQuery("FROM Espece").getResultList();

		em.close();
		return especes;
	}


	@Override
	public Espece findById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		Espece espece = em.find(Espece.class, id);

		em.close();
		return espece;
	}

	@Override
	public Espece save(Espece espece) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();

		espece = em.merge(espece);

		em.getTransaction().commit();
		em.close();
		return espece;
	}

	@Override
	public void delete(Integer id) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		Espece espece = em.find(Espece.class,id);
		em.getTransaction().begin();

		em.remove(espece);

		em.getTransaction().commit();
		em.close();
	}
}
