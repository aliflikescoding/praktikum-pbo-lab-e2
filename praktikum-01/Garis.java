/*
Nama File       : Garis.java
Deskripsi       : Berisi atribut dan method dalam kelas Garis
Pembuat         : Alif Wibowo - 24060123140212
Tanggal         : 23-06-2025
*/

public class Garis {
  /* ATRIBUT */
  private Titik titikAwal;
  private Titik titikAkhir;
  private static int jumlahGaris = 0;

  /* KONSTRUKTOR */

  // Membuat garis default dari (0,0) ke (1,1)
  public Garis() {
    this.titikAwal = new Titik(0, 0);
    this.titikAkhir = new Titik(1, 1);
    jumlahGaris++;
  }

  // Membuat garis dari dua titik yang ditentukan
  public Garis(Titik awal, Titik akhir) {
    this.titikAwal = awal;
    this.titikAkhir = akhir;
    jumlahGaris++;
  }

  /* METHOD AKSESOR DAN MUTATOR */

  // Mengambil nilai titik awal
  public Titik ambilTitikAwal() {
    return titikAwal;
  }

  // Mengambil nilai titik akhir
  public Titik ambilTitikAkhir() {
    return titikAkhir;
  }

  // Mengambil jumlah objek Garis yang telah dibuat
  public static int ambilJumlahGaris() {
    return jumlahGaris;
  }

  // Mengubah titik awal garis
  public void ubahTitikAwal(Titik awalBaru) {
    this.titikAwal = awalBaru;
  }

  // Mengubah titik akhir garis
  public void ubahTitikAkhir(Titik akhirBaru) {
    this.titikAkhir = akhirBaru;
  }

  /* METHOD LAIN */

  // Menghitung panjang garis
  public double hitungPanjang() {
    double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
    double dy = titikAkhir.getordinat() - titikAwal.getordinat();
    return Math.hypot(dx, dy);
  }

  // Menghitung gradien garis
  public double hitungGradien() {
    return (titikAkhir.getordinat() - titikAwal.getordinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
  }

  // Menentukan titik tengah garis
  public Titik titikTengah() {
    double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
    double tengahY = (titikAwal.getordinat() + titikAkhir.getordinat()) / 2;
    return new Titik(tengahX, tengahY);
  }

  // Mengecek apakah dua garis sejajar
  public boolean sejajarDengan(Garis garisLain) {
    return this.hitungGradien() == garisLain.hitungGradien();
  }

  // Mengecek apakah dua garis saling tegak lurus
  public boolean tegakLurusDengan(Garis garisLain) {
    return this.hitungGradien() * garisLain.hitungGradien() == -1;
  }

  // Menampilkan info titik awal dan akhir garis
  public void tampilkanInfoGaris() {
    System.out.println("Garis dari (" + titikAwal.getAbsis() + ", " + titikAwal.getordinat() + ") ke ("
        + titikAkhir.getAbsis() + ", " + titikAkhir.getordinat() + ")");
  }

  // Mengembalikan persamaan garis dalam format y = mx + c
  public String persamaanGaris() {
    double m = hitungGradien();
    double c = titikAwal.getordinat() - m * titikAwal.getAbsis();
    return "y = " + m + "x + " + c;
  }
}
