package oop.semana_6;

public class TratamentoException {

  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      try {
        System.out.println(args[i]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("Índice inexistente no vetor nomes");
      }
    }
  }
}
