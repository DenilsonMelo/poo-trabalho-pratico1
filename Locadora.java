import java.math.BigDecimal;

class Locadora{
  public static void main(String args[]){

//***************** INSTANCIANDO OBJETOS DA CLASSE CARRO *********************
    Carro gol = new Carro("Volkswagen", "Gol", "hjp3269");
    gol.setAnoFabricacao(2015);
    gol.setCor("Branco");
    gol.setTipoCombustivel("Gasolina");
    gol.setValorCarro(new BigDecimal(30000.00));

    Carro siena = new Carro("Fiat", "Siena", "pls0108");
    siena.setAnoFabricacao(2016);
    siena.setCor("Vermelho");
    siena.setTipoCombustivel("Flex");
    siena.setValorCarro(new BigDecimal(45000.00));

    Carro onix = new Carro("Chevrolet", "Ônix", "klo6359");
    onix.setAnoFabricacao(2016);
    onix.setCor("Branco");
    onix.setTipoCombustivel("Flex");
    onix.setValorCarro(new BigDecimal(37000.00));

    Carro voyage = new Carro("Volkswagen", "Voyage", "kxb2254");
    voyage.setAnoFabricacao(2016);
    voyage.setCor("Branco");
    voyage.setTipoCombustivel("Gasolina");
    voyage.setValorCarro(new BigDecimal(49000.00));

//***************** INSTANCIANDO OBJETOS DA CLASSE CLIENTE *******************
    Cliente maria = new Cliente("Maria Aparecida Santos", "012.234.569-18");
    maria.setCnh("12345678912");
    maria.setDataNascimento("01/08/1990");
    maria.setEstado("Bahia");
    maria.setCidade("Salvador");
    maria.setBairro("Pituba");
    maria.setRua("Rua Jorge Amado");
    maria.setNumero("89");
    maria.setTelefone("77999663221");

    Cliente joaquim = new Cliente("Joaquim Pereira", "128.369.547-32");
    joaquim.setCnh("12345556322");
    joaquim.setDataNascimento("30/10/1990");
    joaquim.setEstado("São Paulo");
    joaquim.setCidade("Campinas");
    joaquim.setBairro("Centro");
    joaquim.setRua("Rua Belchior Alves");
    joaquim.setNumero("55");
    joaquim.setTelefone("77995563221");

    Cliente manoel = new Cliente("Manoel Ribeiro das Neves", "369.124.658-98");
    manoel.setCnh("14763656322");
    manoel.setDataNascimento("30/02/1988");
    manoel.setEstado("São Paulo");
    manoel.setCidade("Sorocaba");
    manoel.setBairro("Centro");
    manoel.setRua("Rua Casto Alves");
    manoel.setNumero("112");
    manoel.setTelefone("77989656322");

    Cliente ellen = new Cliente("Ellen Gabriela Costa", "147.357.258-91");
    ellen.setCnh("89651556322");
    ellen.setDataNascimento("18/06/1978");
    ellen.setEstado("Minas Gerais");
    ellen.setCidade("Belo Horizonte");
    ellen.setBairro("Centro");
    ellen.setRua("Rua Pereira Alves");
    ellen.setNumero("592");
    ellen.setTelefone("77963253221");

//***************** INSTANCIANDO OBJETOS DA CLASSE ALUGUEL *******************
    Aluguel aluguel01 = new Aluguel(gol, maria, 5);
    aluguel01.setFormaPagamento("Dinheiro");

    Aluguel aluguel02 = new Aluguel(gol, manoel, 2);
    aluguel02.setFormaPagamento("Cartão de crédito");

    Aluguel aluguel03 = new Aluguel(siena, ellen, 3);
    aluguel03.setFormaPagamento("Dinheiro");

    Aluguel aluguel04 = new Aluguel(onix, joaquim, 7);
    aluguel04.setFormaPagamento("Cartão de débito");

   System.out.println(aluguel01.recuperarDados());
   System.out.println("***************************");
   System.out.println(aluguel02.recuperarDados());
   System.out.println("***************************");
   System.out.println(aluguel03.recuperarDados());
   System.out.println("***************************");
   System.out.println(aluguel04.recuperarDados());

  }
}
