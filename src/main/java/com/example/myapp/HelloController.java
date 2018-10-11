package com.example.myapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! AYUS IS HERE";
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public MyJSONResponse getFoosAsJsonFromREST() {
    	MyJSONResponse myResponse = new MyJSONResponse();
    	myResponse.setName("MyNode");
    	myResponse.setId(1);
    	return myResponse;
    }
}