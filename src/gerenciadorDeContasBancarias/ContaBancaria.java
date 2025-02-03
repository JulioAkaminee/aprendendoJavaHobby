public class ContaBancaria {
    String titular;
    double saldo;

    // Deposita um valor ao saldo
    void depositar(double valor) {
        saldo += valor;
    }

    // Subtrai um valor do saldo, mas só se houver saldo suficiente
    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Exibe o saldo
    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("---------------------");
    }
}