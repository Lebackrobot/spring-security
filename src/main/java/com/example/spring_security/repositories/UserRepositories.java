package com.example.spring_security.repositories;

import com.example.spring_security.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<UserModel, Long> {
}
