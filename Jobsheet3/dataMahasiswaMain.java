import java.util.Scanner;

public class dataMahasiswaMain {
    
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        double totalIpk = 0;
        int lenght20 =0;
        System.out.print("Masukan Jumlah mahasiswa :  ");
        lenght20 = sc20.nextInt();

        mahasiswaArray[] arrayOfMahasiswa = new mahasiswaArray[lenght20];

        for (int i = 0 ; i < lenght20; i++) {
            System.out.println("Mahasiswa ke -" + (i+1));
            System.out.print("Masukan Nama : ");
            String nama = sc20.next();
            System.out.print("Masukan nim :");
            int nim = sc20.nextInt();
            System.out.print("Masukan Jenis kelamin : ");
            String jenisKelamin = sc20.next();
            System.out.print("Masukan IPK : ");
            double ipk = sc20.nextDouble();

            arrayOfMahasiswa[i] = new mahasiswaArray(nama, nim, jenisKelamin, ipk);
        }
    System.out.println();
        System.out.println("==========DATA MAHASISWA==========");

        for (mahasiswaArray dataMahasiswa : arrayOfMahasiswa) {
            System.out.println("Nama : " + dataMahasiswa.inputNama());
            System.out.println("Nim : " + dataMahasiswa.inputNim());
            System.out.println("Jenis kelamin : " + dataMahasiswa.inputJenisKelamin());
            System.out.println("IPK : " + dataMahasiswa.inputIpk());
            totalIpk += dataMahasiswa.inputIpk();
        }
        System.out.println();
        
        double rataIpk = totalIpk / lenght20;
        System.out.println("Rata - rata IPK : " + rataIpk);
    }
    
}