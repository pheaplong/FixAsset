package custom.erp.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sun.istack.Nullable;

import custom.erp.entity.AssetTransaction;

@Repository
public interface IAssetTransactionRepository extends JpaRepository<AssetTransaction, Integer> {
	@Modifying
	@Query(nativeQuery = true,
			value= "UPDATE HR_ASSET_TRN SET\r\n"
			+ "				TRN_STATUS='A02000003',\r\n"
			+ "				APPROVE_USR=:APPROVEUSR,\r\n"
			+ "				APPROVE_DT=to_char(sysdate,'YYYYMMDD')\r\n"
			+ "			WHERE TRN_ID=:TRNID "
			)
	void updateAssetTransactionStatusToApprove(@Param("TRNID") int Id,@Param("APPROVEUSR") String approveUser);

	@Modifying
	@Query(nativeQuery = true,
			value= "UPDATE HR_ASSET\r\n"
					+ "SET ASS_STATUS =:ASSSTATUS,\r\n"
					+ " BR_ID =:BRID,\r\n"
					+ " OWNER_ID =:OWNERID\r\n"
					+ "WHERE\r\n"
					+ "	ASS_ID =:ASSID")
	void updateAssetInfoStatusByTrnType(@Param("ASSID") int assId,
										@Param("BRID") String brId,
										@Param("OWNERID") String ownerId,
										@Param("ASSSTATUS") String assStatus);

	@Modifying
	@Query(nativeQuery = true,
			value= "UPDATE HR_ASSET_TRN SET\r\n"
					+ "		TRN_STATUS='A02000002',\r\n"
					+ "		APPROVE_USR=:APPROVEUSR,\r\n"
					+ "		APPROVE_DT=to_char(sysdate,'YYYYMMDD')\r\n"
					+ "	WHERE TRN_ID=:TRNID ")
	void rejectTransaction(@Param("TRNID") int Id,@Param("APPROVEUSR") String approveUser);
	
	@Transactional
	@Query(nativeQuery = true,
			value = "INSERT INTO HR_ASSET_TRN(\r\n"
					+ "			ASS_ID,\r\n"
					+ "			TRN_TYPE,\r\n"
					+ "			base_date,\r\n"
					+ "			trn_date,\r\n"
					+ "			TRN_STATUS,\r\n"
					+ "			INS_USR,\r\n"
					+ "			INS_DT,\r\n"
					+ "			APPROVE_USR,\r\n"
					+ "			APPROVE_DT\r\n"
					+ "		)VALUES(\r\n"
					+ "			:ASSID,\r\n"
					+ "			'A03000001',\r\n"
					+ "			TO_CHAR(SYSDATE,'YYYYMMDD'),\r\n"
					+ "			TO_CHAR(SYSDATE,'YYYYMMDD'),\r\n"
					+ "			'A02000003',\r\n"
					+ "			:APPROVEUSR,\r\n"
					+ "			SYSDATE,\r\n"
					+ "			:APPROVEUSR,\r\n"
					+ "			TO_CHAR(SYSDATE,'YYYYMMDD'))"
			)
	public void insertWithApprove(@Param("ASSID") int assId,@Param("APPROVEUSR") String approveUsr) ;
	
//	@Query(nativeQuery = true,
//			value = "SELECT * FROM HR_ASSET_TRN WHERE :ASSID IS NULL OR ASS_ID=TO_NUMBER(:ASSID)")
	@Query(nativeQuery = true,
			value = "SELECT * FROM VW_HR_ASSET_TRN WHERE ASS_ID=NVL(TO_NUMBER(:ASSID),ASS_ID) ORDER BY TRN_ID DESC")
	List<AssetTransaction> findAll(@Param("ASSID") @Nullable Optional<Integer> assID);
}
