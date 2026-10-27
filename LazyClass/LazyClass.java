
class EnderecoDeEntrega {
    private String cep;

    public EnderecoDeEntrega(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
}

class Pedido {
    private String id;
    private double valorTotal;
    private EnderecoDeEntrega endereco; 

    public Pedido(String id, double valorTotal, EnderecoDeEntrega endereco) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.endereco = endereco;
    }

    public double calcularFrete() {
        if (endereco.getCep().startsWith("58")) { 
            return 15.0;
        }
        return 30.0;
    }
}