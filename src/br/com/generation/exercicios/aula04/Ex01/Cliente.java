package br.com.generation.exercicios.aula04.Ex01;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as
 *  instancias deste objeto e apresente as informações deste objeto no console. 
 */
public class Cliente {
	
	private String nome;
	private String cidade;
	private int idade;
	
	void apresentar () {
		System.out.println("Meu nome é: " + nome + ". Sou de " + cidade + " e tenho " + idade + " anos");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
