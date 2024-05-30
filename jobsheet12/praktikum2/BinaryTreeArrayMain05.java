package praktikum2;

public class BinaryTreeArrayMain05 {
    public static void main(String[] args) {
        BinarryTreeArray05 bta = new BinarryTreeArray05();
        int[] data = {6,4,8,3,5,7,10,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.populateData(data, data.length - 1);
        System.out.print("\nInorder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("InOrder traversal: ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("PreOrder traversal: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("PostOrder traversal: ");
        bta.traversePostOrder(0);
        System.out.println();

        bta.add(9);
        System.out.print("InOrder traversal after 9: ");
        bta.traverseInOrder(0);
        System.out.println();
    }
}
