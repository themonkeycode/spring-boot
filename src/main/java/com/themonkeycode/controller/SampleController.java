package com.themonkeycode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The Monkey Code Spring Boot - Sample Controller
 */
@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String treeHome() {
        return "Hello Monkey!";
    }
}
