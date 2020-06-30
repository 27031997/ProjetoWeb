package edu.curso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ICQController {
	@GetMapping("/ICQ")
	public ModelAndView tbalunosTela() { 
		ModelAndView mv = new ModelAndView("ICQ");
		return mv;
	}
}
