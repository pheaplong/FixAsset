package custom.erp.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.constant.AssetConstant;
import custom.erp.entity.AssetTransaction;
import custom.erp.entity.DataLookUp;
import custom.erp.repository.IAssetTransactionRepository;
import custom.erp.util.DBDateTime;

@Service
public class AssetTransactionService implements IserviceBase<AssetTransaction> {

	IAssetTransactionRepository iAssetTransactionRepository;
	private DataLookUpService dataLookUpService;

	@Autowired
	public void setDataLookUpService(DataLookUpService dataLookUpService) {
		this.dataLookUpService = dataLookUpService;
		System.out.println("from setter");
	}

	@Autowired
	public AssetTransactionService(IAssetTransactionRepository iAssetTransactionRepository) {
		this.iAssetTransactionRepository = iAssetTransactionRepository;
	}

	@Override
	public List<AssetTransaction> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<AssetTransaction> findbyId(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssetTransaction getById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(AssetTransaction t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AssetTransaction update(AssetTransaction t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public void approveTransaction(AssetTransaction assetTransaction) {
		AssetTransaction tran = iAssetTransactionRepository.getById(assetTransaction.getTrnId());
		iAssetTransactionRepository.updateAssetTransactionStatusToApprove(assetTransaction.getTrnId(), assetTransaction.getApproveUsr());
		DataLookUp lookUp = dataLookUpService.getById(tran.getTrnType());
		iAssetTransactionRepository.updateAssetInfoStatusByTrnType(tran.getAssId(),tran.getBrId(),tran.getOwnerId(),lookUp.getLookup1Value());
	}
	
	@Transactional
	public void rejectTransaction(AssetTransaction assetTransaction) {
		iAssetTransactionRepository.rejectTransaction(assetTransaction.getTrnId(),assetTransaction.getApproveUsr());
	}

	public void insertWithApprove(AssetTransaction assetTransaction){
		AssetTransaction tmp = new AssetTransaction(155, 5, AssetConstant.ASSET_TRN_TYPE_APPROVE, null, null, null, null, "asd", "asd", "st", assetTransaction.getApproveUsr(), null, null, new Date(),assetTransaction.getApproveUsr()	, null);
		iAssetTransactionRepository.save(tmp);
		System.out.println("========================="+tmp.getTrnId()+"======"+tmp.getUpdtDt());
		
	}
}
