package com.cydeo.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/home")
   public String home(){   //which end point ? www.amazon.com/register
       return "home.html";
   }
    @RequestMapping({"/apple","/orange"})
    public String home1(){   //which end point ? www.amazon.com/register
        return "home.html";
    }
    @RequestMapping("/")
    public String home2(){   //which end point ? www.amazon.com/register
        return "home.html";
    }
}
