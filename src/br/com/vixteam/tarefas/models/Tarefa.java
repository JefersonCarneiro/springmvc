package br.com.vixteam.tarefas.models;

import java.io.Serializable;
import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Tarefa implements Serializable {
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -7695040393540693894L;
	private int id;
	@NotBlank(message="Não pode blá blá")
	@Size(min=10)
	@Valid
	private String descricao;
	private boolean finalizado;
	private Calendar dataFinalizacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public boolean getFinalizado(){
		return finalizado;
	}
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	
		
}
