package Praktikum06;

public class sorting17 {

    public static void sequentialSearch(int[] arr, int key ) {
        for (int i = 0; i < arr.length; i++) {
            if (i == key ) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
            }else{
                System.out.println("Data tidak ditemukan");
            }
        }
        
    }
    
    public static void main(String[] args) {
        int [] daftarNilai ={10, 5,20, 15, 5, 45};
        sequentialSearch(daftarNilai, 5);
    }
}