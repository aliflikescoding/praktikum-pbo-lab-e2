/*
Nama File       : Titik.java
Deskripsi       : Berisi atribut dan method dalam kelas Titik
Pembuat         : Alif Wibowo - 24060123140212
Tanggal         : 23-06-2025
*/

public class Titik {
  /* Atribut */
  private double absis;
  private double ordinat;
  private static int jumlahTitik = 0;

  /* Konstruktor */

  // Konstruktor dengan parameter
  public Titik(double x, double y) {
    this.absis = x;
    this.ordinat = y;
    jumlahTitik++;
  }

  // Konstruktor tanpa parameter, default (0,0)
  public Titik() {
    this(0, 0);
  }

  /* Method Getter dan Setter */

  public static int getJumlahTitik() {
    return jumlahTitik;
  }

  public double getAbsis() {
    return absis;
  }

  public double getordinat() {
    return ordinat;
  }

  public void setAbsis(double x) {
    this.absis = x;
  }

  public void setOrdinat(double y) {
    this.ordinat = y;
  }

  /* Method Lain */

  // Menggeser koordinat titik sebesar dx dan dy
  public void geser(double dx, double dy) {
    absis += dx;
    ordinat += dy;
  }

  // Menentukan kuadran tempat titik berada
  public int kuadran() {
    int kodeKuadran;

    if (absis > 0 && ordinat > 0) {
      kodeKuadran = 1;
    } else if (absis < 0 && ordinat > 0) {
      kodeKuadran = 2;
    } else if (absis < 0 && ordinat < 0) {
      kodeKuadran = 3;
    } else if (absis > 0 && ordinat < 0) {
      kodeKuadran = 4;
    } else {
      kodeKuadran = 0;
    }

    // Gunakan switch-case untuk menentukan hasil akhir
    switch (kodeKuadran) {
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 3;
      case 4:
        return 4;
      default:
        return 0;
    }
  }

  // Menghitung jarak titik ke pusat (0,0)
  public double jarakKePusat() {
    return Math.hypot(absis, ordinat);
  }

  // Menghitung jarak ke titik lain
  public double jarakKe(Titik titikLain) {
    double dx = this.absis - titikLain.absis;
    double dy = this.ordinat - titikLain.ordinat;
    return Math.hypot(dx, dy);
  }

  // Melakukan refleksi terhadap sumbu X
  public void refleksiSumbuX() {
    this.ordinat = -this.ordinat;
  }

  // Melakukan refleksi terhadap sumbu Y
  public void refleksiSumbuY() {
    this.absis = -this.absis;
  }

  // Menghasilkan titik baru hasil refleksi terhadap sumbu X
  public Titik hasilRefleksiX() {
    return new Titik(this.absis, -this.ordinat);
  }

  // Menghasilkan titik baru hasil refleksi terhadap sumbu Y
  public Titik hasilRefleksiY() {
    return new Titik(-this.absis, this.ordinat);
  }

  // Menampilkan koordinat titik ke layar
  public void tampilkan() {
    System.out.println("Titik (" + absis + ", " + ordinat + ")");
  }

  // Menampilkan jumlah total titik yang telah dibuat
  public void tampilkanJumlahTitik() {
    System.out.println(jumlahTitik);
  }
}
