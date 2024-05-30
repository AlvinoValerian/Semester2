import java.util.Scanner;

public class kecepatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("Pilih rumus yang ingin dihitung:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");

        // Mendapatkan pilihan pengguna
        int pilihan = scanner.nextInt();

        // Menghitung hasil berdasarkan pilihan
        switch (pilihan) {
            case 1:
                hitungKecepatan(scanner);
                break;
            case 2:
                hitungJarak(scanner);
                break;
            case 3:
                hitungWaktu(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void hitungKecepatan(Scanner scanner) {
        System.out.print("Masukkan jarak (m): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }

    private static void hitungJarak(Scanner scanner) {
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak: " + jarak + " m");
    }

    private static void hitungWaktu(Scanner scanner) {
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan jarak (m): ");
        double jarak = scanner.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu: " + waktu + " s");
    }
}


