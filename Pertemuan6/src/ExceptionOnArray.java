/*
 * Nama File   : ExceptionOnArray.java
 * Deskripsi   : Program exception array
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 30 March 2026
 */

public class ExceptionOnArray {

    public static void main(String[] args) {

        Integer[] arrayInteger = new Integer[4];

        try {

            arrayInteger[2] = 11;
            arrayInteger[4] = 10;

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception terjadi");
            System.out.println(e);
        }

        System.out.println("Program selesai");
    }
}