package custom.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import custom.erp.entity.DataLookUp;

@Repository
public interface IDataLookUpRepository extends JpaRepository<DataLookUp, String> {

}
