public class FundoInvestimento extends Conta{

    public FundoInvestimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Investimentos " + cliente.getNome() + " ===");
        super.imprimirInfosComuns();
    }
}
