package tugas1;
/**
 * SLLMain
 */
public class SLLMain {

    
    public static void main(String[] args) {
        SingleLinkedList singLL=new SingleLinkedList ();
        singLL.addFirst("paul", 2345003);
        singLL.print();
        singLL.addLast("Tio",2345004 );
        singLL.print();
        singLL.addFirst("Vidi", 2345001);
        singLL.print();
        singLL.addLast("Nabeel", 2345002);
        singLL.print();
        singLL.InsertAfter("Vino", 2345002, 2345005);
        singLL.print();

       
    }
    
}