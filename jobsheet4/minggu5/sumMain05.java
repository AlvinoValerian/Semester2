package minggu5;
import java.util.Scanner;

public class sumMain05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.print("Jumlah perusahaan yang akan dihitung: ");
        int prh = sc.nextInt();

        for (int i = 0; i < prh; i++) {
            System.out.println("=======================================");
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.println("Progres Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
            System.out.print("Masukkan jumlah bulan: ");
            int elemen = sc.nextInt();

            sum05 sm = new sum05(elemen);
            System.out.println("=======================================");
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j+1) + " = ");
                sm.keuntungan[j] = sc.nextDouble();
            }

            System.out.println("=======================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
            System.out.println("=======================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1)+"\n");
        }
        sc.close();    
    }
}

