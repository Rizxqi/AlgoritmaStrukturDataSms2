import java.util.Scanner;

/**
 * tugasp1
 */
public class tugasp1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi array kode plat mobil dan nama kota
        String[] KODE = {"B", "D", "E", "L", "N", "P", "R", "T", "W", "Z"};
        String[] KOTA = {"Surabaya", "Bandung", "Yogyakarta", "Bali", "Medan", "Padang", "Makassar", "Pekanbaru", "Semarang", "Bogor"};

        // Meminta pengguna untuk memasukkan kode plat mobil
        System.out.print("Masukkan kode plat mobil: ");
        String kodeMobil = input.nextLine().toUpperCase();

        // Melakukan pencarian nama kota
        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equals(kodeMobil)) {
                System.out.println("Kota yang sesuai dengan kode plat " + kodeMobil + " adalah: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        // Jika kode plat mobil tidak ditemukan
        if (!ditemukan) {
            System.out.println("Kode plat mobil tidak ditemukan.");
        }

        input.close();
    }
}