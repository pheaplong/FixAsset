package custom.erp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.entity.DataLookUp;
import custom.erp.exception.ResourceNotFoundException;
import custom.erp.repository.IDataLookUpRepository;

@Service
public class DataLookUpService{

	private IDataLookUpRepository iDataLookUpRepository;


	public IDataLookUpRepository getiDataLookUpRepository() {
		return iDataLookUpRepository;
	}

	@Autowired
	public void setiDataLookUpRepository(IDataLookUpRepository iDataLookUpRepository) {
		this.iDataLookUpRepository = iDataLookUpRepository;
	}

	public List<DataLookUp> findAll() {
		return iDataLookUpRepository.findAll();
	}

	public Optional<DataLookUp> findbyId(String Id) {
		return iDataLookUpRepository.findById(Id);
	}

	public List<DataLookUp> findbyGroup(String Id) {
		return iDataLookUpRepository.findByLookupGroup(Id);
	}

	public DataLookUp getById(String Id) {
		DataLookUp dataLookUp;
		try {
			dataLookUp = iDataLookUpRepository.findById(Id).get();
		} catch (Exception e) {
			throw new ResourceNotFoundException();
		}
		return dataLookUp;
	}

	public void insert(DataLookUp t) {
		// TODO Auto-generated method stub
		
	}

	public DataLookUp update(DataLookUp t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
