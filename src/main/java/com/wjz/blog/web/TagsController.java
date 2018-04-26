package com.wjz.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jinzi Wu at 19:54 on 2018/4/26.
 */

@Controller
public class TagsController {

    @GetMapping("tags")
    public String tags(){
        return "/tags";
    }
}
