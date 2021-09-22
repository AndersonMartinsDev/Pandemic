package com.management.app.auth.service;

import com.management.app.auth.UserDetailsEntity;
import com.management.app.security.entity.Usuario;
import com.management.app.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> optional = repository.findByUsername(username);
        if(optional.isPresent()) {
            return new UserDetailsEntity(optional.get());
        }
        throw new UsernameNotFoundException("User not found");
    }
}
