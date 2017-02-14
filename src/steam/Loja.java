package steam;

import java.util.ArrayList;

public class Loja {
	
	private ArrayList<Usuario> usuarios = new ArrayList<>();
	



	public Usuario buscaUsuario(String login){
		for(Usuario g: usuarios){
			if (g.getLogin().equals(login)){
				return g;
			}
		}
		return null;
	}
	
	public void vendJogo(String login,Jogo jogo){
		Usuario user = buscaUsuario(login);
		if(user.getCash() >= jogo.getPreco()){
			
		}
	}
	
	
	public void adicionaUsuario(String login,String nome,String tipo){
		Usuario user = buscaUsuario(login);
		if( !user.equals(null)){
			Usuario usuarioNoob = new Noob(login,nome);
			Usuario usuarioVeterano = new Veterano(login,nome);
			
			if(tipo.equals("noob")){
			usuarios.add(usuarioNoob);
			}else{
				usuarios.add(usuarioVeterano);
			}
		}
	}
		
	public void adicionaCash(String login,int cash){
		Usuario user = buscaUsuario(login);
		if(cash > 0){
			user.addCash(cash);
		}
		
			}
			
	}
		
	

	