package oop.semana_6;

public class MyException extends Exception {
  String str1;

  MyException(String str2) {
    str1 = str2;
  }

  @Override
  public String toString() {
    return ("Ocorreu a minha exceção:" + str1);
  }
}
