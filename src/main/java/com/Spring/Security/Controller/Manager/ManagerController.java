package com.Spring.Security.Controller.Manager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/Manager")
public class ManagerController {

    @GetMapping("/manager")
    public String manager(){
        return "/Manager/manager";
    }
}
