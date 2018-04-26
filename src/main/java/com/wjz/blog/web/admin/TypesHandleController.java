package com.wjz.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jinzi Wu at 20:36 on 2018/4/26.
 */
@Controller
@RequestMapping("/admin")
public class TypesHandleController {

    @GetMapping("/types/input")
    public String typesInput(){
        return "/admin/types_input";
    }

    @GetMapping("/types/list")
    public String typesList(){
        return "/admin/types_list";
    }
}
