package com.cydeo.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubjectController {
    @RequestMapping("math")
    public String Subject1(){
        return "student/subject.html";
    }
    @RequestMapping("english")
    public String Subject2(){
        return "student/subject.html";
    }
    @RequestMapping("/biology")
    public String Subject3(){
        return "student/subject.html";
    }

}
