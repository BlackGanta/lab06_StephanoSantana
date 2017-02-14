package steam;

import java.util.List;

public class Luta extends Jogo {

	

	public Luta(String nome, int preco, List<Jogabilidade> tipo) {
		super(nome, preco, tipo);

	}

	@Override
	public int registraJogada(int score, boolean zerou) {
		vezesJogadas++;

		if (zerou = true) {
			vezesZeradas++;

		}
		if (score > this.score) {
			this.score = score;
			return score / 1000;
		}

		return 0;

	}

	
	
	
	
	
	
}
