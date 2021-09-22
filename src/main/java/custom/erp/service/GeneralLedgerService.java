package custom.erp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.entity.GeneralLedger;
import custom.erp.repository.IGeneralLedgerRepo;

@Service
public class GeneralLedgerService {

	private IGeneralLedgerRepo iGeneralLedgerRepo;

	@Autowired
	public void setiGeneralLedgerRepo(IGeneralLedgerRepo iGeneralLedgerRepo) {
		this.iGeneralLedgerRepo = iGeneralLedgerRepo;
	}
	
	public void insertGL(GeneralLedger generalLedger) {
		generalLedger.setGlId(0);
		iGeneralLedgerRepo.save(generalLedger);

		
	}
	
}
