/*
 * Nama File   : MBangunDatar.java
 * Deskripsi   : Main class BangunDatar
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 23 March 2026
 */

public class MBangunDatar {

    public static void main(String[] args) {

        Persegi p1 = new Persegi(5, "Merah", "Hitam");
        Lingkaran l1 = new Lingkaran(7, "Biru", "Putih");

        System.out.println("=== PERSEGI ===");
        p1.printInfo();
        System.out.println("Luas      : " + p1.getLuas());
        System.out.println("Keliling  : " + p1.getKeliling());

        System.out.println();

        System.out.println("=== LINGKARAN ===");
        l1.printInfo();
        System.out.println("Luas      : " + l1.getLuas());
        System.out.println("Keliling  : " + l1.getKeliling());

        System.out.println();

        System.out.println("=== RESIZE PERSEGI ===");
        p1.zoomIn();
        System.out.println("Sisi setelah zoom in : " + p1.getSisi());

        p1.zoomOut();
        System.out.println("Sisi setelah zoom out : " + p1.getSisi());

        p1.zoom(50);
        System.out.println("Sisi setelah zoom 50% : " + p1.getSisi());

        System.out.println();

        System.out.println("Apakah luas sama?");
        System.out.println(p1.isEqualLuas(l1));
    }
}