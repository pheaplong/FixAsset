package custom.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import custom.erp.entity.Invoice;

public interface IInvoiceRepository extends JpaRepository<Invoice, Integer> {

}
