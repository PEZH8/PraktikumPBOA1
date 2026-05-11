/*
 * Nama File : MTitik.java
 * Deskripsi : main class untuk menjalankan class Titik
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 23 February 2026
 */

public class MTitik {

    public static void main(String[] args) {

        // Bagian 1 - membuat objek Titik dan memanggil method
        Titik T1 = new Titik();

        T1.setAbsis(3);
        T1.setOrdinat(4);

        System.out.println("Titik Awal:");
        T1.printTitik();

        T1.geser(3, 4);

        System.out.println("Setelah Digeser:");
        T1.printTitik();

        // Bagian 2 - object reference
        // T2 = T1 tidak membuat objek baru, T2 hanya menunjuk ke objek yang sama dengan T1
        Titik T2 = T1;
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);

        System.out.println("T2 setelah T1 diubah:");
        T2.printTitik(); // T2 ikut berubah karena menunjuk objek yang sama

        // Bagian 3 - overloading constructor
        Titik T3 = new Titik(3, 5);
        System.out.println("T3:");
        T3.printTitik();

        // Bagian 4 - static method getCounterTitik
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());

        // Bagian 6 - method lengkap
        Titik P = new Titik(3, 4);

        System.out.println("Titik P:");
        P.printTitik();

        System.out.println("Kuadran          : " + P.getKuadran());
        System.out.println("Jarak ke Pusat   : " + P.getJarakPusat());

        Titik Q = new Titik(0, 0);
        System.out.println("Jarak P ke Q     : " + P.getJarak(Q));

        // refleksiX - langsung mengubah koordinat titik
        Titik P2 = new Titik(3, 4);
        P2.refleksiX();
        System.out.println("Setelah refleksiX:");
        P2.printTitik();

        // getRefleksiX - menghasilkan titik baru, titik asli tidak berubah
        Titik P3 = new Titik(3, 4);
        Titik hasilRefleksiX = P3.getRefleksiX();
        System.out.println("P3 asli:");
        P3.printTitik();
        System.out.println("Hasil getRefleksiX:");
        hasilRefleksiX.printTitik();

        // refleksiY - langsung mengubah koordinat titik
        Titik P4 = new Titik(3, 4);
        P4.refleksiY();
        System.out.println("Setelah refleksiY:");
        P4.printTitik();

        // getRefleksiY - menghasilkan titik baru, titik asli tidak berubah
        Titik P5 = new Titik(3, 4);
        Titik hasilRefleksiY = P5.getRefleksiY();
        System.out.println("P5 asli:");
        P5.printTitik();
        System.out.println("Hasil getRefleksiY:");
        hasilRefleksiY.printTitik();

        System.out.println("Total Objek Titik = " + Titik.getCounterTitik());
    }
}