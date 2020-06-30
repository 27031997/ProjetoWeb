package edu.curso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VideosController {

	@GetMapping("/videos_funcional_iniciante")
	public ModelAndView tbalunosTela() { 
		ModelAndView mv = new ModelAndView("videos_funcional_iniciante");
		return mv;
	}
}
