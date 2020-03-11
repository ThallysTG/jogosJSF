package br.playstation.games.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.playstation.games.application.Util;

@Named
@RequestScoped
public class LoginController {
	
	private String login;
	private String senha;
	
	public String entrar() {
		if ("janio".equals(login) && "123".equals(senha)) {
			return "crud";
		}
		
		Util.addErrorMessage("Login Invalido");
		return null;
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
