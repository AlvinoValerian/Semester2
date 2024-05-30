import java.util.Scanner;

public class arrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Baris Array: ");
        int baris = sc.nextInt();
        persegiPanjang[] ppArray = new persegiPanjang[baris];
        // percobaan 1
        // ppArray[0]=new persegiPanjang();
        // ppArray[0].panjang=110;
        // ppArray[0].lebar=30;

        // ppArray[1]=new persegiPanjang();
        // ppArray[1].panjang=80;
        // ppArray[1].lebar=40;

        // ppArray[2]=new persegiPanjang();
        // ppArray[2].panjang=100;
        // ppArray[2].lebar=20;
        for (int i=0;i<ppArray.length;i++) {
            ppArray[i]=new persegiPanjang();
            System.out.println("Persegi Panjang ke-"+i);
            System.out.print("Masukkan Panjang: " );
            ppArray[i].panjang= sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar=sc.nextInt();
        }
        // percobaan1
        // System.out.println("Persegi Panjang ke-0 Panjang: "+ppArray[0].panjang+" , Lebar :"+ppArray[0].lebar);
        // System.out.println("Persegi Panjang ke-1 Panjang: "+ppArray[1].panjang+" , Lebar :"+ppArray[1].lebar);
        // System.out.println("Persegi Panjang ke-2 Panjang: "+ppArray[2].panjang+" , Lebar :"+ppArray[2].lebar);

        for(int i=0;i<3;i++){
            System.out.println("Persegi Panjang Ke- "+i+" Panjang: "+ppArray[i].panjang+", Lebar: "+ppArray[i].lebar);
        }

        sc.close();
    }
    
}