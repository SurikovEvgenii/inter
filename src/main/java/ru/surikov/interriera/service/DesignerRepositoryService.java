package ru.surikov.interriera.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.surikov.interriera.repository.DesignerRepository;

@Service
@RequiredArgsConstructor
public class DesignerRepositoryService {
    private final DesignerRepository designerRepository;
}
