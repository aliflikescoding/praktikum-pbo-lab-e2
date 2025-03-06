/**
 * File : AngkaSialException.java
 * Deskripsi: Contoh penggunaan exception
 * 
 */

public class AngkaSialException extends Exception {
  public AngkaSialException() {
    super("jangan masuki angka 13 karena sial");
  }
}