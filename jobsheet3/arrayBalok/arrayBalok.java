package arrayBalok;

public class arrayBalok {
    public static void main(String[] args) {
        balok[] blArray = new balok[3];

        blArray[0]= new balok(100, 30, 12);
        blArray[1]= new balok(120, 40, 15);
        blArray[2]= new balok(210, 50, 25);

    for(int i=0;i<3;i++){
        System.out.println("Hitung Volume ke-"+i+": "+blArray[i].hitungVolume());
    }

    System.out.println();

        segitiga[] sgArray = new segitiga[4];

        sgArray[0]=new segitiga(10, 4);
        sgArray[1]=new segitiga(20, 10);
        sgArray[2]=new segitiga(15, 6);
        sgArray[3]=new segitiga(25, 10);
    
    for(int i=0;i<4;i++){
        System.out.println("Hitung Luas Segitiga Ke- :"+i+", Luas:"+String.format("%.2f",sgArray[i].hitungLuas()));
        System.out.println("Hitung Kell Segitiga Ke- :"+i+", Kell:"+String.format("%.2f",sgArray[i].hitungKeliling()));
    }
    }
}
