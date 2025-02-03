import java.util.Scanner; // Importando a classe Scanner para ler o input do usuário

public class Calculator {
    public static void main(String[] args) {
        Scanner meuObjeto = new Scanner(System.in); // Criando o objeto Scanner
        System.out.println("Cálculo de IMC em JAVA");
        System.out.println("Insira sua altura (em metros):");
        float altura = meuObjeto.nextFloat(); // Lendo a altura
        System.out.println("Insira seu peso (em kg):");
        float peso = meuObjeto.nextFloat(); // Lendo o peso


        float imc = peso / (altura * altura);

        // Exibindo o IMC
        System.out.println("Seu IMC é: " + imc);

        // Condicional para exibir o resultado conforme o IMC
        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso Normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Excesso de Peso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Obesidade Classe 1");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Obesidade Classe 2");
        } else if (imc >= 40) {
            System.out.println("Obesidade Classe 3");
        }
    }
}
