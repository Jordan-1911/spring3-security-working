package com.spring3.security.respositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring3.security.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}