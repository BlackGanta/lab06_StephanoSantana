package steam;

public class Noob extends Usuario {
	
	
	public Noob(String nome,String login){
		super(nome,login);
		x2p = 0;
	}
	
	
	@Override
	public void compraJogo(Jogo jogo){
		for(Jogo g:jogos){
			if(!g.getNome().equals(jogo.getNome())){
				jogos.add(jogo);
				cash -= jogo.getPreco() * 0.9;
				x2p += jogo.getPreco() * 10;
			}
		}
	}
		
	
}
