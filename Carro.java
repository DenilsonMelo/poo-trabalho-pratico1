import java.math.BigDecimal;

class Carro{
  private String marca;
  private String modelo;
  private String placa;
  private int anoFabricacao;
  private String cor;
  private String tipoCompustivel;
  private BigDecimal valorCarro;

  public Carro(String marca, String modelo, String placa){
      this.marca = marca;
      this.modelo = modelo;
      this.placa = placa;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public String getMarca(){
    return marca;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getModelo(){
    return modelo;
  }

  public void setPlaca(String placa){
    this.placa = placa;
  }

  public String getPlaca(){
    return placa;
  }

  public void setAnoFabricacao(int anoFabricacao){
    this.anoFabricacao = anoFabricacao;
  }

  public int getAnoFabricacao(){
    return anoFabricacao;
  }

  public void setCor(String cor){
    this.cor = cor;
  }

  public String getCor(){
    return cor;
  }

  public void setTipoCombustivel(String tipoCompustivel){
    this.tipoCompustivel = tipoCompustivel;
  }

  public String getTipoCombustivel(){
    return tipoCompustivel;
  }

  public void setValorCarro(BigDecimal valorCarro){
    this.valorCarro = valorCarro;
  }

  public BigDecimal getValorCarro(){
    return valorCarro;
  }
}
