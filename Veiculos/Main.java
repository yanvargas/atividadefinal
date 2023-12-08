package veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        ArrayList<Veiculos> cadastro = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de veículo (Moto ou Carro) ou digite 'Sair' para encerrar:");
            String escolha = scan.nextLine();

            if (escolha.equalsIgnoreCase("Sair")) {
                break;
            }

            if (escolha.equalsIgnoreCase("Moto")) {
                Moto moto = new Moto("", 0.0, 0);
                moto.inserirDados();
                cadastro.add(moto);
            } else if (escolha.equalsIgnoreCase("Carro")) {
                Carro carro = new Carro("", 0.0, 0.0);
                carro.inserirDados();
                cadastro.add(carro);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("\nRelatório de Veículos Cadastrados:");
        for (Veiculos veiculo : cadastro) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                System.out.println("Tipo: Moto | Modelo: " + moto.getModelo() +
                        " | Preço: " + moto.getPreco() + " | Ano: " + moto.getAno());
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                System.out.println("Tipo: Carro | Modelo: " + carro.getModelo() +
                        " | Preço: " + carro.getPreco() + " | Quilometragem: " + carro.getKm());
            }
        }
        
        double totalAntesAjustes = calcularTotalPreco(cadastro);
        System.out.println("\nTotal de preços antes dos ajustes: " + totalAntesAjustes);

        // Realizar ajustes nas motos e carros
        ajustarVeiculos(cadastro);

        // Levantamento do total de preços após os ajustes
        double totalDepoisAjustes = calcularTotalPreco(cadastro);
        System.out.println("\nTotal de preços após os ajustes: " + totalDepoisAjustes);
    }

    private static double calcularTotalPreco(ArrayList<Veiculos> veiculos) {
        double total = 0.0;
        for (Veiculos veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }

    private static void ajustarVeiculos(ArrayList<Veiculos> veiculos) {
        for (Veiculos veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getAno() >= 2008) {
                    double novoPreco = moto.getPreco() * 1.10;
                    moto.setPreco(novoPreco);
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getKm() > 100000) {
                    double novoPreco = carro.getPreco() * 0.92; // Redução de 8%
                    carro.setPreco(novoPreco);
                }
            }
        

        }//Fim For

    }//Fim ajustar veiculos
}//Fim main
