import java.util.Scanner;

public class FaktorialMain17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print  ("Masukan jumlah elemen yang ingin dihitung : ");
        int elemen = sc17.nextInt();

        Faktorial17 [] fk = new Faktorial17[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial17();
            System.out.print("Masukan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc17.nextInt();
        }

        System.out.println("=======================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i = 0; i < elemen ; i++) {
            long startTime = System.nanoTime();
            int hasilBF= fk[i].faktorialBF(fk[i].nilai);
            long endTime = System.nanoTime();
            System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
            System.out.println("Waktu eksekusi Brute Force: " + (endTime - startTime) + " miliseconds");
        }
        System.out.println("=======================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.nanoTime();
            int hasilDC= fk[i].faktorialDC(fk[i].nilai);
            long endTime = System.nanoTime();
            System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
            System.out.println("Waktu eksekusi Divide and Conquer: " + (endTime - startTime) + " miliseconds");
        }
        System.out.println("=======================================");

    }
}