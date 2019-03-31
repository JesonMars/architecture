package com.jesse.modules.Test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("other")
public class OtherController {
    @RequestMapping("index")
    public String index(){
        return "/test/other.html";
    }
}
