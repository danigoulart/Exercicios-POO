package br.com.generation.exercicios.aula04.Ex03;

public class TesteProdutoEletronico {
	public static void main(String[] args) {

		ProdutoEletronico celular = new ProdutoEletronico();
		{
			celular.setMarca("Samsung");
			celular.setNome("M31");
			celular.setPreco(1.999);
			celular.esgotado();

			System.out.println("Modelo: " + celular.getNome() + ". E a marca desde produto �: " + celular.getMarca()
					+ " e o valor � R$: " + celular.getPreco());

		}

		ProdutoEletronico tv = new ProdutoEletronico();
		{
			tv.setMarca("Philips");
			tv.setNome("Tv 60 polegadas");
			tv.setPreco(4.000);
			tv.disponivel();
			System.out.println("Modelo: " + tv.getNome() + ". E a marca desde produto �: " + tv.getMarca()
			+ " e o valor � R$: " + tv.getPreco());
		}
		ProdutoEletronico videogame = new ProdutoEletronico();
		{
			videogame.setMarca("Playstation");
			videogame.setNome("Playstation 5");
			videogame.setPreco(3.000);
			videogame.disponivel();
			System.out.println("Modelo: " + videogame.getNome() + ". E a marca desde produto �: " + videogame.getMarca()
			+ " e o valor � R$: " + videogame.getPreco());
		}
	}

}
