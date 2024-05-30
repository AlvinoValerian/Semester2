import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang05 gudang =new Gudang05(kapasitas);
        

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Hapus Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    int kode=scanner.nextInt();
                    System.out.print("Masukkan Nama barang: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();
                    System.out.print("Masukan Kategori: ");
                    String kategori =scanner.nextLine();
                    Barang05 barangBaru = new Barang05(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilKanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan Kode Barang Yang Akan DI Hapus: ");
                    kode = scanner.nextInt();
                    gudang.hapusBarang(kode);
                    break;
                case 7:
                    System exit;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Coba Lagi.");
            }
        }
    }
}