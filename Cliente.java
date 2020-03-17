class Cliente{
  private String nome;
  private String cpf;
  private String cnh;
  private String dataNascimento;
  private String estado;
  private String cidade;
  private String bairro;
  private String rua;
  private String telefone;

  public Cliente(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getCpf(){
    return cpf;
  }

  public void setCnh(String cnh){
    this.cnh = cnh;
  }

  public String getCnh(){
    return cnh;
  }

  public void setDataNascimento(String dataNascimento){
    this.dataNascimento = dataNascimento;
  }

  public String getDataNascimento(){
    return dataNascimento;
  }

  public void setEstado(String estado){
    this.estado = estado;
  }

  public String getEstado(){
    return estado;
  }

  public void setCidade(String cidade){
    this.cidade = cidade;
  }

  public String getCidade(){
    return cidade;
  }

  public void setBairro(String bairro){
    this.bairro = bairro;
  }

  public String getBairro(){
    return bairro;
  }

  public void setRua(String rua){
    this.rua = rua;
  }

  public String getRua(){
    return rua;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  public String getTelefone(){
    return telefone;
  }
}
