package com.Spring.Security.Service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import com.Spring.Security.Repository.UserRepository;
import com.Spring.Security.DTO.CustomUserDetails;
import org.springframework.stereotype.Service;
import com.Spring.Security.Entity.UserEntity;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByUsername(username);

        if(userEntity != null) {

            return new CustomUserDetails(userEntity);
        }

        return null;
    }
}
