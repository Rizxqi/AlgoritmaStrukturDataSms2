package minggu5;

public class mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    mahasiswa (String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i ; 
    }

    void tampil(){
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " +thnMasuk);
        System.out.println("umur = " + umur);
        System.out.println("IPK = " +ipk );
    }
    
}
