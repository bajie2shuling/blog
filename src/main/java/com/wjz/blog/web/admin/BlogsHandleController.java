package com.wjz.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jinzi Wu at 20:10 on 2018/4/26.
 */

@Controller
@RequestMapping("/admin")
public class BlogsHandleController {

    @GetMapping("/blogs/input")
    public String blogsInput(){
        return "/admin/blogs_input";
    }

    @GetMapping("/blogs/list")
    public String blogList(){
        return "/admin/blogs_list";
    }
}
