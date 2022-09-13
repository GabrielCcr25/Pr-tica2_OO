package br.com.estoque;

public class Estoque {

	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque() {
		
	}
	
	
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome;				// set : método p/alterar o valor/conteúdo do Atributo
		this.qtdAtual = qtdAtual;		// get: retorna o conteúdo do atributo
		this.qtdMinima = qtdMinima;
	
	
	
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {		//todo set vai ser void
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void darBaixa(int qtde) {
		if(qtde<=this.qtdAtual)
		this.qtdAtual-=qtde;
		else
			System.out.println("Impossível dar baixa no estoque");
	}
	public boolean precisaRepor() {
		if(this.qtdAtual<=this.qtdMinima)
			return true;
		else
			return false;
	}
	public String mostra() {
		return "produto : " + getNome() + "\nEstoque atual: " + getQtdAtual() + "\nEstoque Mínimo: " + getQtdMinima();
	}
}
