import java.util.Scanner;

public class posfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int tota =Q.length();

        posfix05 post = new posfix05(tota);
        P = post.konversi(Q);
        System.out.println("Posftix: "+ P);
    }
}
