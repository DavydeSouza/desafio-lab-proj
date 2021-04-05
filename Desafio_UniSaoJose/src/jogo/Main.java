package jogo;

public class Main {

	public static void main(String[] args) {
		 Jogo jogo = new Jogo();
		    
		    
		 System.out.println("__________________________________");
		 System.out.println("Bem vindo a Guerrra! (ง'̀-'́)⚔️ (•̀o•́)ง");
		 System.out.println("**********************************");
		 System.out.println("");
		 jogo.start();
		 System.out.println("O JOGO COMEÇOU!");
		 System.out.println("A batalha será entre "+ jogo.lista.get(0).nome + " e " + jogo.lista.get(1).nome);
		 jogo.jogo();

	}

}
