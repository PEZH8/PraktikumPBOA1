/*
 * Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 23 February 2026
 */

public class Garis {

    // atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // constructor default
    Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // constructor overload
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // mengambil titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // mengambil titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // mengambil jumlah objek garis
    public static int getCounterGaris() {
        return counterGaris;
    }

    // mengubah titik awal
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // mengubah titik akhir
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // mendapatkan gradien garis
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) return Double.POSITIVE_INFINITY;
        return dy / dx;
    }

    // mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    // mengecek apakah sejajar dengan garis lain
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // mengecek apakah tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis g) {
        double m1 = this.getGradien();
        double m2 = g.getGradien();
        if (m1 == Double.POSITIVE_INFINITY && m2 == 0) return true;
        if (m2 == Double.POSITIVE_INFINITY && m1 == 0) return true;
        if (m1 == Double.POSITIVE_INFINITY || m2 == Double.POSITIVE_INFINITY) return false;
        return m1 * m2 == -1;
    }

    // mencetak titik awal dan titik akhir garis
    public void printGaris() {
        System.out.print("Titik Awal  : ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir : ");
        titikAkhir.printTitik();
    }

    // mendapatkan persamaan garis y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();

        String cStr;
        if (c > 0) cStr = " + " + c;
        else if (c < 0) cStr = " - " + Math.abs(c);
        else cStr = "";

        return "y = " + m + "x" + cStr;
    }
}