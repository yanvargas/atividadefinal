package pacote;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Midia m1 = new Midia(23334, 25.99, "Summer" );
		
		m1.printDados(); //Para mostrar as informações
		m1.inserirDados(); //Para inserir novos dados
		m1.printDados(); //Para mostrar as informações atualizadas
		
		DVD dvd1 = new DVD();
		
		dvd1.inserirDados(); //Herança funcionando
		dvd1.printDados();
		
		CD cd1 = new CD();
		
		cd1.inserirDados(); //Herança funcionando
		cd1.printDados();
		
		//Programa simulando o uso de um cadastro de CD e DVDs finalizado
		//Assinado: Yan Vargas Vasconcelos UC22100684
	}

}
