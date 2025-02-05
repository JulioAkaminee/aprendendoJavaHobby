package calculadoraSimples;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner meuObjeto = new Scanner(System.in); 
        System.out.println("Cálculadora Simples Em Java");

        System.out.println("Insira o primeiro número:");
        float numero1 =  meuObjeto.nextFloat();

        System.out.println("Insira o segundo número:");
        float numero2 =  meuObjeto.nextFloat();

        System.out.println("Escolha o operador:");

        System.out.println("Adição (1)");
        System.out.println("----------------");
        System.out.println("Subtração(2)");
        System.out.println("----------------");
        System.out.println("Multiplicação(3)");
        System.out.println("----------------");
        System.out.println("Divisao(4)");
        System.out.println("----------------");

        int escolha = meuObjeto.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("A soma de "+numero1 + " e " + numero2 + " é: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("A subtração dos dois números é: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("A multiplicação dos dois números é: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("A divisão dos dois números é: " + (numero1 / numero2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
}}
