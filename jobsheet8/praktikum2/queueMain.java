package praktikum2;

import java.util.Scanner;

public class queueMain {
    
        public static void menu(){
            System.out.println("Pilih Menu: ");
            System.out.println("1.Antrian baru");
            System.out.println("2.Antrian keluar");
            System.out.println("3.Cek antrian terdepan");
            System.out.println("4.Cek semua antrian");
            System.out.println("5.cek antrian belakang");
            System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int Jumlah = sc.nextInt();
        queue antri = new queue(Jumlah);

        int pilih;
        do{
            menu();
                pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening: ");
                    sc.nextLine();
                    String norek =sc.nextLine();
                    System.out.print("Nama: ");
                    String nama =sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat =sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo =sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data =antri.Dequeue();
                    if(!"".equals(data.norek)&& !"".equals(data.nama)&& !"".equals(data.alamat)&& !"".equals(data.umur)&& 
                       !"".equals(data.saldo)){
                        System.out.println("Antrian yang dikeluarkan: " + data.norek + "" + data.nama + "" + data.alamat + ""
                                            + data.umur + "" + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
        }
    }while (pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5);
    sc.close();;
}
}