class Pedido {
    private String id;
    private double valorTotal;
    private String cepDestino; 

    public Pedido(String id, double valorTotal, String cepDestino) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.cepDestino = cepDestino;
    }

    public double calcularFrete() {
        if (this.cepDestino.startsWith("58")) { 
            return 15.0;
        }
        return 30.0;
    }
}