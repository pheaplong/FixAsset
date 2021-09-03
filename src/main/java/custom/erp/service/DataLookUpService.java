package custom.erp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.entity.DataLookUp;
import custom.erp.repository.IDataLookUpRepository;

@Service
public class DataLookUpService implements IserviceBase<DataLookUp> {

	private IDataLookUpRepository iDataLookUpRepository;


	public IDataLookUpRepository getiDataLookUpRepository() {
		return iDataLookUpRepository;
	}

	@Autowired
	public void setiDataLookUpRepository(IDataLookUpRepository iDataLookUpRepository) {
		this.iDataLookUpRepository = iDataLookUpRepository;
	}

	@Override
	public List<DataLookUp> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DataLookUp> findbyId(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataLookUp getById(int Id) {
		return null;
	}

	public DataLookUp getById(String Id) {
		return iDataLookUpRepository.getById(Id);
	}

	@Override
	public void insert(DataLookUp t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataLookUp update(DataLookUp t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
