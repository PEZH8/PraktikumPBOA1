/*
 * Nama File : MTitik.java
 * Deskripsi : main class untuk menjalankan class Titik
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 16 February  2026
 */

public class MTitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();

        T1.setAbsis(3);
        T1.setOrdinat(4);

        System.out.println("Titik Awal:");
        T1.printTitik();

        T1.geser(1, 2);

        System.out.println("Setelah Digeser:");
        T1.printTitik();
    }
}