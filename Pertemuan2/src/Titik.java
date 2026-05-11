/*
 * Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 23 February 2026
 */

public class Titik {

    // atribut (Bagian 7 - enkapsulasi: ditambah private)
    private double absis;
    private double ordinat;
    private static int counterTitik = 0; // Bagian 4 - static attribute

    // constructor default (Bagian 5 - keyword this: memanggil constructor lain)
    Titik() {
        this(0.0, 0.0);
    }

    // constructor overload (Bagian 3 - overloading constructor)
    // (Bagian 5 - keyword this: membedakan atribut dan parameter)
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++; // Bagian 4 - menghitung objek yang dibuat
    }

    // mengambil nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengambil nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengambil jumlah objek titik yang telah dibuat (Bagian 4 - static method)
    public static int getCounterTitik() {
        return counterTitik;
    }

    // mengubah nilai absis
    public void setAbsis(double x) {
        absis = x;
    }

    // mengubah nilai ordinat
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser absis dan ordinat
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mendapatkan kuadran titik (Bagian 6)
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0;
    }

    // mendapatkan jarak ke titik pusat (Bagian 6)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // mendapatkan jarak ke titik lain (Bagian 6)
    public double getJarak(Titik T) {
        double dx = absis - T.getAbsis();
        double dy = ordinat - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // merefleksikan titik terhadap sumbu X, langsung mengubah nilai (Bagian 6)
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // merefleksikan titik terhadap sumbu Y, langsung mengubah nilai (Bagian 6)
    public void refleksiY() {
        absis = -absis;
    }

    // menghasilkan titik baru hasil refleksi sumbu X (Bagian 6)
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // menghasilkan titik baru hasil refleksi sumbu Y (Bagian 6)
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }
}