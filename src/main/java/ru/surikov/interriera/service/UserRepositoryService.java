package ru.surikov.interriera.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.surikov.interriera.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserRepositoryService {
    @Autowired
    private final UserRepository userRepository;
}
