package br.com.generation.exercicios.aula04.Ex03;
/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto 
 * produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */
public class ProdutoEletronico {
	
	private String nome;
	private String marca;
	private double preco;
	private String estado;
	
	void esgotado() {
		this.estado = "Esgotado";
		System.out.println("Este produto est� " + estado);
	}
	void disponivel () {
		this.estado = "Dispon�vel";
		System.out.println("Este produto est� " + estado);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
}
