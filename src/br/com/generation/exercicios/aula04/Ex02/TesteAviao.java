package br.com.generation.exercicios.aula04.Ex02;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao ();
		
		aviao1.setCor("Branco");
		aviao1.setEmpresa("Gol");
		aviao1.setEstado("Desligado");
		
		
		System.out.println("A cor deste avi�o �: " + aviao1.getCor() );
		System.out.println("A companhia deste avi�o � a " + aviao1.getEmpresa());
		System.out.println(" O avi�o est�: " + aviao1.getEstado());
		aviao1.decolar();
		aviao1.pousar();

		
		
	}

}
