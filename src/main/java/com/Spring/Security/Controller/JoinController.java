package com.Spring.Security.Controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import com.Spring.Security.Service.JoinService;
import com.Spring.Security.DTO.JoinDTO;
import lombok.RequiredArgsConstructor;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {
        return "Ok";
    }
}
