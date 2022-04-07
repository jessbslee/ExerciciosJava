package ClasseObjetos;

public class TrocaCliente {

	public static void main(String[] args) {
		// objeto
	Cliente cl = new Cliente();
	
	cl.nome = "Maurício";
	cl.loja = "Americanas";
	cl.shopping = "Eldorado";
	cl.numLoja = 600;
	
	System.out.println();
	System.out.println("Nome " + cl.nome);
	System.out.println("Loja " + cl.loja);
	System.out.println("Shopping " + cl.shopping);
	System.out.println("NumLoja " + cl.numLoja);
	
	cl.comprar();
	
	System.out.println();
	System.out.println("Nome " + cl.nome);
	System.out.println("Loja " + cl.loja);
	System.out.println("Shopping " + cl.shopping);
	System.out.println("NumLoja " + cl.numLoja);
	
	cl.trocar();
	

	}

}
