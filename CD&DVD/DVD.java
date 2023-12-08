package pacote;

import java.util.Scanner;

public class DVD extends Midia{
	private int nFaixas;
	private String DVDclasse="CD";

	public DVD() {
		
	}
	
	public DVD(int codigo,double preco,String nome, int nFaixas) {
		super(codigo,preco,nome);
		this.nFaixas=nFaixas;
	}
	
	public String getTipo() {
		return DVDclasse;
	}
	public String getDetalhes() {
		return nFaixas+DVDclasse;
	}
	
	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	public void inserirDados() {
		super.inserirDados();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o total das faixas: ");
		int nFaixas  = scan.nextInt();
		setnFaixas(nFaixas);
		
		scan.nextLine();
		
		System.out.println("Dados inseridos com sucesso!");
	}
}
