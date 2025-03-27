package refuge.DAO;

import java.util.List;

public class IDAO<T,K> {
	public List<T> findAll();
	public T findById(K id);
	public T save(T obj);
	public void delete(K id);
}