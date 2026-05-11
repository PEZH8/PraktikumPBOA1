/*
 * Nama File   : Asersi1.java
 * Deskripsi   : Program asersi sederhana
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 30 March 2026
 */

public class Asersi1 {

    public static void main(String[] args) {

        int x = 0;

        assert(x > 0) : "Nilai x harus positif";

        System.out.println("Nilai x : " + x);
    }
}