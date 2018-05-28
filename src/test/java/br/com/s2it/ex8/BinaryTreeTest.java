package br.com.s2it.ex8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo
 */
public class BinaryTreeTest {

    public BinaryTreeTest() {
    }

    @Test
    public void testSumSubsequentNodes() {

        BinaryTree root = new BinaryTree(1);
        root.setLeft(new BinaryTree(2));
        root.setRight(new BinaryTree(3));
        root.getLeft().setLeft(new BinaryTree(4));
        root.getLeft().setRight(new BinaryTree(5));
        root.getRight().setRight(new BinaryTree(6));
        
        int sum = new BinaryTree().sumSubsequentNodes(root);
        
        assertEquals(21, sum);
    }

}
