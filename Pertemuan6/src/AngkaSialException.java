/*
 * Nama File   : AngkaSialException.java
 * Deskripsi   : Custom exception angka sial
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 30 March 2026
 */

public class AngkaSialException extends Exception {

    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial");
    }
}