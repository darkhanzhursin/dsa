package miu.fpp.classworks.lesson10BST;

public class Main {
    public static void main(String[] args) {
//        BinarySearchTree bst = new BinarySearchTree(25);
//        int arr[] = {2, 12, 45};
//        for (int i : arr) bst.insert(i);
//        System.out.println(bst);
//        System.out.print("Inorder traverse: ");
//        bst.inOrderTraverse(bst.root);
//        System.out.println();
//        System.out.print("Preorder traverse: ");
//        bst.preOrderTraverse(bst.root);
//        System.out.println();
//        System.out.print("Post order traverse: ");
//        bst.postOrderTraverse(bst.root);
//        System.out.println();
//        System.out.println(bst.seacrh(bst.root, 2));
//        bst.deleteNode(bst.root, 25);
//        System.out.print("After deleting: ");
//        bst.inOrderTraverse(bst.root);

        BinarySearchTree bst = new BinarySearchTree();
        Integer[] arr = {2,1,3,null,null,0,1};
        for (Integer i : arr) bst.insertFromArr(i);
        System.out.println(bst.evaluateTree(bst.root));
    }
}
