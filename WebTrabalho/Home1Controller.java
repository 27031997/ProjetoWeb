package edu.curso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home1Controller {
	
	@GetMapping("/home1")
	public ModelAndView tbalunosTela() { 
		ModelAndView mv = new ModelAndView("home1");
		return mv;
	}
	
}
