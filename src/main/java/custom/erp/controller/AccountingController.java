package custom.erp.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.tokens.FlowMappingEndToken;

import custom.erp.entity.DataLookUp;
import custom.erp.entity.GeneralLedger;
import custom.erp.entity.JournalEntry;
import custom.erp.service.DataLookUpService;
import custom.erp.service.GeneralLedgerService;
import custom.erp.service.JournalEntryService;

@RestController
@RequestMapping("/api/Accountings")
public class AccountingController {
	private JournalEntryService journalEntryService;

	private GeneralLedgerService generalLedgerService;

	@Autowired
	public void setJournalEntryService(JournalEntryService journalEntryService) {
		this.journalEntryService = journalEntryService;
	}

	@Autowired
	public void setGeneralLedgerService(GeneralLedgerService generalLedgerService) {
		this.generalLedgerService = generalLedgerService;
	}
	
	@GetMapping("/")
	public void addJournaleEntry() {
		JournalEntry journalEntry=new JournalEntry();
		journalEntry.setPostDate("20210909");
		journalEntry.setValueDate("20210909");
		journalEntry.setTotalDr(100.0);
		journalEntry.setTotalCr(100.0);
		GeneralLedger gen1=new GeneralLedger();
		gen1.setDrCr("C");
		gen1.setAmtCr(50.0);
		gen1.setPostDate("20210909");
		gen1.setValueDate("20210909");
		GeneralLedger gen2 = new GeneralLedger();
		gen2.setDrCr("D");
		gen2.setAmtDr(50.0);
		gen2.setPostDate("20210909");
		gen2.setValueDate("20210909");
//		journalEntry.setGeneralLedgers(Arrays.asList( gen1,gen2));
		journalEntry.addGeneralLedger(gen1);
		journalEntry.addGeneralLedger(gen2);
		journalEntryService.insertJE(journalEntry);
	}
	
}
