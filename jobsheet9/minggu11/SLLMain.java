package minggu11;
/**
 * SLLMain
 */
public class SLLMain {

    
    public static void main(String[] args) {
        SingleLinkedList singLL=new SingleLinkedList ();
        singLL.print();;
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.InsertAfter(700, 999);
        singLL.print();
        singLL.InsertAt(3, 833);
        singLL.print();

        System.out.println("Data Pada indeks ke-1="+singLL.getdata(1));
        System.out.println("Data 3 berada pada indeks ke-"+singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();

        
    }
    
}