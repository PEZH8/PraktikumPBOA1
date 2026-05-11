/*
 * Nama File   : Lingkaran.java
 * Deskripsi   : Class Lingkaran
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 30 March 2026
 */

public class Lingkaran {

    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}