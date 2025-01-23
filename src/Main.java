import java.util.Scanner; //importando a classe Scanner para ler o input do usuario
public class Main {
    public static void main(String[] args) {
    Scanner meuObjeto = new Scanner(System.in);
    System.out.println("Calculo de Imc em JAVA");
    System.out.println("Insira sua altura:");
    float altura = meuObjeto.nextFloat();
    System.out.println("Insira seu peso:");
    int peso = meuObjeto.nextInt();

    float imc = peso / (altura * altura);

    System.out.println("Seu IMC é de: "+ imc);

    if(imc<18.5){
        System.out.println("Abaixo do peso normal");
        }else if(imc>18.5 && imc<24.9){
        System.out.println("Peso Normal");
        }else if(imc>25 && imc< 29.9){
        System.out.println("Excesso de Peso");
        } else if(imc>30 && imc<34.9){
        System.out.println("Obesidade Classe 1");
        }else if(imc>35 && imc<39.9){
        System.out.println("Obesidade Classe 2");
        }else if(imc>=40) {
        System.out.println("Obesidade Classe 3");
        }



    }
}
