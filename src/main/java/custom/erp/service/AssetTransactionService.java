package custom.erp.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import custom.erp.constant.AssetConstant;
import custom.erp.entity.AssetInfo;
import custom.erp.entity.AssetTransaction;
import custom.erp.entity.DataLookUp;
import custom.erp.exception.BussinessExceptionHandler;
import custom.erp.exception.ResourceNotFoundException;
import custom.erp.repository.IAssetInfoRepository;
import custom.erp.repository.IAssetTransactionRepository;
import custom.erp.util.GlobalLibrary;

@Service
public class AssetTransactionService {

	private IAssetTransactionRepository iAssetTransactionRepository;
	private DataLookUpService dataLookUpService;
	private AssetInfoService assetInfoService;

	@Autowired
	public void setAssetInfoService(AssetInfoService assetInfoService) {
		this.assetInfoService = assetInfoService;
	}

	@Autowired
	public void setDataLookUpService(DataLookUpService dataLookUpService) {
		this.dataLookUpService = dataLookUpService;
	}

	@Autowired
	public AssetTransactionService(IAssetTransactionRepository iAssetTransactionRepository) {
		this.iAssetTransactionRepository = iAssetTransactionRepository;
	}

	
	public List<AssetTransaction> findAll(Optional<Integer> assId) {
		return iAssetTransactionRepository.findAll(assId);
	}

	
	public Optional<AssetTransaction> findbyId(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public AssetTransaction getById(int Id) {
		AssetTransaction assetTransaction;
		try {
			assetTransaction=iAssetTransactionRepository.findById(Id).get();
		} catch (Exception e) {
			throw new ResourceNotFoundException();
		}
		return assetTransaction;
	}

	
	public void insert(AssetTransaction assetTransaction) {
		AssetInfo assetInfo=assetInfoService.getById(assetTransaction.getAssId());
		System.out.println(assetInfo.toString());
		try {
			assetInfo.isNotInRequestState();
		} catch (Exception e) {
			throw new BussinessExceptionHandler("Asset must be approved before have any transaction");
		}
		
		assetTransaction.setTrnId(0);
		assetTransaction.setPrevBrId(assetInfo.getBrId());
		assetTransaction.setPrevOwnerId(assetInfo.getOwnerId());
		assetTransaction.isValid();
		assetTransaction.setTrnStatus(AssetConstant.ASSET_TRN_STATUS_REQUEST);
		iAssetTransactionRepository.save(assetTransaction);
	}

	
	public AssetTransaction update(AssetTransaction assetTransaction) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public void approveTransaction(AssetTransaction assetTransaction) {
		AssetTransaction tran = iAssetTransactionRepository.getById(assetTransaction.getTrnId());
		tran.isInRequestState();
		iAssetTransactionRepository.updateAssetTransactionStatusToApprove(assetTransaction.getTrnId(), assetTransaction.getApproveUsr());

		DataLookUp lookUp = dataLookUpService.getById(tran.getTrnType());
		iAssetTransactionRepository.updateAssetInfoStatusByTrnType(tran.getAssId(),tran.getBrId(),tran.getOwnerId(),lookUp.getLookup1Value());
	}
	
	@Transactional
	public void rejectTransaction(AssetTransaction assetTransaction) {
		AssetTransaction tran = iAssetTransactionRepository.getById(assetTransaction.getTrnId());
		tran.isInRequestState();
		iAssetTransactionRepository.rejectTransaction(assetTransaction.getTrnId(),assetTransaction.getApproveUsr());
	}

	public void insertWithApprove(AssetTransaction assetTransaction){
		AssetTransaction tmp = new AssetTransaction(0, assetTransaction.getAssId(), AssetConstant.ASSET_TRN_TYPE_APPROVE, null, null, null, null, GlobalLibrary.getDateNowFormatted(), "", AssetConstant.ASSET_TRN_STATUS_APPROVED, assetTransaction.getApproveUsr(), null, null, new Date(),assetTransaction.getApproveUsr()	, GlobalLibrary.getDateNowFormatted());
		iAssetTransactionRepository.save(tmp);
		
	}
}
