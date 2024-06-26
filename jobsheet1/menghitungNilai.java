import java.util.Scanner;

public class menghitungNilai {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = scanner.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = scanner.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = scanner.nextInt();

        // tabel nilai
        if (nilaiTugas < 0 || nilaiTugas > 100  ||
            nilaiKuis < 0  || nilaiKuis > 100   ||
            nilaiUTS < 0   || nilaiUTS > 100    ||
            nilaiUAS < 0   || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid!");
            System.exit(1);
        }

        // Menghitung nilai 
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // lulus/tidak lulus
        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        // hasil
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);

        scanner.close();
    }
}