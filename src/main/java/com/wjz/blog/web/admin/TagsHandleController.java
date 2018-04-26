package com.wjz.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jinzi Wu at 20:35 on 2018/4/26.
 */

@Controller
@RequestMapping("/admin")
public class TagsHandleController {

    @GetMapping("/tags/input")
    public String tagsInput(){
        return "/admin/tags_input";
    }

    @GetMapping("/tags/list")
    public String tagsList(){
        return "/admin/tags_list";
    }

}
