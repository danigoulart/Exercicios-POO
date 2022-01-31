package br.com.generation.exercicios.aula04.Ex02;
/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, defina as 
 * instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Aviao {
	
	private String cor;
	private String empresa;
	private String estado;
	
	void pousar() {
		this.estado = "parado";
		System.out.println("O avião está " + estado);
	}
	void decolar() {
		this.estado = "voando";
		System.out.println("O avião está " + estado);
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
