package minggu7;

public class mahasiswa17 {
    int nim ;
    String nama;
    int umur;
    double ipk;

    mahasiswa17 (int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i ;
    }

    void tampil (){
        System.out.println("Nim = " + nim );
        System.out.println("Nama = " + nama);
        System.out.println("Umur = "+ umur);
        System.out.println("IPK = "+ ipk);
    }
}
