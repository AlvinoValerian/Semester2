import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array untuk menyimpan objek mobil
        System.out.println("Sewa Berapa Mobil: ");
        int m = Scanner.nextInt;
        Mobil[] mobilArr = new Mobil[m]; // Maksimal 5 mobil

        // Input data mobil
        for (int i = 0; i < mobilArr.length; i++) {
            System.out.println("\nMobil ke-" + (i + 1));
            System.out.print("Masukkan merek mobil: ");
            String merek = scanner.nextLine();
            System.out.print("Masukkan tipe mobil: ");
            String tipe = scanner.nextLine();
            System.out.print("Masukkan kapasitas penumpang: ");
            int kapasitasPenumpang = scanner.nextInt();
            System.out.print("Masukkan harga sewa per hari: ");
            double hargaSewaPerHari = scanner.nextDouble();
            scanner.nextLine(); // Membuang sisa baris input

            // Buat objek mobil dan simpan di array
            mobilArr[i] = new Mobil(merek, tipe, kapasitasPenumpang, hargaSewaPerHari);
        }

        // Tampilkan daftar mobil
        System.out.println("\nDaftar Mobil: ");
        for (Mobil mobil : mobilArr) {
            System.out.println(mobil);
            System.out.println();
        }

        // Input lama sewa
        System.out.print("Masukkan lama sewa (hari): ");
        int lamaSewa = scanner.nextInt();

        // Hitung total sewa untuk semua mobil
        double totalSewa = 0;
        for (Mobil mobil : mobilArr) {
            totalSewa += mobil.hasilHargaTotalSewa(lamaSewa);
        }

        // Tampilkan total sewa
        System.out.println("Total sewa untuk " + lamaSewa + " hari: Rp" + totalSewa);
    }
}