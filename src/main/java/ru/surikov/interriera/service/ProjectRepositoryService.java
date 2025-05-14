package ru.surikov.interriera.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.surikov.interriera.repository.ProjectRepository;

@Service
@RequiredArgsConstructor
public class ProjectRepositoryService {
    private final ProjectRepository projectRepository;
}
