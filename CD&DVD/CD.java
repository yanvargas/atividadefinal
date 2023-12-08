package pacote;

import java.util.Scanner;

public class CD extends Midia{
	private int nMusicas;
	private String CDclasse="CD";

	public CD () {
	}
	
	public CD (int codigo, double preco, String nome, int nMusicas) {
		super(codigo, preco,nome);
		this.nMusicas = nMusicas;
	}
	
	public String getTipo() {
		return CDclasse;
	}
	public String getDetalhes() {
		return nMusicas+CDclasse;
	}
	
	
	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}
	public void inserirDados() {
		super.inserirDados();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o total das musicas: ");
		int nMusicas  = scan.nextInt();
		setnMusicas(nMusicas);
		
		scan.nextLine();
		
		System.out.println("Dados inseridos com sucesso!");
	}
}
