public class PersegiPanjang {
    public int panjang;
    public int lebar;
    // public int luas;
    // public int keliling;

    public PersegiPanjang(int p, int l ){
        panjang = p;
        lebar = l;
        // keliling= k;
        // luas = L;
    }
    
    public int hitungLuas(){
        return panjang*lebar;
    }

    public int hitungKeliling(){
        return 2 * (panjang + lebar);
    }

     public PersegiPanjang(){

     }
    
    void cetakinfo(){
    System.out.println("Panjang: " + panjang);
    System.out.println("Lebar: " + lebar);
    System.out.println("Hitung keliling : " + hitungKeliling());
    System.out.println("Hitung Luas : " + hitungLuas());
    }
}