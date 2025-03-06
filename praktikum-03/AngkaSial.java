/**
 * File : AngkaSial.java
 * Deskripsi: Contoh penggunaan exception
 * 
 */

public class AngkaSial {
  public void cobaAngka(int angka) throws AngkaSialException {
    if (angka == 13) {
      throw new AngkaSialException();
    }
    System.out.println(angka + " bukan angka sial");
  }

  public static void main(String[] args) {
    AngkaSial angkaSial = new AngkaSial();
    try {
      angkaSial.cobaAngka(11);
      angkaSial.cobaAngka(12);
      angkaSial.cobaAngka(14);
    } catch (AngkaSialException ase) {
      System.out.println(ase.getMessage());
      System.out.println("Ati ati masukin angka!!");
    }
  }
}