public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Julio";
        conta1.depositar(150); 
        conta1.exibirSaldo();

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Carlos";
        conta2.depositar(130); 
        conta2.exibirSaldo();


        ContaBancaria conta3 = new ContaBancaria();
        conta3.titular = "Ana";
        conta3.depositar(20);
        conta2.exibirSaldo();
    }
}


