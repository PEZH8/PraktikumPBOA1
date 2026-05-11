/*
 * Nama File   : BangunDatar.java
 * Deskripsi   : Abstract class BangunDatar
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 23 March 2026
 */

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;

    public static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar x) {
        return this.getKeliling() == x.getKeliling();
    }
}