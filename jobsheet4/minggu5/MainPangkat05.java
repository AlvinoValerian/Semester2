package minggu5;
import java.util.Scanner;

public class MainPangkat05 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Menghitung Pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("=====================================");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = sc.nextInt();

        System.out.println("=====================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        
        Pangkat05[] png = new Pangkat05[elemen];

        switch (pilihan) {
            case 1:
                System.out.println("=====================================");
                for (int i = 0; i < elemen; i++) {
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
                    int nilai = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
                    int angkat = sc.nextInt();
        
                    png[i] = new Pangkat05(nilai, angkat);
                }

                System.out.println("=====================================");
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                System.out.println
                ("Hasil dari "
                + png[i].nilai+" pangkat "
                +png[i].pangkat+" adalah "
                +png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
        
            case 2: 
                System.out.println("=====================================");
                for (int i = 0; i < elemen; i++) {
                    System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
                    int nilai = sc.nextInt();
                    System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
                    int angkat = sc.nextInt();
        
                    png[i] = new Pangkat05(nilai, angkat);
                }

                System.out.println("=====================================");
                System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println
                    ("Hasil dari "
                    + png[i].nilai+" pangkat "
                    +png[i].pangkat+" adalah "
                    +png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;

            default:
            sc.close();
                break;
        }
    }

    @Override
    public String toString() {
        return "MainPangkat05 []";
    }
}

