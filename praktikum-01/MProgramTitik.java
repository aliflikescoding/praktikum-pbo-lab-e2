/*
Nama File       : MProgramTitik.java
Deskripsi       : Program utama untuk uji coba class Titik
Pembuat         : Alif Wibowo - 24060123140212
Tanggal         : 23-06-2025
*/

public class MProgramTitik {
  public static void main(String[] args) {
    // Membuat Titik
    Titik titikP = new Titik();
    titikP.setAbsis(3);
    titikP.setOrdinat(4);
    System.out.println("Posisi Titik P:");
    titikP.tampilkan();

    Titik titikQ = titikP;
    System.out.println("Posisi Titik Q (copy dari P):");
    titikQ.tampilkan();

    Titik titikR = new Titik(7, -6);
    System.out.println("Posisi Titik R:");
    titikR.tampilkan();

    System.out.println("**********-----**********");

    // Nilai absis & ordinat Titik P
    System.out.println("Absis P: " + titikP.getAbsis());
    System.out.println("Ordinat P: " + titikP.getordinat());

    System.out.println("**********-----**********");

    // Set nilai baru Titik P
    titikP.setAbsis(-10);
    titikP.setOrdinat(5);
    System.out.println("Posisi P setelah diubah:");
    titikP.tampilkan();

    System.out.println("**********-----**********");

    // Geser P
    titikP.geser(2, 2);
    System.out.println("Posisi P setelah digeser:");
    titikP.tampilkan();

    System.out.println("**********-----**********");

    // Jumlah objek Titik
    System.out.println("Jumlah objek Titik: " + Titik.getJumlahTitik());

    System.out.println("**********-----**********");

    // Kuadran
    System.out.println("Kuadran P: " + titikP.kuadran());
    System.out.println("Kuadran Q: " + titikQ.kuadran());
    System.out.println("Kuadran R: " + titikR.kuadran());

    System.out.println("**********-----**********");

    // Jarak ke pusat
    System.out.println("Jarak P ke pusat: " + titikP.jarakKePusat());
    System.out.println("Jarak Q ke pusat: " + titikQ.jarakKePusat());
    System.out.println("Jarak R ke pusat: " + titikR.jarakKePusat());

    System.out.println("**********-----**********");

    // Jarak antar Titik
    System.out.println("Jarak P ke R: " + titikP.jarakKe(titikR));

    System.out.println("**********-----**********");

    // Refleksi R ke X
    System.out.println("R sebelum refleksi X:");
    titikR.tampilkan();
    titikR.refleksiSumbuX();
    System.out.println("R setelah refleksi X:");
    titikR.tampilkan();

    System.out.println("**********-----**********");

    // Refleksi R ke Y
    titikR.refleksiSumbuY();
    System.out.println("R setelah refleksi Y:");
    titikR.tampilkan();

    System.out.println("**********-----**********");

    // Refleksi P ke X & Y
    Titik refleksiP_X = titikP.hasilRefleksiX();
    System.out.println("Refleksi P ke sumbu X:");
    refleksiP_X.tampilkan();

    Titik refleksiP_Y = titikP.hasilRefleksiY();
    System.out.println("Refleksi P ke sumbu Y:");
    refleksiP_Y.tampilkan();

  }
}
