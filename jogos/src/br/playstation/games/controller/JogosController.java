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
			System.out.println("Problemas ao incluir, o campo nome não pode ser nulo");
			return;
		}
		
		else if (getJogos().getData().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma data para o jogo!");
			System.out.println("Problemas ao incluir, o campo data não pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma produtora para o jogo!");
			System.out.println("Problemas ao incluir, o campo produtora não pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("O jogo tem que ser lançado para alguma plataforma!");
			System.out.println("Problemas ao incluir, o campo console não pode ser nulo");
			return;
		}
		getJogos().setId(proximoId());
		getListaJogos().add(getJogos());
		limpar();
		System.out.println("Inclusão realizada com sucesso");

	}

	public void alterar() {
		if (getJogos().getNome().isBlank()) {
			Util.addErrorMessage("O jogo deve ter um nome!");
			System.out.println("Problemas ao alterar, o campo nome não pode ser nulo");
			return;
		}
		
		else if (getJogos().getData().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma data para o jogo!");
			System.out.println("Problemas ao alterar, o campo data não pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("Deve ser cadastrado uma produtora para o jogo!");
			System.out.println("Problemas ao alterar, o campo produtora não pode ser nulo");
			return;
		}
		
		else if (getJogos().getProdutora().isBlank()) {
			Util.addErrorMessage("O jogo tem que ser lançado para alguma plataforma!");
			System.out.println("Problemas ao alterar, o campo console não pode ser nulo");
			return;
		}
		
		
		int index = listaJogos.indexOf(getJogos());
		listaJogos.set(index, getJogos());
		limpar();
		System.out.println("Alteração realizada com sucesso");
	}

	public void remover() {
		getListaJogos().remove(getJogos());
		limpar();
		System.out.println("Remoção realizada com sucesso");
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
