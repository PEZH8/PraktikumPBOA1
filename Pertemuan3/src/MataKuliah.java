/*
 * Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class MataKuliah
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 2 March 2026
 */

public class MataKuliah {

    // atribut
    private String idMatKul;
    private String nama;
    private int sks;

    // constructor default
    MataKuliah() {
        idMatKul = "";
        nama = "";
        sks = 0;
    }

    // constructor overload
    MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // mengambil nilai idMatKul
    public String getIdMatKul() {
        return idMatKul;
    }

    // mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // mengambil nilai sks
    public int getSks() {
        return sks;
    }

    // mengubah nilai idMatKul
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengubah nilai sks
    public void setSks(int sks) {
        this.sks = sks;
    }
}