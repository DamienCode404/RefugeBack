package refuge.dao;

import java.util.List;

import javax.persistence.EntityManager;

import refuge.context.Singleton;
import refuge.model.Animal;

public class DAOAnimal implements IDAO<Animal, Integer> {
	@Override
	public List<Animal> findAll() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		List<Animal>  animals = em.createQuery("FROM Animal").getResultList();

		em.close();
		return animals;
	}


	@Override
	public Animal findById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();

		Animal animal = em.find(Animal.class, id);

		em.close();
		return animal;
	}

	@Override
	public Animal save(Animal animal) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();

		animal = em.merge(animal);

		em.getTransaction().commit();
		em.close();
		return animal;
	}

	@Override
	public void delete(Integer id) {
		EntityManager em=Singleton.getInstance().getEmf().createEntityManager();
		Animal animal = em.find(Animal.class,id);
		em.getTransaction().begin();

		em.remove(animal);

		em.getTransaction().commit();
		em.close();
	}
}
