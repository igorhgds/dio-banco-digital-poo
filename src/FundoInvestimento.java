public class FundoInvestimento extends Conta{

    private static final double TAXA_JUROS = 0.05; //1% ao mês

    public FundoInvestimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Investimentos " + cliente.getNome() + " ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void calcularJuros() {
        double juros = getSaldo() * TAXA_JUROS;
        depositar(juros);
    }
}
