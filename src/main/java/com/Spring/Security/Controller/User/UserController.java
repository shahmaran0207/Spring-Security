package com.Spring.Security.Controller.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/User")
public class UserController {

    @GetMapping("/user")
    public String user(){
        return "/User/user";
    }

    @GetMapping("/login")
    public String login(){
        return "/User/login";
    }

    @GetMapping("/join")
    public String join(){
        return "/User/join";
    }

    @GetMapping("/joinProc")
    public @ResponseBody String joinProc(){
        return "회원가입 완료!";
    }
}
