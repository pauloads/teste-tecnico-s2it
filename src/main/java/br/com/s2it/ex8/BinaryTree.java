package br.com.s2it.ex8;

/**
 *
 * @author Paulo
 */
public class BinaryTree {

    private int value;

    private BinaryTree left;

    private BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
    }

    public BinaryTree() {
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int sumSubsequentNodes(BinaryTree node) {
        if (node == null) {
            return 0;
        } else {
            return node.getValue() + sumSubsequentNodes(node.getLeft()) + sumSubsequentNodes(node.getRight());
        }
    }

}
