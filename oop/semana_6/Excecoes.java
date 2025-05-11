
package oop.semana_6;

public class Excecoes {
  public static void main(String[] args) {
    try {
      System.out.println("Iniciando o programa");
      int resultado = dividir(10, 0);
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Erro: " + e.getMessage());
    } finally {
      System.out.println("Finalizando o programa");
    }
  }

  public static int dividir(int a, int b) {
    return a / b;
  }
}