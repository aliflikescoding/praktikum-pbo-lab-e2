/*
 * File : ExceptionOnArray.java
 * Deskripsi: Contoh penggunaan asersi
 * 
 */

public class ExceptionOnArray {
  public static void main(String[] args) {
    Integer[] arrayIntegers = new Integer[4];
    try {
      arrayIntegers[2] = 11;
      arrayIntegers[3] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index out of bound");
    } finally {
      System.out.println("Clean up code");
    }
  }
}