package ru.surikov.interriera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.surikov.interriera.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
