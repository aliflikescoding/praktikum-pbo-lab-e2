/*
 * File : Asersi1.java
 * Deskripsi: Contoh penggunaan asersi
 * 
 */

public class Asersi1 {
  public static void main(String[] args) {
    int x = -20;
    if (x > 0) {
      System.out.println("x adalah bilangan positif");
    } else {
      assert( x < 0 ) : "x harus negatif";
      System.out.println("x adalah bilangan negatif");
    }
  }
}