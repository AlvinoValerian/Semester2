import java.util.Scanner;

public class perulangan {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
           
            long nim ;
            System.out.println("Masukkan Nim :");
            nim = scanner.nextLong();
            long n = nim % 100;
            if (n < 10) {
                n += 10;
            }
            System.out.println("N: "+ n);
            
            for (int i = 1; i <= n; i++) {
                if (i == 6 || i == 10) {
                    continue;
                } else if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
    
            System.out.println();
            scanner.close();
            
     }
}
    
    