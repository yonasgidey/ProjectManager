package projectManager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import projectManager.service.UserService;

@Controller
//@RequestMapping("/")
public class UserController {
	@Autowired
	UserService userService;
    
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST )
    public String authenticate( HttpServletRequest request, HttpServletResponse response)  {


        return "login";
    }

   
    @RequestMapping("/user")
    public String second() {
		return "second";
	}
}
