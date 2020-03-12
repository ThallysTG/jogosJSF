package br.playstation.games.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.playstation.games.application.Util;
import br.playstation.games.model.Jogos;

@Named
@ViewScoped
public class JogosController implements Serializable {

	private static final long serialVersionUID = 3110774732655529713L;

	private Jogos jogos;
	private List<Jogos> listaJogos;

	public void incluir() {

		if (getJogos().getNome().isBlank()) {
			Util.addErrorMessage("O jogo deve ter um nome!");
			System.out.println("Problemas ao incluir, o campo nome n�o pode ser nulo");
			return;
		}
		
		else if (getJogos().getData().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma data para o jogo!");
			System.out.println("Problemas ao incluir, o campo data n�o pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma produtora para o jogo!");
			System.out.println("Problemas ao incluir, o campo produtora n�o pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("O jogo tem que ser lan�ado para alguma plataforma!");
			System.out.println("Problemas ao incluir, o campo console n�o pode ser nulo");
			return;
		}
		getJogos().setId(proximoId());
		getListaJogos().add(getJogos());
		limpar();
		System.out.println("Inclus�o realizada com sucesso");

	}

	public void alterar() {
		if (getJogos().getNome().isBlank()) {
			Util.addErrorMessage("O jogo deve ter um nome!");
			System.out.println("Problemas ao alterar, o campo nome n�o pode ser nulo");
			return;
		}
		
		else if (getJogos().getData().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma data para o jogo!");
			System.out.println("Problemas ao alterar, o campo data n�o pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma produtora para o jogo!");
			System.out.println("Problemas ao alterar, o campo produtora n�o pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("O jogo tem que ser lan�ado para alguma plataforma!");
			System.out.println("Problemas ao alterar, o campo console n�o pode ser nulo");
			return;
		}
		
		
		int index = listaJogos.indexOf(getJogos());
		listaJogos.set(index, getJogos());
		limpar();
		System.out.println("Altera��o realizada com sucesso");
	}

	public void remover() {
		getListaJogos().remove(getJogos());
		limpar();
		System.out.println("Remo��o realizada com sucesso");
	}

	public void editar(Jogos jog) {
		setJogos(jog.getClone());
	}

	public void limpar() {
		jogos = null;
	}

	private int proximoId() {
		int resultado = 0;
		for (Jogos jogos : listaJogos) {
			if (jogos.getId() > resultado)
				resultado = jogos.getId();
		}
		return ++resultado;
	}

	public List<Jogos> getListaJogos() {
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
