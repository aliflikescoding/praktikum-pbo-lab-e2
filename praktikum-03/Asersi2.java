/*
 * File: Asersi2.java
 * Deskripsi: Program contoh asersi untuk yang akan menolak input jari jari lingkaran yang bernilai nol
 */

// Class lingkaran
class Lingkaran {
  private double jariJari;
  
  public Lingkaran(double jariJari) {
    assert( jariJari > 0 ) : "jariJari harus positif";
    this.jariJari = jariJari;
  }
  
  public double hitungKeliling() {
    return 2 * Math.PI * jariJari;
  }
}

// Class Asersi2
public class Asersi2 {
  public static void main(String[] args) {
    double jariJari = 2;
    assert(jariJari > 0) : "jariJari harus tidak boleh nol";
    Lingkaran l = new Lingkaran(jariJari);
    double kellilingLingkaran = l.hitungKeliling();
    System.out.println("Keliling lingkaran dengan jari-jari " + jariJari + " adalah " + kellilingLingkaran);
  }
}