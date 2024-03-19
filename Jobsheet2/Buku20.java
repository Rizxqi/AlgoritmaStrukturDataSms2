/**
 * Buku20
 */
public class Buku20 {

    String judul, pengarang ;
    int halaman, stok, harga;

    public void tampilInformasi(){
        System.out.println("Judul "+ judul);
        System.out.println("Pengarang "+pengarang);
        System.out.println("Jumlah Halaman"+halaman);
        System.out.println("Sisa stok " + stok);
        System.out.println("Harga " +harga);
    }
    void terjual (int jml){
        if (stok < 0) {
        System.out.println("Maaf Stok habis");    
        } else {
        stok -= jml ; 
        }
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga= hrg;
    }

    public Buku20(){

    }

    public Buku20(String jud, String pg, int hal, int stok, int har ){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public static void main(String[] args) {
        Buku20 buku20 = new Buku20();

        buku20.judul = "Philos";
        buku20.pengarang= "Rizqi";
        buku20.halaman= 20;
        buku20.stok= 5;
        buku20.harga=10000;

        buku20.tampilInformasi();
    }
}