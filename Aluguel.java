import java.math.BigDecimal;

class Aluguel{
  private Carro carro;
  private Cliente cliente;
  private int quantidadeDias;
  private String formaPagamento;

  public Aluguel(Carro carro, Cliente cliente, int quantidadeDias){
    this.carro = carro;
    this.cliente = cliente;
    this.quantidadeDias = quantidadeDias;
  }

  public void setFormaPagamento(String formaPagamento){
    this.formaPagamento = formaPagamento;
  }

  public String getFormaPagamento(){
    return formaPagamento;
  }

  public BigDecimal obterValorDiario(Carro carro){
    return this.carro.getValorCarro().multiply(BigDecimal.valueOf(0.002));
  }

  public BigDecimal obterValorAluguel(Carro carro, int quantidadeDias){
    return obterValorDiario(carro).multiply(BigDecimal.valueOf(quantidadeDias));
  }

  public String recuperarDados(){
    String dados = "";
    dados += "Locatário: " +cliente.getNome()+ "\n";
    dados += "Carro: " +carro.getModelo()+ "\n";
    dados += "Quantidade de dias: " +quantidadeDias+ "\n";
    dados += "Valor diário: " +obterValorDiario(carro)+ "\n";
    dados += "Valor total: " +obterValorAluguel(carro, quantidadeDias) + "\n";
    return dados;
  }
}
