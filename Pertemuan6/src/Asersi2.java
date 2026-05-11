/*
 * Nama File   : Asersi2.java
 * Deskripsi   : Program asersi lingkaran
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 30 March 2026
 */

public class Asersi2 {

    public static void main(String[] args) {

        double jariJari = 0;

        assert(jariJari > 0) : "Jari-jari tidak boleh nol";

        Lingkaran l = new Lingkaran(jariJari);

        System.out.println("Keliling lingkaran : " + l.hitungKeliling());
    }
}