package ru.surikov.interriera.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.surikov.interriera.repository.DesignerRepository;

@Service
@RequiredArgsConstructor
public class DesignerRepositoryService {

    @Autowired
    private final DesignerRepository designerRepository;
}
