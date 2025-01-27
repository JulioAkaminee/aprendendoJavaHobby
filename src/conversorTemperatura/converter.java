import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Conversor de temperatura entre Celsius, Fahrenheit e Kelvin");

        System.out.println("Selecione a temperatura inicial:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Celsius");
        System.out.println("3. Kelvin");

        int escolha = meuScanner.nextInt();

        System.out.println("Qual a temperatura?");
        double primeiraTemperatura = meuScanner.nextDouble();

        System.out.println("Selecione para qual você quer que converta:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Celsius");
        System.out.println("3. Kelvin");

        int escolhaDaConversao = meuScanner.nextInt();

        switch (escolha) {
            case 1: // Fahrenheit
                if (escolhaDaConversao == 1) {
                    System.out.println("Não é possível converter para a mesma temperatura.");
                } else if (escolhaDaConversao == 2) {
                    double celsius = (primeiraTemperatura - 32) * 5 / 9;
                    System.out.println("A temperatura convertida de Fahrenheit para Celsius é: " + celsius + "°C");
                } else if (escolhaDaConversao == 3) {
                    double kelvin = (primeiraTemperatura - 32) * 5 / 9 + 273.15;
                    System.out.println("A temperatura convertida de Fahrenheit para Kelvin é: " + kelvin + " K");
                }
                break;

            case 2: // Celsius
                if (escolhaDaConversao == 2) {
                    System.out.println("Não é possível converter para a mesma temperatura.");
                } else if (escolhaDaConversao == 1) {
                    double fahrenheit = (primeiraTemperatura * 9 / 5) + 32;
                    System.out.println("A temperatura convertida de Celsius para Fahrenheit é: " + fahrenheit + "°F");
                } else if (escolhaDaConversao == 3) {
                    double kelvin = primeiraTemperatura + 273.15;
                    System.out.println("A temperatura convertida de Celsius para Kelvin é: " + kelvin + " K");
                }
                break;

            case 3: // Kelvin
                if (escolhaDaConversao == 3) {
                    System.out.println("Não é possível converter para a mesma temperatura.");
                } else if (escolhaDaConversao == 2) {
                    double celsius = primeiraTemperatura - 273.15;
                    System.out.println("A temperatura convertida de Kelvin para Celsius é: " + celsius + "°C");
                } else if (escolhaDaConversao == 1) {
                    double fahrenheit = (primeiraTemperatura - 273.15) * 9 / 5 + 32;
                    System.out.println("A temperatura convertida de Kelvin para Fahrenheit é: " + fahrenheit + "°F");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }

        meuScanner.close();
    }
}
