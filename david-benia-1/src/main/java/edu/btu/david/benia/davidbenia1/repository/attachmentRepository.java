package edu.btu.david.benia.davidbenia1.repository;

import edu.btu.david.benia.davidbenia1.model.attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface attachmentRepository extends JpaRepository<attachment, Long> {
}
