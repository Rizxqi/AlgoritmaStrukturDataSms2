package minggu7;
import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s =new Scanner (System.in);
        Scanner sl =new Scanner (System.in);

        PencariMhs data = new PencariMhs();
        System.out.print("Masukkan Jumlah input mahasiswa: ");
        int jumMhs = s.nextInt();

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukan data mahasiswa secara urut dari Nim terkecil ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama= sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
        
            mahasiswa17 m = new mahasiswa17(nim, nama, umur, ipk);
            data.tambah(m);
        }

        for (int j = 0; j < 1; j++) {

            System.out.println("-------------------------------");
            System.out.println("Data keseluruhan mahasiswa : ");
            data.tampil();
        }
        
        for (int i = 0; i < 1; i++) {
            System.out.println("__________________________________");
            System.out.println("__________________________________");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
            System.out.print("NIM : ");
            int cari = s.nextInt();
            System.out.println("menggunakan sequential search");
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
            System.out.println("==================================");
            System.out.println("menggunakan binary search");
            posisi = data.FindBinarySearch(cari, 0, jumMhs -1);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
        }
    }

}
