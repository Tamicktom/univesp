package oop.semana_6;

import java.io.IOException;

public class TesteThrow {
  void MeuMetodo(int num) throws IOException, ClassNotFoundException {
    if (num == 1)
      throw new IOException("Ocorreu IOException");
    else
      throw new ClassNotFoundException("ClassNotFoundException");
  }
}
