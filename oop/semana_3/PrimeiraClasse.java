package oop.semana_3;

public class PrimeiraClasse implements MinhaPrimeiraInterface {
  @Override
  public void metodo1() {
    System.out.println("Método 1 da PrimeiraClasse");
  }

  @Override
  public void metodo2() {
    System.out.println("Método 2 da PrimeiraClasse");
  }

  @Override
  public String metodo3(String parametro1) {
    return "Método 3 da PrimeiraClasse com parâmetro: " + parametro1;
  }
}
