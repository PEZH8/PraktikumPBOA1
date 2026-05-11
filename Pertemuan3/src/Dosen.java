/*
 * Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 2 March 2026
 */

public class Dosen {

    // atribut
    private String nip;
    private String nama;
    private String prodi;

    // constructor default
    Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    // constructor overload
    Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // mengambil nilai nip
    public String getNip() {
        return nip;
    }

    // mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // mengambil nilai prodi
    public String getProdi() {
        return prodi;
    }

    // mengubah nilai nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    // mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengubah nilai prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}