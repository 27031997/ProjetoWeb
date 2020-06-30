package edu.curso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class tabelaController {
 
	/*@Autowired
	List<Cadastro> lista;*/
	
	@GetMapping("/tbalunos")
	public ModelAndView tbalunosTela() { 
		ModelAndView mv = new ModelAndView("tbalunos");
		return mv;
	}
	
	
	
}
