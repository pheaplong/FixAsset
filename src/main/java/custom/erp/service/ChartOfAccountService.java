package custom.erp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.entity.ChartOfAccount;
import custom.erp.repository.IChartOfAccountRepo;

@Service
public class ChartOfAccountService {
	private IChartOfAccountRepo iChartOfAccount;

	@Autowired
	public void setiChartOfAccount(IChartOfAccountRepo iChartOfAccount) {
		this.iChartOfAccount = iChartOfAccount;
	}
	
	public List<ChartOfAccount> getCoa(Optional<String> jeId) {
			return iChartOfAccount.findAll();
	}
	
}
