package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! hsdhaisdhi";
    }
    
    @RequestMapping("/test")
    public String test() {
    	return "hye";
    }
    
    @RequestMapping(value = "/ex/foos", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public MyJSONResponse getFoosAsJsonFromREST() {
    	MyJSONResponse myResponse = new MyJSONResponse();
	    myResponse.setName("MyNode");
	    myResponse.setId(1);      
		return myResponse;
    }
    
}