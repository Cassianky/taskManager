package com.test.doctoranywhere.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.test.doctoranywhere.models.Task;

@Component
public interface TaskRepository extends JpaRepository<Task, Long> {
}