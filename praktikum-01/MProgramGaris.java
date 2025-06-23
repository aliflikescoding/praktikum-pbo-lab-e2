/*
Nama File       : MProgramGaris.java
Deskripsi       : Program utama untuk uji coba class Garis
Pembuat         : Alif Wibowo - 24060123140212
Tanggal         : 23-06-2025
*/

public class MProgramGaris {
  public static void main(String[] args) {
    // Membuat Titik
    // Titik
    Titik titikM = new Titik(5, 4);
    Titik titikN = new Titik(5, -4);

    // Garis default
    Garis garisA = new Garis();
    System.out.println("Garis A:");
    garisA.tampilkanInfoGaris();

    // Garis M ke N
    Garis garisB = new Garis(titikM, titikN);
    System.out.println("Garis B:");
    garisB.tampilkanInfoGaris();

    // Garis manual (-5,4) ke (-5,-4)
    Garis garisC = new Garis(new Titik(-5, 4), new Titik(-5, -4));
    System.out.println("Garis C:");
    garisC.tampilkanInfoGaris();

    System.out.println("**********-----**********");

    // Jumlah Garis
    System.out.println("Jumlah Garis yang dibuat: " + Garis.ambilJumlahGaris());

    System.out.println("**********-----**********");

    // Panjang
    System.out.println("Panjang B: " + garisB.hitungPanjang());
    System.out.println("Panjang C: " + garisC.hitungPanjang());

    System.out.println("**********-----**********");

    // Gradien
    System.out.println("Gradien A: " + garisA.hitungGradien());

    System.out.println("**********-----**********");

    // Titik tengah B
    Titik tengahB = garisB.titikTengah();
    System.out.println("Tengah B: (" + tengahB.getAbsis() + ", " + tengahB.getordinat() + ")");

    System.out.println("**********-----**********");

    // Cek sejajar
    System.out.println("B sejajar dengan C? " + garisB.sejajarDengan(garisC));

    System.out.println("**********-----**********");

    // Cek tegak lurus
    System.out.println("B tegak lurus dengan C? " + garisB.tegakLurusDengan(garisC));

    System.out.println("**********-----**********");

    // Persamaan A
    System.out.println("Persamaan Garis A:");
    System.out.println(garisA.persamaanGaris());
  }
}
