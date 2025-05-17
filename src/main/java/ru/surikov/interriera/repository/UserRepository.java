package ru.surikov.interriera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.surikov.interriera.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
