package Primaryclass;

public class Primaryclass { 
	public static void main(String[] args) {

		Jogo jogo01 = new Jogo();

		jogo01.nome = "Assassins Screed";
		jogo01.categoria = "Mundo Aberto";
		jogo01.valor = 159.90;

		System.out.println("Jogo 01: " + jogo01.nome);
		System.out.println("Categoria Jogo 01: " + jogo01.categoria);
		System.out.println("Valor do Jogo 01: " + jogo01.valor);

		Jogo jogo02 = new Jogo();

		jogo02.nome = "Conter Strike";
		jogo02.categoria = "FPS";
		jogo02.valor = 60.00;

		System.out.println("Jogo 02: " + jogo02.nome);
		System.out.println("Categoria Jogo 02: " + jogo02.categoria);
		System.out.println("Valor do Jogo 02: " + jogo02.valor);

		Jogo jogo03 = new Jogo();
		
		jogo03.nome = "God of Whar";
		jogo03.categoria = "Luta";
		jogo03.valor = 300.00;

		System.out.println("Jogo 03: " + jogo03.nome);
		System.out.println("Categoria Jogo 03: " + jogo03.categoria);
		System.out.println("Valor do Jogo 03: " + jogo03.valor);

	

	}
}