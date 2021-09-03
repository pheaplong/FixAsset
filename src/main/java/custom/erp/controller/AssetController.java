package custom.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import custom.erp.entity.AssetInfo;
import custom.erp.entity.AssetTransaction;
import custom.erp.entity.Invoice;
import custom.erp.entity.Supplier;
import custom.erp.service.AssetInfoService;
import custom.erp.service.AssetTransactionService;
import custom.erp.service.InvoiceService;
import custom.erp.service.SupplierService;

//@CrossOrigin(origins="http://localhost:3000",exposedHeaders = "*")
@RestController
@RequestMapping("/api/asset")
public class AssetController {
	//========================================Properties========================================
	private InvoiceService invoiceService;
	private SupplierService supplierService;
	private AssetInfoService assetInfoService;
	private AssetTransactionService assetTransactionService;
	
	
	@Autowired
	public void setInvoiceService(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}
	
	@Autowired
	public void setSupplierService(SupplierService supplierService) {
		this.supplierService = supplierService;
	}
	
	@Autowired
	public void setAssetInfoService(AssetInfoService assetInfoService) {
		this.assetInfoService = assetInfoService;
	}
	 
	@Autowired
	public void setAssetTransactionService(AssetTransactionService assetTransactionService) {
		this.assetTransactionService = assetTransactionService;
	}

//==============================================================================================

	@GetMapping("/invoices")
	public List<Invoice> getInvoice() {
		return invoiceService.findAll();
	}


	@GetMapping("/invoices/{Id}")
	public Invoice getInvoiceById(@PathVariable int Id) {
		return invoiceService.findbyId(Id).get();
	}

	@PutMapping("/invoices/{Id}")
	public void updateInvoice(@RequestBody Invoice invoice) {
		invoiceService.update(invoice);
	}

	@DeleteMapping("/invoices/{Id}")
	public void deleteInvoice(@PathVariable int Id) {
		invoiceService.deleteById(Id);
	}
	
	//========================Supplier===============

	@GetMapping("/suppliers")
	public List<Supplier> getsupplier() {
		return supplierService.findAll();
	}

	@GetMapping("/suppliers/{Id}")
	public Supplier getSupplierById(@PathVariable int Id) {
		return supplierService.findbyId(Id).get();
	}

	@PutMapping("/suppliers/{Id}")
	public void updateInvoice(@RequestBody Supplier supplier) {
		supplierService.update(supplier);
	}
	
	//========================Asset Information===============

	@GetMapping("/assetinfos")
	public List<AssetInfo> getAssetInfo() {
		List<AssetInfo> assetInfos = assetInfoService.findAll();
		System.out.println(assetInfos.size());
		return assetInfos;
	}

	@GetMapping("/assetinfos/{Id}")
	public AssetInfo getAssetInfoById(@PathVariable int Id) {
		System.out.println(Id);
		return assetInfoService.findbyId(Id).get();
	}

	@PutMapping("/assetinfos/{Id}")
	public void updateAssetInfo(@RequestBody AssetInfo assetInfo) {
		assetInfoService.update(assetInfo);
	}
	
	@PutMapping("/assetinfos/{Id}/approval")
	public void approveAsset(@PathVariable int Id) throws Exception {
		AssetInfo assetInfo = new AssetInfo();
		assetInfo.setApproveUsr("2");
		assetInfo.setAssId(Id);
		assetInfoService.approveAsset(assetInfo);
	}
	
	@DeleteMapping("/assetinfos/{Id}/approval")
	public void deleteAsset(@PathVariable int Id) throws Exception {
		AssetInfo assetInfo = new AssetInfo();
		assetInfo.setApproveUsr("2");
		assetInfo.setAssId(Id);
		assetInfoService.rejectAsset(assetInfo);
	}

	//========================Asset Transaction===============

	@GetMapping("/assetTransactions")
	public List<AssetTransaction> getAssetTransaction() {
		return assetTransactionService.findAll();
	}

	@GetMapping("/assetTransactions/{Id}")
	public AssetTransaction getAssetTransactionById(@PathVariable int Id) {
		return assetTransactionService.findbyId(Id).get();
	}

	@PutMapping("/assetTransactions/{Id}")
	public void updateAssetTransaction(@RequestBody AssetTransaction assetTransaction) {
		assetTransactionService.update(assetTransaction);
	}

	@PutMapping("/assetTransactions/{Id}/approval")
	public void approveAssetTransaction(@PathVariable int Id) {
		AssetTransaction assetTransaction=new AssetTransaction();
		assetTransaction.setTrnId(Id);
		assetTransaction.setApproveUsr("2");
		assetTransactionService.approveTransaction(assetTransaction);
	}

	@DeleteMapping("/assetTransactions/{Id}/approval")
	public void rejectTransaction(@PathVariable int Id) {
		AssetTransaction assetTransaction=new AssetTransaction();
		assetTransaction.setTrnId(Id);
		assetTransaction.setApproveUsr("2");
		assetTransactionService.rejectTransaction(assetTransaction);
	}
	
	
	
}
