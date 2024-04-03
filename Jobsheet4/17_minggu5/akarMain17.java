import java.util.Scanner;

public class akarMain17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print("Masukan jumlah elemen yang ingin dihitung : ");
        int numberOfInputs = scanner.nextInt();

        akar17 [] numbers = new akar17[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            numbers[i] = new akar17();
            System.out.print("Masukkan nilai-"+ (i+1)+" : ");   
            numbers[i].number = scanner.nextInt();
        }

        System.out.println("=======================================");
        System.out.println("Hasil akar dengan Brute Force");
        for (int i = 0; i < numberOfInputs; i++) {
            int root = numbers[i].squareRootBF(numbers[i].number);
            System.out.println("Akar dari bilangan " + numbers[i].number + " adalah : " + root);
        }

        System.out.println("=======================================");
        System.out.println("Hasil akar dengan Divide and Conquer");
        for (int i = 0; i < numberOfInputs; i++) {
            int root = numbers[i].squareRootDC(numbers[i].number);  
            System.out.println("Akar dari bilangan " + numbers[i].number + " adalah : " + root);
        }

        System.out.println("=======================================");
    }
}