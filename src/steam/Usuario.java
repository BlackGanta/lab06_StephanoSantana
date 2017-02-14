package steam;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

	protected int x2p;

	private String nome;
	protected ArrayList<Jogo> jogos;
	protected double cash;
	protected String login;

	public Usuario(String nome, String login) {
		jogos = new ArrayList<Jogo>();
		this.nome = nome;
		this.login = login;
		this.x2p = x2p;

	}

	public void addCash(double cash) {
		this.cash += cash;
	}

	public double getCash() {
		return this.cash;
	}
	
	public String getLogin(){
		return this.login;
	}
	
	

	public abstract void compraJogo(Jogo jogo);

	public Jogo buscaJogo(String nome) {
		for (Jogo g : jogos) {
			if (g.getNome() == nome) {
				return g;
			}
		}
		return null;
	}

	public void registraJogada(String nome, int score, boolean zerou) {
		Jogo jogo = buscaJogo(nome);
		x2p += jogo.registraJogada(score, zerou);

	}

}
