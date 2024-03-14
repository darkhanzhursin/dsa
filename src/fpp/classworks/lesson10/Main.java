package fpp.classworks.lesson10;

import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(25);
        int arr[] = {2, 12, 45};
        for (int i : arr) bst.insert(i);
        System.out.print("Inorder traverse: ");
        bst.inOrderTraverse(bst.root);
        System.out.println();
//        System.out.print("Preorder traverse: ");
//        bst.preOrderTraverse(bst.root);
//        System.out.println();
//        System.out.print("Post order traverse: ");
//        bst.postOrderTraverse(bst.root);
//        System.out.println();
//        System.out.println(bst.seacrh(bst.root, 2));
        bst.deleteNode(bst.root, 25);
        System.out.print("After deleting: ");
        bst.inOrderTraverse(bst.root);
    }
}
