package pacote;
import java.util.Scanner;

public class Midia {
	private int codigo;
	private double preco;
	private String nome;
	private String Mclasse="Midia";
	
	public Midia() {
	}
	
	public Midia(int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}//Construtor
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDetalhes() {
		return nome + codigo + preco;
	}
	public String getTipo() {
		return Mclasse;
	}
	public void printDados() {
		System.out.println("------- Midia Detalhes -------");
		System.out.println("Nome: "+ getNome());
		System.out.println("Codigo: "+ getCodigo());
		System.out.println("Preco: "+ getPreco());
		System.out.println("------------------------------");
	}
	
	public void inserirDados() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da midia: ");
		String nome = scan.nextLine();
		setNome(nome);
		
		System.out.println("Digite o codigo da midia: ");
		int codigo = scan.nextInt();
		setCodigo(codigo);
		
		System.out.println("Digite o preço da midia: ");
		double preco = scan.nextDouble();
		setPreco(preco);
		
		scan.nextLine();
		
		System.out.println("Dados inseridos com sucesso!");
	}

}
