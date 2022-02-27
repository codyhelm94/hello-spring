package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    /*
    //Handles requests at /hello
    @ResponseBody
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }*/

    //Handles requests at /goodbye

    @GetMapping("goodbye")
    public String goodbye(){
        return "goodbye";
    }

    //Handles requests of the form /hello?name=LaunchCode

    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, "+name;
    }

    //Handles requests /hello/Launchcode

    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello, "+name;
    }

    //Handle Form Submission
    @GetMapping("form")
    public String helloForm(){
        return "<html>"+
                "<body>"+
                "<form action='hello' method='post'>"+
                "<input type='text' name='name'>"+
                "<input type='submit' value='Greet me!'>"+
                "</form>"+
                "</body>"+
                "</html>";
    }



}
