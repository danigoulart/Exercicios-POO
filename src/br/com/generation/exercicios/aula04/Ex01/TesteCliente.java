package br.com.generation.exercicios.aula04.Ex01;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Daniela");
		cliente1.setCidade("Porto Alegre");
		cliente1.setIdade(26);

		cliente1.apresentar();
	}

}
