/*
 * Nama File : MGaris.java
 * Deskripsi : main class untuk menjalankan class Garis
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 23 February 2026
 */

public class MGaris {

    public static void main(String[] args) {

        // constructor default
        Garis g0 = new Garis();
        System.out.println("Garis Default:");
        g0.printGaris();

        // constructor overload
        Titik awal1 = new Titik(-2, 0);
        Titik akhir1 = new Titik(0, 4);
        Garis g1 = new Garis(awal1, akhir1);

        System.out.println("Garis g1:");
        g1.printGaris();

        System.out.println("Panjang g1   : " + g1.getPanjang());
        System.out.println("Gradien g1   : " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();
        System.out.print("Titik Tengah : ");
        tengah.printTitik();

        System.out.println("Persamaan g1 : " + g1.getPersamaanGaris());

        // sejajar
        Garis g2 = new Garis(new Titik(1, 1), new Titik(3, 5));
        System.out.println("g1 sejajar g2?     " + g1.isSejajar(g2));

        // tegak lurus
        Garis g3 = new Garis(new Titik(0, 0), new Titik(4, -2));
        System.out.println("g1 tegak lurus g3? " + g1.isTegakLurus(g3));

        // setter
        Garis g4 = new Garis();
        g4.setTitikAwal(new Titik(1, 2));
        g4.setTitikAkhir(new Titik(4, 6));

        System.out.println("Garis g4:");
        g4.printGaris();
        System.out.println("Panjang g4   : " + g4.getPanjang());
        System.out.println("Persamaan g4 : " + g4.getPersamaanGaris());

        System.out.println("Total objek Garis = " + Garis.getCounterGaris());
        System.out.println("Total objek Titik = " + Titik.getCounterTitik());
    }
}