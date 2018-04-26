package com.wjz.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jinzi Wu at 19:56 on 2018/4/26.
 */
@Controller
public class ArchivesController {

    @GetMapping("/archives")
    public String archives(){
        return "/archives";
    }
}
