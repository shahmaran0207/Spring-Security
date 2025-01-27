package com.Spring.Security.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.Spring.Security.Repository.UserRepository;
import org.springframework.stereotype.Service;
import com.Spring.Security.Entity.UserEntity;
import com.Spring.Security.DTO.JoinDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void joinProcess(JoinDTO joinDTO) {
        String username=joinDTO.getUsername();
        String password=joinDTO.getPassword();
        Boolean isExist = userRepository.existsByUsername(username);

        if(isExist) return;

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername(username);
        userEntity.setPassword(bCryptPasswordEncoder.encode(password));
        userEntity.setRole("ROLE_USER");

        userRepository.save(userEntity);

    }
}
