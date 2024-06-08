package com.example.libexpress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lib-express/admin/dashboard")
public class DashboardController {
    @GetMapping
    public String getDashboardPage(Model model) {
        return "/admin/index";
    }
}
