package custom.erp.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import custom.erp.constant.AssetConstant;
import custom.erp.entity.AssetInfo;
import custom.erp.entity.AssetTransaction;
import custom.erp.exception.ResourceNotFoundException;
import custom.erp.repository.IAssetInfoRepository;

@Service
public class AssetInfoService implements IserviceBase<AssetInfo> {
	private IAssetInfoRepository iAssetInfoRepository;
	private AssetTransactionService assetTransactionService;

	@Autowired
	public AssetInfoService(IAssetInfoRepository iAssetInfoRepository) {
		this.iAssetInfoRepository = iAssetInfoRepository;
	}

	@Autowired
	public void setAssetTransactionService(AssetTransactionService assetTransactionService) {
		this.assetTransactionService = assetTransactionService;
	}


	@Override
	public List<AssetInfo> findAll() {
		return iAssetInfoRepository.findAll();
	}

	@Override
	public Optional<AssetInfo> findbyId(int Id) {
		return iAssetInfoRepository.findById(Id);
	}

	@Override
	public AssetInfo getById(int Id) {
		AssetInfo assetInfo;
		try {
			assetInfo = iAssetInfoRepository.findById(Id).get();
		} catch (Exception e) {
			throw new ResourceNotFoundException();
		}
		return assetInfo;
	}

	@Override
	public void insert(AssetInfo AssetInfo) {
		AssetInfo.setAssId(0);
		iAssetInfoRepository.save(AssetInfo);
	}

	@Override
	public void deleteById(int id) {
		iAssetInfoRepository.deleteById(id);
	}

	@Override
	public AssetInfo update(AssetInfo AssetInfo) {
		iAssetInfoRepository.save(AssetInfo);
		return iAssetInfoRepository.getById(AssetInfo.getAssId());
	}
	
	@Transactional
	public void approveAsset(AssetInfo assetInfo) throws Exception {
		AssetTransaction assetTransaction = new AssetTransaction();
		assetTransaction.setAssId(assetInfo.getAssId());
		assetTransaction.setApproveUsr(assetInfo.getApproveUsr());
		
		assetInfo=getById(assetInfo.getAssId());
		assetInfo.isInRequestState();

		iAssetInfoRepository.changeAssetStatus(assetInfo.getAssId(),AssetConstant.ASSET_STATUS_APPROVED,assetInfo.getApproveUsr());
		assetTransactionService.insertWithApprove(assetTransaction);
	}
	@Transactional
	public void rejectAsset(AssetInfo assetInfo) throws Exception {
		assetInfo=getById(assetInfo.getAssId());
		assetInfo.isInRequestState();

		iAssetInfoRepository.changeAssetStatus(assetInfo.getAssId(),AssetConstant.ASSET_STATUS_REJECTED,assetInfo.getApproveUsr());
	}


}
