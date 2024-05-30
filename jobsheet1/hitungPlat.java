import java.util.Scanner;

public class hitungPlat {

    private static final char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    private static final String[][] KOTA = {
        {"Banten"},
        {"Jakarta"},
        {"Bandung"},
        {"Cirebon"},
        {"Bogor"},
        {"Pekalongan"},
        {"Semarang"},
        {"Surabaya"},
        {"Malang"},
        {"Tegal"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendapatkan input kode plat nomor
        System.out.print("Masukkan kode plat nomor: ");
        char kodePlat = scanner.next().charAt(0);

        // Mencari nama kota
        int indexKota = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                indexKota = i;
                break;
            }
        }

        // Menampilkan nama kota
        if (indexKota >= 0) {
            System.out.println("Nama kota: " + KOTA[indexKota][0]);
        } else {
            System.out.println("Kode plat nomor tidak valid!");
        }
    }
}


