package com.alm.highfi.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @RequestMapping("/")
    public String index(Model model, Principal principal) {
        return "index";
    }

    @RequestMapping("/securedPage")
    public String securedPage(Model model, Principal principal) {
        return "securedPage";
    }


    @RequestMapping(value = "/user")
    public String user() {
        return "user";
    }

    @RequestMapping(value = "/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/403")
    public String Error403() {
        return "403";
    }
}
