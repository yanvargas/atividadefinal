package veiculos;

import java.util.Scanner;

public class Carro extends Veiculos{
	private double km;
	
	
	public Carro(String modelo, double preco, double km) {
		super(modelo,preco);
		this.km = km;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	public void inserirDados() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------- Inserir dados em Carro --------");
		
		System.out.println("Digite o modelo: ");
		String modelo  = scan.nextLine();
		setModelo(modelo);
		
		System.out.println("Digite o preco: ");
		double preco  = scan.nextDouble();
		setPreco(preco);
		
		System.out.println("Digite o km: ");
		double km = scan.nextInt();
		setKm(km);
		
		scan.nextLine();
		
		System.out.println("Dados inseridos com sucesso!");
	}
	
	

}
