package steam;

public class Veterano extends Usuario{

	public Veterano(String nome,String login){
		super(nome,login);
		x2p = 1000;
	}

	
	@Override
	public void compraJogo(Jogo jogo){
		for(Jogo g:jogos){
			if(!g.getNome().equals(jogo.getNome())){
				jogos.add(jogo);
				cash -= jogo.getPreco() * 0.8;
				x2p = jogo.getPreco() * 15;
			}
		}
	}
	
	
}
