import java.util.Scanner;

public class GraphMainTugas05 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Graph05 gd = new Graph05(6);
        int pilih;
        do {
            System.out.println("=============PILIH============");
            System.out.println("1. Add edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8.Exit");
            System.out.print("Masukkan pilihan: ");
            pilih =sc.nextInt();
            System.out.println("==============================");
        
            switch (pilih) {
                case 1:
                    System.out.println(" --------ADD EDGE-------- ");
                    System.out.print("Masukkan Asal Gedung      : ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan Tujuan Gedung    : ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan Jarak Gedung     : ");
                    int jarak = sc.nextInt();
                    gd.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.println(" --------REMOVE EDGE-------- ");
                    System.out.print("Masukkan Asal Gedung      : ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan Tujuan Gedung    : ");
                    tujuan = sc.nextInt();
                    gd.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.println(" --------- DEGREE --------- ");
                    System.out.print("Masukkan Asal Gedung      : ");
                    asal = sc.nextInt();
                    gd.degree(asal);

                    break;
                case 4:
                    gd.printGraph();
                    break;
                case 5:
                System.out.println(" --------- CEK EDGE --------- ");
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    if (gd.cekJalur(asal, tujuan)) {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
                    }
                    break;
                case 6:
                System.out.println(" --------- UPDATE JARAK --------- ");
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = sc.nextInt();
                    gd.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                System.out.println(" --------- HITUNG EDGE --------- ");
                    int totalEdge = gd.hitungEdge();
                    System.out.println("Total edge dalam graf: " + totalEdge);
                    break;
                case 8:
                System.out.println("--- KELUAR ---");
                    System.exit(1);
                    break;
            
                default:
                    break;
            }
        } while (pilih != 8);
        sc.close();
    }
}
