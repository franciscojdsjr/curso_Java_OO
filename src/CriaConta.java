
public class CriaConta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    public static void main(String[] args) {
        CriaConta primeiraConta = new CriaConta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
    }
}