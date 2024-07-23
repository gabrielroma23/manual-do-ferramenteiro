package main;

import furacao.RPM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean condicao = true;
        Scanner leitura = new Scanner(System.in);
        Cabecalho cabecalho = new Cabecalho();
        cabecalho.Introducao();


        while (condicao == true){
            System.out.println("Escolha o tipo de operação: ");
            System.out.println("[1] Furação");
            System.out.println("[2] Fresamento");
            int selecaoOperacao = leitura.nextInt();

            switch (selecaoOperacao){

                case 1:
                    System.out.println("Escolha o cálculo que deseja realizar: ");
                    System.out.println("[1] RPM");
                    System.out.println("[2] Velocidade de corte (Vc)");
                    int selecaoCalculo = leitura.nextInt();

                    switch (selecaoCalculo){
                        case 1:
                            RPM rpm = new RPM();
                            System.out.println("Defina o material");

                            System.out.println("Defina o diametro: ");
                            double diametro = leitura.nextDouble();
                        break;
                    }
                break;
            }
        }
    }
}