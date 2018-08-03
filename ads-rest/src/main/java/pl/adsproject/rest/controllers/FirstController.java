package pl.adsproject.rest.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

    @RequestMapping(method = RequestMethod.GET, value ="/first")
    @ResponseBody
    public String return7(){
        return "7";
    }
}
