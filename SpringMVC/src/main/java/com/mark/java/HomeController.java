package com.mark.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 4/24/15.
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public String home(){
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, String> json(){
        Map<String, String> result = new HashMap<String, String>();
        result.put("China", "Ni Hao");
        result.put("USA", "Hello");
        result.put("Russia", "HE HE");

        return result;
    }



}
