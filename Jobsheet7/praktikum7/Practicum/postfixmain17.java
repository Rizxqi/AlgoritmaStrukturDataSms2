package Practicum;
import java.util.Scanner;

/** 
 * postfixmain17
 */
public class postfixmain17 {

    public static void main(String[] args) {
        Scanner sc17= new Scanner(System.in);
        String P, Q;
        System.out.println("Insert mathematical expression (infix) : ");
        Q = sc17.nextLine();
        Q = Q.trim();
        Q += ' ';
        
        int total  = Q.length();

        Postflix post = new Postflix(total);
        P = post.convert(Q);
        System.out.println("Postfix: " + P);
}
}