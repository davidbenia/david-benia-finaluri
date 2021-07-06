package edu.btu.david.benia.davidbenia1.repository;

import edu.btu.david.benia.davidbenia1.model.tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tagRepository extends JpaRepository<tag, Long> {
}
