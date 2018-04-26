package com.wjz.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jinzi Wu at 18:06 on 2018/4/26.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "/index";
    }

}
