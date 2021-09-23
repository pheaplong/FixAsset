package custom.erp.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.constant.AccountingConstant;
import custom.erp.entity.GeneralLedger;
import custom.erp.entity.JournalEntry;
import custom.erp.repository.IGeneralLedgerRepo;
import custom.erp.repository.IJournalEntryRepo;

@Service
public class JournalEntryService {
	private IJournalEntryRepo iJournalEntryRepo;
	private IGeneralLedgerRepo iGeneralLedgerRepo;
	
	@Autowired
	public void setiGeneralLedgerRepo(IGeneralLedgerRepo iGeneralLedgerRepo) {
		this.iGeneralLedgerRepo = iGeneralLedgerRepo;
	}

	@Autowired
	public void setiJournalEntryRepo(IJournalEntryRepo iJournalEntryRepo) {
		this.iJournalEntryRepo = iJournalEntryRepo;
	}
	
	@Transactional
	public List<JournalEntry> getJournalEntry() {
		return iJournalEntryRepo.findAll();
	}

	public void insertJE(JournalEntry journalEntry) {
		journalEntry.setJeId(0);
		journalEntry.setStatus(AccountingConstant.JOUNAL_ENTRY_STATUS_REQUEST);
		iJournalEntryRepo.save(journalEntry);
//		for (GeneralLedger	 tmp : journalEntry.getGeneralLedgers()) {
//			tmp.setJeId(journalEntry.getJeId());
//			iGeneralLedgerRepo.save(tmp);
//		}
		System.out.println(journalEntry.getJeId());
	}

	@OneToMany(fetch = FetchType.EAGER)
	public Optional<JournalEntry> getJournalEntryById(int jeId) {
		return iJournalEntryRepo.findById(jeId);
	}

}
