package com.helloiftekhar.customlogin.controller;

import com.helloiftekhar.customlogin.Dto.AdminDto;
import com.helloiftekhar.customlogin.Services.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    private AdminService adminService;



    @GetMapping("/home")
    public String Home() {
        return "login";
    }


    @GetMapping("/login")
    public String Login() {
        return "login";
    }


    @GetMapping("/signup")
    public String Signup(Model model,AdminDto adminDto) {
      //  model.addAttribute(" admin",adminDto); // Assuming UserAuth is your form backing bean
        return "signup";
    }


  /*  @GetMapping("/signup")
    public String signup() {
        return "signup";
    }*/

    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }

}