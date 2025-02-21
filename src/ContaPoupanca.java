public class ContaPoupanca extends Conta {

    private static final double TAXA_JUROS = 0.03; //1% ao mês

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança " + cliente.getNome() + " ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void calcularJuros() {
        double juros = getSaldo() * TAXA_JUROS;
        depositar(juros);
    }
}
