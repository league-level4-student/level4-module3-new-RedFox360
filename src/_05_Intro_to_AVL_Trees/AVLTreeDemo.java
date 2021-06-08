package _05_Intro_to_AVL_Trees;

import _03_Intro_to_Binary_Trees.BinaryTree;

public class AVLTreeDemo {

    /*
     * An AVLTree is a special BinaryTree that is capable of balancing itself.
     * On a regular binary tree, depending on the elements inserted, you might
     * have a root with one very long right branch and one very long left branch
     * with nothing else in between.
     * 
     * 1.) Read through the AVLNode and AVLTree. Notice that the methods are
     * similar to those in BinaryTree with two important distinctions:
     * 
     * a) Each Node has a balance factor that keeps track of how many levels
     * "down" it is relative to the rest of the tree.
     * 
     * b) There are "rotate" helper methods used when a given node gets too
     * unbalanced(> 1 level out of sync with the rest of the tree) to rotate
     * branches back into place.
     * 
     * 2.) Create a BinaryTree and an AVLTree.
     * 
     * 3.) Try inserting the same values into both trees and observe how they
     * differ using the print method.
     * 
     * 4.) Try removing elements and see how they change.
     */

    public static void main(String[] args) {
    	BinaryTree<Integer> b=new BinaryTree<Integer>();
    	AVLTree<Integer> a=new AVLTree<Integer>();
    	
    	b.insert(4);
    	b.insert(5);
    	b.insert(6);
    	a.insert(6);
    	a.insert(7);
    	a.insert(8);
    	System.out.println("--- Binary Tree ---");
    	b.print();
    	System.out.println("--- AVL Tree ---");
    	a.print();
    }

}
