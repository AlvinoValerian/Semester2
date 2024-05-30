package tugas;

public class Pembeli05 {
        String nama;
        int nomorHP;
    
        public Pembeli05(){
        }
        Pembeli05 (String nama, int nomorHP){
            this.nama = nama;
            this.nomorHP = nomorHP;
    
        }
        Pembeli05 [] antrian;
        int front;
        int rear;
        int size;
        int max;
    
        public Pembeli05 (int n) {
            max = n;
            antrian = new Pembeli05 [max];
            size = 0;
            front = rear = -1;
        }
        public boolean IsEmpty(){
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
        public boolean IsFull(){
            if (size == max) {
                return true;
            } else {
                return false;
            }
        }
        public void Enqueue(Pembeli05 dt) {
            if (IsFull()) {
                System.out.println("Queue Sudah Penuh");
            } else {
                if (IsEmpty()) {
                    front = rear = 0;
                } else {
                    if (rear == max - 1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                antrian[rear] = dt;
                size++;
            }
        }
        public Pembeli05 Dequeue() {
            Pembeli05 dt = new Pembeli05();
            if (IsEmpty()) {
                System.out.println("Queue Masih Kosong");
            } else {
                dt = antrian[front];
                size--;
                if (IsEmpty()) {
                    front = rear = -1;
                } else {
                    if (front == max -1){
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            return dt;
        }
        public void print() {
            if (IsEmpty()) {
                System.out.println("Queue Masih Kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println(antrian[i].nama + " " + antrian[i].nomorHP);
                    i = (i + 1) % max;
                }
                System.out.println(antrian[i].nama + " " + antrian[i].nomorHP);
                System.out.println("Jumlah Elemen = " + size );
            }
        }
        public void peek() {
            if(!IsEmpty()){
                System.out.println("Pelanggan Terdepan : " + antrian[front].nama);
            } else {
                System.out.println("Antrian Masih Kosong");
            }
        }
        public void peekRear() {
            if(!IsEmpty()) {
                System.out.println("Atrian Pelanggan Posisi Belakang : " + antrian[rear].nama);
            } else {
                System.out.println("Antrian Masih Kosong");
            }
        }
        public void peekPosition(String nama) {
            int posisi = -1;
            for (int i = 0; i < size; i++) {
                if (antrian[i].nama.equalsIgnoreCase(nama)){
                    posisi = i + 1;
                    break;
                }
            }
            if (posisi != -1) {
                System.out.println("Pelanggan " + nama + " Berada Di Posisi ke-" + posisi);
            } else {
                System.out.println("Pelanggan " + nama + " Tidak Ditemukan Dalam Antrian");
            }
        }
        public void daftarPelanggan() { 
            if (IsEmpty()) {
                System.out.println("Antrian Masih Kosong");
            } else {
                System.out.println("Daftar Pelanggan Dalam Antrian : ");
                int i = front;
                do {
                    System.out.println(antrian[i].nama);
                    i = (i + 1) % max;
                } while (i != rear);
                System.out.println(antrian[i].nama);
            }
        }
    }
