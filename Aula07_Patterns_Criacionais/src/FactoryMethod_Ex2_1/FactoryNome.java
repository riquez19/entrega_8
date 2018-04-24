package FactoryMethod_Ex2_1;

public class FactoryNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
