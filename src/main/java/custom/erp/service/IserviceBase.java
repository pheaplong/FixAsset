package custom.erp.service;

import java.util.List;
import java.util.Optional;

public interface IserviceBase<T> {
	public List<T> findAll() ;
	public Optional<T> findbyId(int Id) ;
	public  T getById(int Id) ;
	public void  insert(T t);
	public T  update(T t);
	public void deleteById(int id);
}
