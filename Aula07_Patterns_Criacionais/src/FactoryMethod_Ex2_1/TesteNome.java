package FactoryMethod_Ex2_1;

public class TesteNome {

	public static void main(String[] args) {
		FactoryNome fn = new FactoryNome();
		
		String nome = "Jos�";
		String sobrenome = "Roberto";
		
		fn.getNome(nome, sobrenome);

	}

}
