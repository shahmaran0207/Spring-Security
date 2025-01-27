package com.Spring.Security.Controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@ResponseBody
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "Admin Controller";
    }
}
