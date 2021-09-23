package custom.erp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import custom.erp.entity.ChartOfAccount;

@Repository
public interface IChartOfAccountRepo extends JpaRepository<ChartOfAccount, String> {


}
