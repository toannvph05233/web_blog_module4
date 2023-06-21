package com.group3.demoDuLich.controllers;

import com.group3.demoDuLich.models.User;
import com.group3.demoDuLich.repository.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IBlogRepo iBlogRepo;


}
