package tugas1;
import java.util.Scanner;;

public class DllMain05 {

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        Dll05 pasien05 = new Dll05();

        int menu;
        do {
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("---------DAFTAR PENGANTRI-------");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("  1.TAMBAH DATA PENERIMA VAKSIN ");
            System.out.println("  2.HAPUS DATA PENERIMA VAKSIN  ");
            System.out.println("  3.DAFTAR PENERIMA VAKSIN      ");
            System.out.println("  4.KELUAR                      ");
            System.out.println("++++++++++++++++++++++++++++++++");
            menu =sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("masukkan nama        : ");
                    String nama = sc.nextLine();
                    System.out.print("masukkan no antrian  : ");
                    int noAntri =sc.nextInt();
                    pasien05.addLast(noAntri, nama);
                    break;
                case 2:
                    pasien05.removeFirst();
                    break;
                case 3:
                    pasien05.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                System.out.println("input salah!");
                    break;
            }
        } while (menu !=4);
        sc.close();
    }
    
}