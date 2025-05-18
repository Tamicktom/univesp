import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Exemplo de leitura de arquivo com InputStream
 */

public class ExemploStream1 {
  public static void main(String[] args) {
    InputStream inputStream;

    try {
      inputStream = new FileInputStream("./README.md");
      int byteLido = inputStream.read();
      while (byteLido != -1) {
        System.out.println(byteLido);
        byteLido = inputStream.read();
      }

      inputStream.close();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}