package br.com.vixteam.tarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class olamundoController {
	@RequestMapping(value="/ola/{nome}",method=RequestMethod.GET)
	public String execute(@PathVariable String nome, Model model){
		System.out.println("Saída log " + nome);
		model.addAttribute("nome", nome);
		return "Olamundo";
	}
	
	
	@RequestMapping(value="/form1",method=RequestMethod.GET)
	public String execute( Model model){
		return "form";
	}
	
	
	@RequestMapping(value="/ola/{nome}",method=RequestMethod.POST)
	public String execute(){
		
		System.out.println("Entrei no post");
		return "Olamundo";
	}
	
	


}
