package veiculos;

import java.util.Scanner;

public class Moto extends Veiculos{
	private int ano;
	
	public Moto (String modelo, double preco, int ano) {
		super(modelo,preco);
		this.ano=ano;
	}
		public double getPreco(){
			return super.getPreco();
		}

		public int getAno() {
			return ano;
		}
	
		public void setAno(int ano) {
			this.ano = ano;
		}
	
	public void inserirDados() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------- Inserir dados em Motos --------");
		
		System.out.println("Digite o modelo: ");
		String modelo  = scan.nextLine();
		setModelo(modelo);
		
		System.out.println("Digite o preco: ");
		double preco  = scan.nextDouble();
		setPreco(preco);
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		setAno(ano);
		
		scan.nextLine();
		
		System.out.println("Dados inseridos com sucesso!");
	}
	

}
