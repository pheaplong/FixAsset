package custom.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import custom.erp.entity.Supplier;

public interface ISupplierRepository extends JpaRepository<Supplier, Integer> {

}
