package custom.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import custom.erp.entity.GeneralLedger;

@Repository
public interface IGeneralLedgerRepo extends JpaRepository<GeneralLedger, Integer> {

}
