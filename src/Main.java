public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Cliente igor = new Cliente();
        igor.setNome("Igor");

        Conta cc1 = new ContaCorrente(venilton);
        Conta cp1 = new ContaPoupanca(venilton);

        Conta cc2 = new ContaCorrente(igor);
        Conta cp2 = new ContaPoupanca(igor);
        Conta ci2 = new FundoInvestimento(igor);

        cc1.depositar(250);
        cp1.depositar(100);
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        cc2.depositar(400);
        cp2.depositar(200);
        cc2.transferir(150, ci2);
        cc2.imprimirExtrato();
        cp2.imprimirExtrato();
        ci2.imprimirExtrato();
    }

}