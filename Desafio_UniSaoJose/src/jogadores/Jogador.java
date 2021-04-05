package jogadores;

public class Jogador {
	public String nome;
	public int poder;
	public int energia;
	
	public Jogador(String nome, int poder, int energia) {
		this.nome =nome;
		this.poder =poder;
		this.energia =energia;
	}
	public void imprimirJogador() {
		System.out.println(this.nome+" "+this.energia+" "+this.poder);
	}

}
