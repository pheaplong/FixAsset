package custom.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import custom.erp.entity.DataLookUp;

@Repository
public interface IDataLookUpRepository extends JpaRepository<DataLookUp, String> {

	List<DataLookUp> findByLookupGroup(String group);
}
