package jogo;
import jogadores.Jogador;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
	Random sorte = new Random();
	  ArrayList<Jogador> lista = new ArrayList<Jogador>();

	  public void addPlayer(String nome, int energia, int poder){
	    Jogador novoJogador= new Jogador(nome, energia, poder);
	    lista.add(novoJogador);
	  }
	public void start(){
	    addPlayer("Samurai",45, 30);
	    addPlayer("Ninja",30,25);
	}
	 public void jogo(){
	    boolean jogador1;
	    boolean pri = true;
	   if(lista.get(0).energia > 0 && lista.get(1).energia > 0){
	      if(sorte.nextInt(100) < 50 && pri == true){
	        jogador1 = true;
	        pri = false;
	      }else {
	        jogador1 = false;
	        pri = false;
	     }

	   for(int i = 1; i < lista.size();){
	    if(jogador1){
	      double ataque = ataque();
	      double poder = lista.get(0).poder * ataque;
	      lista.get(1).energia = lista.get(1).energia - (int)poder;
	      System.out.print(lista.get(0).nome + " atacou o "+ lista.get(1).nome);
	        if(ataque == 0){
	         System.out.print("(Errou - 0 HP) ");
	         }else if(ataque == 0.33){
	           System.out.print("(Normal - "+ poder +" HP) ");
	           }else if(ataque == 1.2){
	             System.out.print("(Sorte!!! - "+ poder +" HP) ");
	             }else if(ataque == 2){
	               System.out.print("(Crítico! - "+ poder +" HP) ");
	               }
	               jogador1 = false;
	    }else{
	      double ataque = ataque();
	      double pod = lista.get(1).poder * ataque;
	      lista.get(0).energia = lista.get(0).energia - (int)pod;
	      System.out.print(lista.get(1).nome + " atacou o "+ lista.get(0).nome);
	       if(ataque == 0){
	         System.out.print("(Errou - 0 HP) ");
	         }else if(ataque == 0.33){
	           System.out.print("(Normal - "+ pod +" HP) ");
	           }else if(ataque == 1.2){
	             System.out.print("(Sorte!!! - "+ pod +" HP) ");
	             }else if(ataque == 2){
	               System.out.print("(Crítico! - "+ pod +" HP) ");
	               }
	               jogador1 = true;
	    }
	    if(lista.get(0).energia < 0){
	      lista.remove(0);
	      System.out.println("Jogo acabou, o vencedor foi"+ lista.get(1).nome +"com HP restante de" + lista.get(1).energia); 
	   }else if(lista.get(1).energia < 0){
	     lista.remove(1);
	     System.out.println("Jogo acabou, o vencedor foi "+ lista.get(0).nome +" com HP restante de " + lista.get(0).energia); 
	   }
	    
	    }
	  }
	   
	}

	  public double ataque(){
	    int sorteio = sorte.nextInt(101);
	      if(sorteio < 16){
	      return 0;
	      }else if(sorteio > 15 && sorteio < 71){
	      return 0.33;
	      }else if(sorteio > 70 && sorteio < 97){
	      return 1.2;
	      }else if(sorteio > 96){
	      return 2;
	    }
	    return 0;
	  }
}
