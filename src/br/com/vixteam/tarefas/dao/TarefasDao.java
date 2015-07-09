package br.com.vixteam.tarefas.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.vixteam.tarefas.models.Tarefa;

public class TarefasDao {
	   private static TarefasDao instance = null;
	   public List<Tarefa> listaTarefas = new ArrayList<Tarefa>();
	   public List<Tarefa> getListaTarefas() {
		return listaTarefas;
	}
	public void setListaTarefas(List<Tarefa> listaTarefas) {
		this.listaTarefas = listaTarefas;
	}
	public static void setInstance(TarefasDao instance) {
		TarefasDao.instance = instance;
	}
	protected TarefasDao() {
	      // Exists only to defeat instantiation.
	   }
	   public static TarefasDao getInstance() {
	      if(instance == null) {
	         instance = new TarefasDao();
	      }
	      return instance;
	   }
	   
	   public void adiciona(Tarefa tarefa) {
		   tarefa.setId((int) (listaTarefas.size()+0l));
		   listaTarefas.add(tarefa);
	   }

}
