public class ContaCorrente extends Conta {

    private static final double TAXA_JUROS = 0.01; //1% ao mês

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente " + cliente.getNome() + " ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void calcularJuros() {
        double juros = getSaldo() * TAXA_JUROS;
        depositar(juros);
    }

}