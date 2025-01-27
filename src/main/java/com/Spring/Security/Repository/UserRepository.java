package com.Spring.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Spring.Security.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByUsername(String username);
}
