package com.wjz.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jinzi Wu at 20:00 on 2018/4/26.
 */
@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(){
        return "/about";
    }
}
