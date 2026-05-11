/*
 * Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 2 March 2026
 */

import java.util.ArrayList;

public class Mahasiswa {

    // atribut
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // constructor default
    Mahasiswa() {
        nim = "";
        nama = "";
        prodi = "";
        listMatKul = new ArrayList<>();
        dosenWali = null;
        kendaraan = null;
    }

    // constructor overload
    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatKul = new ArrayList<>();
        dosenWali = null;
        kendaraan = null;
    }

    // mengambil nilai nim
    public String getNim() {
        return nim;
    }

    // mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // mengambil nilai prodi
    public String getProdi() {
        return prodi;
    }

    // mengambil list mata kuliah
    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    // mengambil dosen wali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // mengambil kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // mengubah nilai nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // mengubah nilai prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // mengubah dosen wali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // mengubah kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // menambahkan mata kuliah ke list
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    // mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    // mendapatkan total SKS yang diambil
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            total = total + listMatKul.get(i).getSks();
        }
        return total;
    }

    // menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // menampilkan detail lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);

        System.out.println("Mata Kuliah:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println("  - " + listMatKul.get(i).getNama() + " (" + listMatKul.get(i).getSks() + " SKS)");
        }

        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama() + " (" + dosenWali.getNip() + ")");
        } else {
            System.out.println("Dosen Wali : -");
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan  : " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        } else {
            System.out.println("Kendaraan  : -");
        }
    }
}