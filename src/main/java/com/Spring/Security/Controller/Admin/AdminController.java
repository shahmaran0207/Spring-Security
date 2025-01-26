package com.Spring.Security.Controller.Admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/Admin")
public class AdminController {

    @GetMapping("/admin")
    public String admin(){
        return "/Admin/admin";
    }
}
