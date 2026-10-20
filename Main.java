import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma conversão:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Celsius para Kelvin");
            System.out.println("3 - Os dois");
            System.out.println("4 - Sair");
            opcao = entrada.nextInt();

            if (opcao == 4) {
                System.out.println("Até logo!");
            } else if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida, selecione novamente.");
            } else {
                System.out.println("Digite a temperatura em °C:");
                double temperatura = entrada.nextDouble();

                while (temperatura < -273.15) {
                    System.out.println("Temperatura inválida! O mínimo é -273,15 °C. Digite novamente:");
                    temperatura = entrada.nextDouble();
                }

                double fahrenheit = (temperatura * 1.8) + 32;
                double kelvin = temperatura + 273.15;

                if (opcao == 1 || opcao == 3) {
                    System.out.printf("A temperatura em °F é: %.2f%n", fahrenheit);
                }
                if (opcao == 2 || opcao == 3) {
                    System.out.printf("A temperatura em K é: %.2f%n", kelvin);
                }

                if (temperatura < 15) {
                    System.out.println("Está frio!");
                } else if (temperatura <= 25) {
                    System.out.println("Temperatura agradável!");
                } else {
                    System.out.println("Está calor!");
                }
            }
        } while (opcao != 4);

        entrada.close();
    }
}
