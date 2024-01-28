package com.tasks.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasks.manager.model.Task;
import com.tasks.manager.model.TaskStatus;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}
