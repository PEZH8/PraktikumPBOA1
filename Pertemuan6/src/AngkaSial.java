public /*
 * Nama File   : AngkaSial.java
 * Deskripsi   : Program custom exception
 * Pembuat     : Putri Elizabeth Simanjuntak
 * Tanggal     : 30 March 2026
 */

class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {

        if(angka == 13) {
            throw new AngkaSialException();
        }

        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {

        AngkaSial angka = new AngkaSial();

        try {

            angka.cobaAngka(10);
            angka.cobaAngka(13);
            angka.cobaAngka(12);

        } catch(AngkaSialException e) {

            System.out.println(e.getMessage());
            System.out.println("Hati-hati memasukkan angka");
        }
    }
} 
    

