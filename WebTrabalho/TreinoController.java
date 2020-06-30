package edu.curso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TreinoController {
	
	@GetMapping("/treinos")
	public ModelAndView tbalunosTela() { 
		ModelAndView mv = new ModelAndView("treinos");
		return mv;
	}

}
