package br.com.generation.exercicios.aula04.Ex02;
/*Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as 
 * instancias deste objeto e apresente as informa��es deste objeto no console.
 */
public class Aviao {
	
	private String cor;
	private String empresa;
	private String estado;
	
	void pousar() {
		this.estado = "parado";
		System.out.println("O avi�o est� " + estado);
	}
	void decolar() {
		this.estado = "voando";
		System.out.println("O avi�o est� " + estado);
	}
	
//	public Aviao (String cor, String empresa, String estado) {
//		super();
//		this.cor = cor;
//	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
