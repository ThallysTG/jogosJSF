package br.playstation.games.model;

public class Jogos extends Entity<Jogos> {
	
	private String nome;
	private String data;
	private String produtora;
	private String console;
	private Boolean compras;
	private String descricao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public Boolean getCompras() {
		return compras;
	}
	public void setCompras(Boolean compras) {
		this.compras = compras;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	
	

	
	

}
