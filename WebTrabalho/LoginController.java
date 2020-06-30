//Trabalho Web
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
public class LoginController {
	
	@Autowired
	List<Login> lista;
	
	@GetMapping("/loginHome")
	public ModelAndView loginTela() { 
		ModelAndView mv = new ModelAndView("loginHome");
		mv.addObject("login", new Login());
		return mv;
	}
	
	@PostMapping("/loginController")
	public ModelAndView loginEntrar(@ModelAttribute("login") Login l, 
			@RequestParam("cmd") String cmd) {
		List<Login> logado = new ArrayList<Login>();
		ModelAndView mv = new ModelAndView("loginHome");
		mv.addObject("logado", logado);
		mv.addObject("login", new Login());
		if ("entrar".equals(cmd)) { 
			lista.add(l);
			System.out.printf("Lista tem %d elementos. \n", lista.size());
		}
		return mv;
	}

}
