import java.util.Scanner;

/**
 * HitungNilaiMahasiswa
 */
public class Pemilihan {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        String nilaiHuruf;
            System.out.print("Masukkan nilai tugas: ");
            double tugas = input20.nextDouble();
            System.out.print("Masukkan nilai kuis: ");
            double kuis = input20.nextDouble();
            System.out.print("Masukkan nilai UTS: ");
            double uts = input20.nextDouble();
            System.out.print("Masukkan nilai UAS: ");
            double uas = input20.nextDouble();
            input20.close();
            double nilaiAkhir = 0.0;
            if (tugas >=100 || kuis >= 100 || uts >= 100|| uas >=100 ){
                System.out.println("Nilai tidak valid");
                return; 
                
            }else{
                nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            };
        if         (nilaiAkhir >=80 ){
            nilaiHuruf = "A";
        } 
        else if    (nilaiAkhir >= 75) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
            nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
}
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);

        input20.close();
    }
}