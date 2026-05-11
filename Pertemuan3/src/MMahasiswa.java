/*
 * Nama File : MMahasiswa.java
 * Deskripsi : main class untuk menjalankan class Mahasiswa
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 2 March 2026
 */

public class MMahasiswa {

    public static void main(String[] args) {

        // membuat objek MataKuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // membuat objek Dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");

        // membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");

        // membuat objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");

        // merelasikan objek
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        // menampilkan detail mahasiswa
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        System.out.println();

        // mahasiswa kedua tanpa kendaraan
        MataKuliah ASD = new MataKuliah("ASD", "Algoritma dan Struktur Data", 4);
        Dosen D2 = new Dosen("456", "Budi", "Informatika");
        Mahasiswa M2 = new Mahasiswa("567", "Rina", "Informatika");

        M2.setDosenWali(D2);
        M2.addMatKul(PBO);
        M2.addMatKul(ASD);

        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
    }
}