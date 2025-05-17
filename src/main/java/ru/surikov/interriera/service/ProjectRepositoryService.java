package ru.surikov.interriera.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.surikov.interriera.entity.Project;
import ru.surikov.interriera.repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectRepositoryService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> findAll() {
        List<Project> projectList = projectRepository.findAll();
        return projectList;
    }

    public void save(Project project) {
        projectRepository.save(project);
    }
}
