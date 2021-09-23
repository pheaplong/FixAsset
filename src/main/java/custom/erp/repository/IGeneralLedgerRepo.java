package custom.erp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import custom.erp.entity.GeneralLedger;

@Repository
public interface IGeneralLedgerRepo extends JpaRepository<GeneralLedger, Integer> {

	@Query(nativeQuery = true,
			value = "SELECT * FROM JOURNAL_ENTRY JE WHERE JE.JE_ID = :JEID")
	List<GeneralLedger> findByJounalEntry(@Param("JEID") Optional<Integer> jeId);

}
