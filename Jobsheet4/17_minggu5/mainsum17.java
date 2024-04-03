import java.util.Scanner;

public class mainsum17 {
    
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program menghitung keuntungan total beberapa perusahaan");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlPerusahaan = sc17.nextInt();

        System.out.print("Masukkan jumlah bulan: ");
        int numMonths = sc17.nextInt();
        
        double [][] keuntunganPerusahaan = new double[jmlPerusahaan][numMonths];

        for (int i = 0; i < jmlPerusahaan; i++) {
            for (int j = 0; j < numMonths; j++) {
                System.out.println(" masukkan keuntungan perusahaan " + (i+1)+ "bulan ke- " + (j +1 )+ "dalam juta :");
                keuntunganPerusahaan[i][j]= sc17.nextDouble();            
            }
        }
        
        for (int i = 0 ; i< jmlPerusahaan; i++){
            double totalKeuntungan =0;
            for (int j = 0; j < numMonths; j++) {
                
            }
            System.out.printf("total keuntungan perusahaan %d selama %d bulan adalah = %.2f juta\n", (i+1), numMonths, totalKeuntungan);
        }
        System.out.println("===============================================================");
    }   
}

        // System.out.println("===============");
        // System.out.println("Program menghitung keuntungan total (Satuan Juta. Misal 5.9)");
        // System.out.print("Masukkan jumlah bulan     : ");
        // int elm = sc17.nextInt();
        
        // sum17 sm17 = new sum17(elm);
        // System.out.println("================");
        // for (int i = 0; i < sm17.elemen; i++) {
        //     System.out.print("Masukkan untung bulan ke - " + (i+1) + " = ");
        //     sm17.keuntungan [i] = sc17.nextDouble();
        // }

// System.out.println("===============================================================");
// System.out.println("ALgoritma Brute Force ");
// System.out.println("Total keuntungan perusahaan selama " + sm17.elemen+ "bulan adalah = "+sm17.totalBF17(sm17.keuntungan));
// System.out.println("===============================================================");
// System.out.println("Total Divide Conquer ");
// System.out.println("Total keuntungan perusahaan selama " + sm17.elemen+ "bulan adalah = "+sm17.totalDC17(sm17.keuntungan,0 , sm17.elemen-1));

    // System.out.println("===============================================================");
    //         System.out.println("ALgoritma Brute Force ");
    //         System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f juta\n", 
    //                             sm17.elemen, sm17.totalBF17(sm17.keuntungan));
    //         System.out.println("===============================================================");
    //         System.out.println("Total Divide Conquer ");
    //         System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f juta\n", 
    //                             sm17.elemen, sm17.totalDC17(sm17.keuntungan, 0 , sm17.elemen-1));