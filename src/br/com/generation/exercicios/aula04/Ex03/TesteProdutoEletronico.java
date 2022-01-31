package br.com.generation.exercicios.aula04.Ex03;

public class TesteProdutoEletronico {
	public static void main(String[] args) {

		ProdutoEletronico celular = new ProdutoEletronico();
		{
			celular.setMarca("Samsung");
			celular.setNome("M31");
			celular.setPreco(1.999);
			celular.esgotado();

			System.out.println("Modelo: " + celular.getNome() + ". E a marca desde produto é: " + celular.getMarca()
					+ " e o valor é R$: " + celular.getPreco());

		}

		ProdutoEletronico tv = new ProdutoEletronico();
		{
			tv.setMarca("Philips");
			tv.setNome("Tv 60 polegadas");
			tv.setPreco(4.000);
			tv.disponivel();
			System.out.println("Modelo: " + tv.getNome() + ". E a marca desde produto é: " + tv.getMarca()
			+ " e o valor é R$: " + tv.getPreco());
		}
		ProdutoEletronico videogame = new ProdutoEletronico();
		{
			videogame.setMarca("Playstation");
			videogame.setNome("Playstation 5");
			videogame.setPreco(3.000);
			videogame.disponivel();
			System.out.println("Modelo: " + videogame.getNome() + ". E a marca desde produto é: " + videogame.getMarca()
			+ " e o valor é R$: " + videogame.getPreco());
		}
	}

}
