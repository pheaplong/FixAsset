package custom.erp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.Where;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import custom.erp.entity.AssetInfo;

public interface IAssetInfoRepository extends JpaRepository<AssetInfo, Integer> {

	@Override
	@Query(nativeQuery = true,
	value = "SELECT * FROM HR_ASSET WHERE ASS_STATUS!='A01000002'")
	List<AssetInfo> findAll();
	
	List<AssetInfo> findByAssStatus(String assStatus);
	
	
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
