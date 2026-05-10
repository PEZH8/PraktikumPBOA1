/*
 * Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class titik
 * Pembuat   : Putri Elizabeth Simanjuntak
 * Tanggal   : 16 February 2026
 */


public class Titik {

    // atribut
    double absis;
    double ordinat;

    // constructor
    Titik() {
        absis = 0.0;
        ordinat = 0.0;
    }

    // mengambil nilai absis
    double getAbsis() {
        return absis;
    }

    // mengambil nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengubah nilai absis
    void setAbsis(double x) {
        absis = x;
    }

    // mengubah nilai ordinat
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser absis dan ordinat
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }
}


