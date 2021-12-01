package com.example.techprotocol.repositories;

import com.example.techprotocol.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
