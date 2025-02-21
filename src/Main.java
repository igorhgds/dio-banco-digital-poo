public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        Cliente igor = new Cliente();
        igor.setNome("Igor");

        Conta contaCorrenteIgor = new ContaCorrente(igor);
        Conta contaPoupancaIgor = new ContaPoupanca(igor);
        Conta fundoInvestimentoIgor = new FundoInvestimento(igor);

        Conta contaCorrenteVenilton = new ContaCorrente(venilton);
        Conta contaPoupancaVenilton = new ContaPoupanca(venilton);
        Conta fundoInvestimentoVenilton = new FundoInvestimento(venilton);

        contaCorrenteIgor.depositar(2000);
        contaCorrenteIgor.imprimirExtrato();
        contaCorrenteIgor.calcularJuros();
        contaCorrenteIgor.imprimirExtrato();

        contaPoupancaIgor.depositar(2000);
        contaPoupancaIgor.transferir(1000, contaCorrenteVenilton);
        contaPoupancaIgor.imprimirExtrato();
        contaCorrenteVenilton.imprimirExtrato();
    }

}