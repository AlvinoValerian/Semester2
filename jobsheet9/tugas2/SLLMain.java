package tugas2;
/**
 * SLLMain
 */
public class SLLMain {

    
    public static void main(String[] args) {
        SingleLinkedList singll = new  SingleLinkedList();
        System.out.println("---------Antrian Mahasiswa---------");
       singll.add("Pajri", 1234501);
       singll.add("Vino", 1234502);
       singll.add("Nabeel", 1234503);
       singll.add("Gwido", 1234504);
       singll.add("Tio", 1234505);

       singll.print();
       singll.remove();
       singll.print();
    }
    
}