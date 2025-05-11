package oop.semana_6;

public class ExemploThrow {
  public static void main(String args[]){
    try {
      TesteThrow obj = new TesteThrow();
      obj.MeuMetodo(0);
    } catch (Exception ex){
      System.out.println(ex);
    }
  }
}
