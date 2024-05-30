import java.util.Scanner;

public class DLL05Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dll05 antrian05 = new Dll05();

        int menu;
        do {
            System.out.println("---------DAFTAR PENGANTRI-------");
            System.out.println("  1.TAMBAH ANTRIAN ");
            System.out.println("  2.CETAK ANTRIAN  ");
            System.out.println("  3.HAPUS ANTRIAN SEKALIGUS TAMBAH LAYANAN     ");
            System.out.println("  4.LAPORAN LAYANAN TERDAPAT TOTAL PEMASUKAN                 ");
            System.out.println("  5.KELUAR                      ");
            menu =sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("masukkan nama        : ");
                    String nama = sc.nextLine();
                    System.out.print("masukkan no HP  : ");
                    String noHp =sc.nextLine();
                    antrian05.addLast(nama, noHp);
                    break;
                case 2:
                    antrian05.print();
                    break;
                    case 3:
                    if (!antrian05.isEmpty()) {
                        System.out.println("Masukkan detail layanan:");
                        System.out.print("Kode Layanan: ");
                        int kodeLayanan = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Nama Layanan: ");
                        String namaLayanan = sc.nextLine();
                        System.out.print("Harga Layanan: ");
                        int hargaLayanan = sc.nextInt();
                        sc.nextLine();
                
                        layanan layanan = new layanan(kodeLayanan, namaLayanan, hargaLayanan, null, null);
                        antrian05.removeAndAddService(layanan);
                        System.out.println("Antrian dihapus dan layanan berhasil ditambahkan.");
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Total Pemasukan dari Layanan: Rp " + LayananService.getTotalPemasukan());
                    break;
                case 5:
                    System.exit(0);
                    break;
            
                default:
                System.out.println("input salah!");
                    break;
            }
        } while (menu !=5);
        sc.close();
    }
    
}
    

