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

    //@RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    //public String helloWithQueryParam(@RequestParam String name){
    //    return "Hello, "+name;
    //}

    //Handles requests /hello/Launchcode

    //@GetMapping("hello/{name}")
    //public String helloWithPathParam(@PathVariable String name){
    //    return "Hello, "+name;
   //}

    //Handle Form Submission
    @RequestMapping(value = "form", method=RequestMethod.GET)
    @ResponseBody
    public String helloForm(){
        return "<html>"+
                "<body>"+
                "<form action='/hello' method='post'>"+
                "<input type='text' name='name' />"+
                "<select name='language'>"+
                "<option value = 'english'>English</option>"+
                "<option value = 'italian'>Italian</option>"+
                "<option value = 'german'>German</option>"+
                "<option value = 'romanian'>Romanian</option>"+
                "<option value = 'russian'>Russian</option>"+
                "</select>"+
                "<input type='submit' value='Greet me!'>"+
                "</form>"+
                "</body>"+
                "</html>";
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    @ResponseBody
    public static String createMessage(@RequestParam String name, @RequestParam String language){
        String greeting="";

        if(name== ""){
            return name="World";
        }

        if(language.equals("english")){
            greeting="Hello";
        }else if(language.equals("italian")){
            greeting="Bongiorno";
        }else if(language.equals("german")){
            greeting="Guten Tag";
        }else if(language.equals("romanian")){
            greeting="Buna ziua";
        }else if(language.equals("russian")){
            greeting="Privet";
        }

        return greeting+", "+name;
    }



}


