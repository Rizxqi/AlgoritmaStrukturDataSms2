import java.util.Scanner;

public class PangkatMain17 {
    
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("======================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc17.nextInt();

        Pangkat17 [] png = new Pangkat17[elemen];
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+ (i+1)+" : ");
            int nilai = sc17.nextInt() ;
            System.out.print("Masukkan nilai pangkat ke-"+(i+1)+" : ");
            int pangkat = sc17.nextInt();
            png[i] = new Pangkat17(nilai, pangkat);
        }

        System.out.println("=====================================");
        System.out.println("Pilih Metode Pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan Anda (1/2): ");
        int metode = sc17.nextInt();

        System.out.println("=====================================");
        System.out.println("Hasil Pangkat");

        for (int i = 0; i < elemen; i++) {
            if (metode == 1) {
                System.out.println(" Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+"adalah :"+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
            }else if (metode ==2) {
                System.out.println(" Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+"adalah :"+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
            }else {System.out.println("Pilihan tidak valid!");
            break;
            }
        }
        System.out.println("=====================================");
    }
}


// for (int i = 0; i < elemen; i++) {
//     System.out.println(" Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+"adalah :"+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
// } 
// System.out.println("=====================================");
// System.out.println("Hasil Pangkat dengan Divide and Conquer");
// for (int i = 0; i < elemen ; i++) {
//     System.out.println(" Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+"adalah :"+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
// }
// System.out.println("=====================================");

        // for (int i = 0; i < elemen; i++) {
        //     png[i] = new Pangkat17();
        //     System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+ (i+1)+" : ");
        //     png[i].nilai = sc17.nextInt() ;
        //     System.out.print("Masukkan nilai pangkat ke-"+(i+1)+" : ");
        //     png[i].pangkat = sc17.nextInt();
        // }