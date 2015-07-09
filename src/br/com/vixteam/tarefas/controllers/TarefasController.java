package br.com.vixteam.tarefas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.vixteam.tarefas.dao.TarefasDao;
import br.com.vixteam.tarefas.models.Tarefa;

@Controller

@RequestMapping("tarefa")
public class TarefasController {

		@RequestMapping("nova")
		public String form(){
			return "tarefas/formulario";
		}
		
		@RequestMapping(value="adiciona",
		method=RequestMethod.POST)
		public String adiciona(@Valid Tarefa tarefa,BindingResult result ,Model model){
			if(result.hasFieldErrors("descricao")){
				return "tarefas/formulario";
			}else{
				TarefasDao dao = TarefasDao.getInstance();
				dao.adiciona(tarefa);
				model.addAttribute("tarefa", tarefa);
				model.addAttribute("count",dao.listaTarefas.size());
				return "tarefas/adiciona";
			}
		}
		
		@RequestMapping(value="lista",
		method=RequestMethod.GET)
		public String lista(Tarefa tarefa, Model model){
			TarefasDao dao = TarefasDao.getInstance();
			model.addAttribute("tarefas", dao.listaTarefas);
			model.addAttribute("finalizado", tarefa.getFinalizado());
			return "tarefas/adicionada";
		}
		
		@RequestMapping("remove/{idx}")
		public String remove (@PathVariable int idx){
			TarefasDao dao =  TarefasDao.getInstance();
			dao.listaTarefas.remove(idx);
			return "redirect:/tarefa/lista";
		}
		
		@RequestMapping("edita/{idx}")
		public String edita(@PathVariable int idx,Model model){
			TarefasDao dao = TarefasDao.getInstance();
			Tarefa tarefa = dao.listaTarefas.get(idx);
			model.addAttribute("tarefa", tarefa);
			model.addAttribute("idx", idx);
			return "tarefas/segundoForm";
			
		}
		
		@RequestMapping(value="atualiza",
				method=RequestMethod.POST)
		public String atualiza(Tarefa tarefa){
			TarefasDao dao = TarefasDao.getInstance();
			int x =tarefa.getId();
			dao.listaTarefas.set(x, tarefa);
			return "redirect:/tarefa/lista";
			
		}
		
	
}
