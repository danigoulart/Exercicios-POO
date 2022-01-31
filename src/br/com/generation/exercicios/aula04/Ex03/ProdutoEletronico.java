package br.com.generation.exercicios.aula04.Ex03;
/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto 
 * produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class ProdutoEletronico {
	
	private String nome;
	private String marca;
	private double preco;
	private String estado;
	
	void esgotado() {
		this.estado = "Esgotado";
		System.out.println("Este produto está " + estado);
	}
	void disponivel () {
		this.estado = "Disponível";
		System.out.println("Este produto está " + estado);
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
