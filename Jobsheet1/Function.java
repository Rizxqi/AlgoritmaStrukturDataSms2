/**
 * FungtionP1
 */
public class Fungtion {

    static class RoyalGarden {
        // Harga bunga per jenis
        static final int hargaAglonema = 75000;
        static final int hargaKeladi = 50000;
        static final int hargaAlocasia = 60000;
        static final int hargaMawar = 10000;
    
        // Pendapatan dari penjualan semua bunga di suatu cabang
        public static int hitungPendapatan(int[][] stock) {
            int totalPendapatan = 0;
            for (int i = 0; i < stock.length; i++) {
                totalPendapatan += (stock[i][0] * hargaAglonema) +
                                   (stock[i][1] * hargaKeladi) +
                                   (stock[i][2] * hargaAlocasia) +
                                   (stock[i][3] * hargaMawar);
            }
            return totalPendapatan;
        }
    
        // Menampilkan stock setiap jenis bunga pada cabang tertentu
        public static void tampilkanStock(int[][] stock, int cabang) {
            System.out.println("Stock bunga pada RoyalGarden " + cabang + ":");
            System.out.println("Aglonema: " + stock[cabang-1][0]);
            System.out.println("Keladi: " + stock[cabang-1][1]);
            System.out.println("Alocasia: " + stock[cabang-1][2]);
            System.out.println("Mawar: " + stock[cabang-1][3]);
        }
    
        public static void main(String[] args) {
            // Stock bunga pada setiap cabang
            int[][] stock = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
            };
    
            // 1. Pendapatan dari penjualan semua bunga di suatu cabang
            for (int i = 0; i < stock.length; i++) {
                int pendapatan = hitungPendapatan(new int[][]{stock[i]});
                System.out.println("Pendapatan pada RoyalGarden " + (i+1) + ": Rp " + pendapatan);
            }
    
            // 2. Stock setiap jenis bunga pada RoyalGarden 4
            tampilkanStock(stock, 4);
    
            // Jika terdapat pengurangan stock karena bunga mati
            stock[0][3] -= 1; // Pengurangan 1 pada Aglonema di cabang 4
            stock[1][3] -= 2; // Pengurangan 2 pada Keladi di cabang 4
            stock[2][3] -= 1; // Pengurangan 1 pada Alocasia di cabang 4
    
            // Menampilkan stock setelah pengurangan
            System.out.println("\nStock setelah pengurangan:");
            tampilkanStock(stock, 4);
        }
    }
    
}
