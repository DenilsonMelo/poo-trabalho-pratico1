class Aluguel{
  private Carro carro;
  private Cliente cliente;
  private String periodo;
  private float valor;
  private String formaPagamento;

  public Aluguel(Carro carro, Cliente cliente, String periodo, float valor){
    this.carro = carro;
    this.cliente = cliente;
    this.periodo = periodo;
    this.valor = valor;
  }
}
