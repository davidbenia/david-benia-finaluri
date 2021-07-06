package edu.btu.david.benia.davidbenia2.repository;

import edu.btu.david.benia.davidbenia2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
