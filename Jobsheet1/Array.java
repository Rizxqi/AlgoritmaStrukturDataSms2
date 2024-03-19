import java.util.Scanner;
/**
 * Array
 */
public class Array {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        String[] mataKuliah = new String[5];
         double[] nilaiSetara = new double[5];
         int[] bobotSKS = new int[5];
         double total_nilai_setara = 0;
         double total_sks = 0;
         String input;
         int index = 0;

                 do {
            System.out.print("Masukkan nama matakuliah: ");
            mataKuliah[index] = input20.nextLine();

            System.out.print("Masukkan bobot sks: ");
            bobotSKS[index] = input20.nextInt();
            input20.nextLine(); // consume newline not consumed by nextInt()

            System.out.print("Masukkan nilai huruf: ");
            String nilai_huruf = input20.nextLine();

            nilaiSetara[index] = konversiNilai(nilai_huruf);

            total_nilai_setara = total_nilai_setara + (nilaiSetara[index] * bobotSKS[index]);
            total_sks = total_sks + bobotSKS[index];

            System.out.print("Ingin menambahkan matakuliah lain? (y/n): ");
            input = input20.nextLine();
            index++;
        }  while (input.equalsIgnoreCase("y") && index < mataKuliah.length);

        double IP_Semester = total_nilai_setara / total_sks;
        System.out.println("IP Semester Anda adalah: " + IP_Semester);

        System.out.println("\nHasil Konversi Nilai");
        System.out.printf("%-40s%-15s%-15s%-15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < index; i++) {
            System.out.printf("%-40s%-15.2f%-15s%-15d%n", mataKuliah[i], nilaiSetara[i], konversiNilaiHuruf(nilaiSetara[i]), bobotSKS[i]);
        }
    }

    private static double konversiNilai(String nilai_huruf) {
        switch (nilai_huruf.toUpperCase()) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                throw new IllegalArgumentException("Nilai huruf tidak valid");
        }
    }

    private static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 4.0) {
            return "A";
        } else if (nilai >= 3.0) {
            return "B";
        } else if (nilai >= 2.0) {
            return "C";
        } else if (nilai >= 1.0) {
            return "D";
        } else {
            return "E";
        }
    }
    
}