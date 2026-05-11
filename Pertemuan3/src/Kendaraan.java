/*
 * Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 2 March 2026
 */

public class Kendaraan {

    // atribut
    private String noPlat;
    private String jenis;

    // constructor default
    Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    // constructor overload
    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // mengambil nilai noPlat
    public String getNoPlat() {
        return noPlat;
    }

    // mengambil nilai jenis
    public String getJenis() {
        return jenis;
    }

    // mengubah nilai noPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // mengubah nilai jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}