import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan panjang array : ");
        int lenght = sc.nextInt();

        PersegiPanjang[] arrayofPersegiPanjang= new PersegiPanjang[lenght];
        int panjang, lebar;

        for (int i =0; i <3 ; i++) {
            System.out.println("Persegi panjang ke-"+ (i+1));
            System.out.println("Masukan panjang: ");
            panjang= sc.nextInt();
            System.out.println("Masukan Lebar: ");
            lebar=sc.nextInt();
            arrayofPersegiPanjang[i]= new PersegiPanjang(panjang, lebar);
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke- " + (i+1));
            arrayofPersegiPanjang[i].cetakinfo();    
        }
    }
}

// arrayofPersegiPanjang[0] = new PersegiPanjang();
// arrayofPersegiPanjang[0].panjang = 110;
// arrayofPersegiPanjang[0].lebar = 30;

// arrayofPersegiPanjang[1] = new PersegiPanjang();
// arrayofPersegiPanjang[1].panjang = 80; 
// arrayofPersegiPanjang[1].lebar = 40;

// arrayofPersegiPanjang[2] = new PersegiPanjang();
// arrayofPersegiPanjang[2].panjang = 100;
// arrayofPersegiPanjang[2].lebar = 20;

// for (int i = 0; i < 3; i++) {
//     arrayofPersegiPanjang[i] = new PersegiPanjang();

//     System.out.println("Persegi panjang ke -" +(i+1));
//     System.out.print("Masukkan panjang: ");
//     arrayofPersegiPanjang[i].panjang=sc.nextInt();
//     System.out.print("Masukan Lebar: ");
//     arrayofPersegiPanjang[i].lebar=sc.nextInt();

// }
// System.out.println("persegi panjang ke-1, panjang : "+ arrayofPersegiPanjang[i].panjang+
//     ", lebar : " + arrayofPersegiPanjang[i].lebar);
// System.out.println("persegi panjang ke-1, panjang : "+ arrayofPersegiPanjang[0].panjang+
//     ", lebar : " + arrayofPersegiPanjang[0].lebar);
// System.out.println("persegi panjang ke-1, panjang : "+ arrayofPersegiPanjang[1].panjang+
//     ", lebar : " + arrayofPersegiPanjang[1].lebar);
// System.out.println("persegi panjang ke-1, panjang : "+ arrayofPersegiPanjang[2].panjang+
//     ", lebar : " + arrayofPersegiPanjang[2].lebar);