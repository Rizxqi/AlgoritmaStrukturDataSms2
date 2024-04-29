import java.util.Scanner;

public class stackMain17 {

    public static void main(String[] args) {
        stack17 st = new stack17(5);
        Scanner sc17 = new Scanner(System.in);

        char choose;
        do {
            System.out.println("Stack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choose = sc17.next().charAt(0);
            sc17.nextLine();
            
            switch (choose) {
                case '1':
                    System.out.print("Title: ");
                    String title = sc17.nextLine();
                    System.out.print("Author Name: ");
                    String name = sc17.nextLine();
                    System.out.print("Published Year: ");
                    int year = sc17.nextInt();
                    System.out.print("Pages amount: ");
                    int pages = sc17.nextInt();
                    System.out.print("Price: ");
                    int price = sc17.nextInt();
                    sc17.nextLine(); // Consume newline
                    book17 bk = new book17(title, name, year, pages, price);
                    st.push(bk);
                    break;
                case '2':
                    st.pop();
                    break;
                case '3':
                    st.peek();
                    break;
                case '4':
                    st.print();
                    break;
                case '5':
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (choose != '5');
    }

}

// stk.push(15);
//     stk.push(27);
//     stk.push(13);
//     stk.print();
//     stk.push(11);
//     stk.push(34);
//     stk.push(18);
//     stk.push(40);

//     stk.pop();
//     stk.peek();
//     stk.print();