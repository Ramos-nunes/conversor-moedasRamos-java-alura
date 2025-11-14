package com.ramos.conversormoedas;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorAPI api = new ConversorAPI();

        String menu = """
                **************************************************
                Bem-vindo ao Conversor de Moedas!
                
                1) Dólar => Real Brasileiro
                2) Real Brasileiro => Dólar
                3) Dólar => Peso Argentino
                4) Peso Argentino => Dólar
                5) Dólar => Peso Colombiano
                6) Peso Colombiano => Dólar
                7) Sair
                **************************************************
                Escolha uma opção:
                """;

        while (true) {
            System.out.print(menu);
            int opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Programa encerrado. Obrigado!");
                break;
            }

            String de, para;
            switch (opcao) {
                case 1 -> { de = "USD"; para = "BRL"; }
                case 2 -> { de = "BRL"; para = "USD"; }
                case 3 -> { de = "USD"; para = "ARS"; }
                case 4 -> { de = "ARS"; para = "USD"; }
                case 5 -> { de = "USD"; para = "COP"; }
                case 6 -> { de = "COP"; para = "USD"; }
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            try {
                Moeda resultado = api.converter(de, para, valor);
                System.out.printf("%.2f %s = %.2f %s\n\n", valor, de, resultado.conversion_result(), para);
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }
}