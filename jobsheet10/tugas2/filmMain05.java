package tugas2;
import java.util.Scanner;

public class filmMain05 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DllF05 film05 = new DllF05();
        int menu;
        do {
            System.out.println("=================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=================================");
            System.out.println("  1.TAMBAH DATA AWAL");
            System.out.println("  2.TAMBAH DATA AKHIR");
            System.out.println("  3.TAMBAH DATA INDEX TERTENTU");
            System.out.println("  4.HAPUS DATA PERTAMA");
            System.out.println("  5.HAPUS DATA TERAKHIR");
            System.out.println("  6.HAPUS DATA TERTENTU");
            System.out.println("  7.CETAK");
            System.out.println("  8.CARI ID FILM");
            System.out.println("  9.URUT DATA RATING FILM-DESC");
            System.out.println("  10.KELUAR");
            System.out.println("=================================");
            menu =sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan data film poisi awal");
                    System.out.print("ID Film: ");
                    int ID =sc.nextInt();
                    System.out.print("Judul Film: ");
                    sc.nextLine();
                    String judul= sc.nextLine();
                    System.out.print("Rating film: ");
                    float rating = sc.nextFloat();
                    film05.addFirst(judul, ID, rating);
                    break;
                case 2:
                System.out.println("Masukkan data film poisi awal");
                System.out.print("ID Film: ");
                int ID1 =sc.nextInt();
                System.out.print("Judul Film: ");
                sc.nextLine();
                String judul1= sc.nextLine();
                System.out.print("Rating film: ");
                float rating1 = sc.nextFloat();
                film05.addLast(judul1, ID1, rating1);
                    break;
                case 3:
                System.out.println("Masukkan data film poisi awal");
                System.out.print("ID Film: ");
                int ID2 =sc.nextInt();
                System.out.print("Judul Film: ");
                sc.nextLine();
                String judul2= sc.nextLine();
                System.out.print("Rating film: ");
                float rating2 = sc.nextFloat();
                System.out.print("Indeks ke- ");
                int index =sc.nextInt();
                film05.add(rating2, ID2, judul2, index);
                    break;
                case 4:
                    film05.removeFirst();
                    break;
                case 5:
                    film05.removeLast();
                    break;
                case 6:
                System.out.print("Hapus film urutan ke- ");
                    int index3 = sc.nextInt();
                    film05.remove(index3);
                    break;
                case 7:
                    film05.print();
                    break;
                case 8:
                    System.out.println("film yang akan dicari berdasarkan ID");
                    System.out.print("ID film: ");
                    int ID3 =sc.nextInt();
                    film05.search(ID3);
                    film05.printSearch(ID3); 
                    break;
                case 9:
                    film05.sortRatingDescending();
                    break;
                case 10:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        } while (menu !=10);
        sc.close();
    }
}