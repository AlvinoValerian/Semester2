import java.util.Scanner;

public class mainbaru {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah perhitungan untuk setiap bangun ruang
        System.out.print("Berapa Kali Menghitung Kerucut: ");
        int jumlahKerucut = scanner.nextInt();

        System.out.print("Berapa Kali Menghitung Limas: ");
        int jumlahLimas = scanner.nextInt();

        System.out.print("Berapa Kali Menghitung Bola: ");
        int jumlahBola = scanner.nextInt();

        // Deklarasi array of objects untuk setiap bangun ruang
        kerucut[] kerucut = new kerucut[jumlahKerucut];
        limasSegiEmpatSamaSisi[] limas = new limasSegiEmpatSamaSisi[jumlahLimas];
        bola[] bolla = new bola[jumlahBola];

        // Input data dan hitung untuk setiap kerucut
        for (int i = 0; i < kerucut.length; i++) {
            System.out.println("\n-KERUCUT-" + (i + 1));
            System.out.print("Masukkan Jari-Jari: ");
            double jariJariKerucut = scanner.nextDouble();

            System.out.print("Masukkan Sisi Miring: ");
            double sisiMiringKerucut = scanner.nextDouble();

            kerucut[i] = new kerucut(jariJariKerucut, sisiMiringKerucut, i);
        }

        // Input data dan hitung untuk setiap limas
        for (int i = 0; i < limas.length; i++) {
            System.out.println("\n-LIMAS-" + (i + 1));
            System.out.print("Masukkan Sisi Alas: ");
            double sisiAlasLimas = scanner.nextDouble();

            System.out.print("Masukkan Tinggi Limas: ");
            double tinggiLimas = scanner.nextDouble();

            limas[i] = new limasSegiEmpatSamaSisi(sisiAlasLimas, tinggiLimas);
        }
        for (int i = 0; i < bolla.length; i++) {
            System.out.println("\n-BOLA-" + (i + 1));
            System.out.print("Masukkan Jari-jari: ");
            double jariJari = scanner.nextDouble();

            bolla[i] = new bola(jariJari);
    }
    // tampil
    kerucut kerucut2 = new kerucut(jumlahKerucut, jumlahLimas, jumlahBola);
    System.out.println("KERUCUT");
    System.out.println("Luas Permukaan: " + kerucut2.hasilLp());
    System.out.println("Volume: " + kerucut2.hasilV());

    limasSegiEmpatSamaSisi limas2 = new limasSegiEmpatSamaSisi(jumlahLimas, jumlahBola);
    System.out.println("LIMAS");
    System.out.println("Luas Permukaan: " + limas2.hasilLp() );
    System.out.println("Volume: " + limas2.hasilV() );

    bola bol = new bola(jumlahBola);
    System.out.println("BOLA");
    System.out.println("Luas Permukaan: " + bol.hasilLp() );
    System.out.println("Volume: " + bol.hasilV() );
    scanner.close();
}
}

