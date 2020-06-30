package edu.curso;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {
	
	@Autowired
	List<Cadastro> lista;
	
	@GetMapping("/cadastrando")
	public ModelAndView cadastrandoTela() { 
		ModelAndView mv = new ModelAndView("cadastrando");
		mv.addObject("cadastro", new Cadastro());
		return mv;
	}
	
	@PostMapping("/cadastroController")
	public ModelAndView cadastroCadastrar(@ModelAttribute("cadastro") Cadastro c, 
			@RequestParam("cmd") String cmd) {
		List<Cadastro> cadastrado = new ArrayList<Cadastro>();
		ModelAndView mv = new ModelAndView("cadastrando");
		mv.addObject("cadastrado", cadastrado);
		mv.addObject("cadastro", new Cadastro());
		if ("cadastrar".equals(cmd)) { 
			lista.add(c);
			System.out.printf("Lista tem %d elementos. \n", lista.size());
		}
		return mv;
	}
}
