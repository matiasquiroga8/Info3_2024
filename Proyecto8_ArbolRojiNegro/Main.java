
package Proyecto8_ArbolRojiNegro;

public class Main {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        
        int[] values = {10, 20, 30, 40, 50, 60, 70};
        for (int value : values) {
            tree.insert(value);
            tree.printTree();
            System.out.println("\n---------------------------\n");
        }
    }
}
