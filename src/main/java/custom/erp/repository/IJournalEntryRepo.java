package custom.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import custom.erp.entity.JournalEntry;

@Repository
public interface IJournalEntryRepo extends JpaRepository<JournalEntry, Integer> {

}
