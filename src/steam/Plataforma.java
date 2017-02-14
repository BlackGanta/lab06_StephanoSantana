package steam;

import java.util.List;

public class Plataforma extends Jogo {
	
	
	
	public Plataforma(String nome, int  preco, List<Jogabilidade> tipo) {
		super(nome, preco, tipo);
	
	}
	
	@Override
	public int registraJogada(int score,boolean zerou){
		vezesJogadas ++;
		if(score > this.score){
			this.score = score;
		}
		if(zerou = true){
			vezesZeradas ++;
			return 20;
	}
		return 0;
	}
}
