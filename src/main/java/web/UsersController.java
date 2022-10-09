package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import site.metacoding.red.domain.users.Users;

@Controller
public class UsersController {

	@GetMapping("/")
	public String GetUsers(){
		return "index";
	}
	
}

