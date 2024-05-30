package praktikum1;
public class BinaryTreeMain05 {
    public static void main(String[] args) {
        BinaryTree05 bt = new BinaryTree05();
        bt.Recursive(5);
        bt.Recursive(3);
        bt.Recursive(7);
        bt.Recursive(2);
        bt.Recursive(4);
        bt.Recursive(6);
        bt.Recursive(8);
        System.out.print("preOrder traversal");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder traversal");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("postOrder traversal");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("find node : "+bt.find(6));
        System.out.println("delete node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("preOrder traversal :");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("maximal: ");
        bt.findMaximal();
        System.out.println("");
        System.out.print("minimal: ");
        bt.findMinimal();
        System.out.println("");
        System.out.print("data yang ada di leaf: ");
        bt.printLeaves();;
        System.out.println("");
        System.out.print("berapa jumlah leaf: ");
        bt.countLeaves();
        System.out.println("");
    }
}
