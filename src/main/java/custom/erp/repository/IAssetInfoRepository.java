package custom.erp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import custom.erp.entity.AssetInfo;

public interface IAssetInfoRepository extends JpaRepository<AssetInfo, Integer> {

	@Transactional
	@Modifying
	@Query(nativeQuery = true,
			value = "UPDATE HR_ASSET SET\r\n"
					+ "			ASS_STATUS=:ASSSTATUS,\r\n"
					+ "			approve_usr=:APPROVEUSR,\r\n"
					+ "			approve_dt=TO_CHAR(SYSDATE,'YYYYMMDD')\r\n"
					+ "			WHERE ASS_ID=:ASSID")
	void changeAssetStatus(@Param("ASSID") int assId, @Param("ASSSTATUS") String asssStatus, @Param("APPROVEUSR") String approveUser);

}
