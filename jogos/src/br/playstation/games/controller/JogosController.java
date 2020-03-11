package br.playstation.games.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.playstation.games.application.Util;
import br.playstation.games.model.Jogos;
import br.unitins.books.model.Usuario;

public class JogosController implements Serializable {

	private static final long serialVersionUID = 3110774732655529713L;

	private Jogos jogos;
	private List<Jogos> listaJogos;

	public void incluir() {

		if (getJogos().getNome().isBlank()) {
			Util.addErrorMessage("O campo nome deve ser informado");
			return;
		}
		
		getJogos().getNome().

	}

	public void alterar() {

	}
	
	public void remover() {

	}
	
	public void editar() {

	}
	
	public void limpar() {

	}
	
	private int proximoId() {
		int resultado = 0;
		for (Jogos jogos : listaJogos) {
			if (jogos.getId() > resultado)
				resultado = jogos.getId();
		}
		return ++resultado;
	}
	
	public List<Jogos> getListaJogos(){
		if (listaJogos == null) {
			listaJogos = new ArrayList<Jogos>();
		}
		return listaJogos;
	}
	
	public Jogos getJogos() {
		if (jogos == null) {
			jogos = new Jogos();
		}
		return jogos;
	}


	public void setJogos(Jogos jogos) {
		this.jogos = jogos;
	}
	
}
