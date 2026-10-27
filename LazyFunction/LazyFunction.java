// Classes auxiliares (Mocks) criadas apenas para o código compilar
class Carrinho {
    public double calcularTotal() {
        return 150.0; 
    }
}

interface GatewayDePagamento {
    void cobrar(double valor);
}

class ProcessadorDePagamento {
    private GatewayDePagamento gateway;

    public ProcessadorDePagamento(GatewayDePagamento gateway) {
        this.gateway = gateway;
    }

    public void processarCompra(Carrinho carrinho) {
        double total = carrinho.calcularTotal();
        efetuarCobranca(total);
    }

    private void efetuarCobranca(double valor) {
        gateway.cobrar(valor);
    }
}