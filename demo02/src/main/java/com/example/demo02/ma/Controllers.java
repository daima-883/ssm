package com.example.demo02.ma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/a")
public class Controllers {
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String a(){
        System.out.println(123);
        return "123";
    }
}
