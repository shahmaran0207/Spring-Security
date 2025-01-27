package com.Spring.Security.Service;

import org.springframework.stereotype.Service;
import com.Spring.Security.DTO.JoinDTO;

@Service
public class JoinService {

    public void joinProcess(JoinDTO joinDTO) {
        String username=joinDTO.getUsername();
        String password=joinDTO.getPassword();

    }
}
