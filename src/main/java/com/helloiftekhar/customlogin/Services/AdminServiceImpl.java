package com.helloiftekhar.customlogin.Services;

import com.helloiftekhar.customlogin.Dto.AdminDto;
import com.helloiftekhar.customlogin.Model.Admin;
import com.helloiftekhar.customlogin.Repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

   private AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin findByUsernname(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin FindByEmail(String Email) {
        return adminRepository.findByEmail(Email);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin(adminDto.getUsername(), adminDto.getEmail(),adminDto.getPassword());
        return adminRepository.save(admin);
    }



}



