package com.management.app.security.repository;

import com.management.app.security.entity.Usuario;
import com.management.util.structural.GenericRespository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends GenericRespository<Usuario,Long> {

    Optional<Usuario> findByUsername(String username);
    Boolean existsByUsername(String username);
    Optional<Usuario> findByEmail(String email);
}
