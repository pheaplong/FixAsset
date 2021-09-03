package custom.erp.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.entity.Invoice;
import custom.erp.repository.IInvoiceRepository;

@Service
public class InvoiceService implements IserviceBase<Invoice> {
	private IInvoiceRepository iInvoiceRepository;

	@Autowired
	public void setInvoiceService(IInvoiceRepository iInvoiceRepository) {
		this.iInvoiceRepository = iInvoiceRepository;
	}

	@Override
	public List<Invoice> findAll() {
		return iInvoiceRepository.findAll();
	}

	@Override
	public Optional<Invoice> findbyId(int Id) {
		return iInvoiceRepository.findById(Id);
	}

	@Override
	public void insert(Invoice invoice) {
		invoice.setInvId(0);
		iInvoiceRepository.save(invoice);
	}

	@Override
	public void deleteById(int Id)  {
		iInvoiceRepository.deleteById(Id);
	}

	@Override
	public Invoice getById(int Id) {
		return iInvoiceRepository.getById(Id);
	}

	@Override
	public Invoice update(Invoice invoice) {
		iInvoiceRepository.save(invoice);
		return iInvoiceRepository.getById(invoice.getInvId());
	}


}
