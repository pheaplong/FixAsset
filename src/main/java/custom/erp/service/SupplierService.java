package custom.erp.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.entity.Supplier;
import custom.erp.repository.ISupplierRepository;

@Service
public class SupplierService implements IserviceBase<Supplier> {
	private ISupplierRepository iSupplierRepository;

	@Autowired
	public SupplierService(ISupplierRepository iSupplierRepository) {
		this.iSupplierRepository = iSupplierRepository;
	}

	@Override
	public List<Supplier> findAll() {
		return iSupplierRepository.findAll();
	}

	@Override
	public Optional<Supplier> findbyId(int Id) {
		return iSupplierRepository.findById(Id);
	}

	@Override
	public void insert(Supplier supplier) {
		supplier.setSupId(0);
		iSupplierRepository.save(supplier);
	}

	@Override
	public void deleteById(int id) {
		iSupplierRepository.deleteById(id);
	}

	@Override
	public Supplier getById(int Id) {
		return iSupplierRepository.getById(Id);
	}

	@Override
	public Supplier update(Supplier supplier) {
		iSupplierRepository.save(supplier);
		return iSupplierRepository.getById(supplier.getSupId());
	}

}
