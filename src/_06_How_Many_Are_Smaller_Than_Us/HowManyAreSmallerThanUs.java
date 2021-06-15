package _06_How_Many_Are_Smaller_Than_Us;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanUs {

	/*
	 * Given an array and an AVLTree filled with the numbers from the array, use the
	 * AVLTree to return an array that contains the number of elements smaller than
	 * each number.
	 * 
	 * e.g. if given the array [1,2,3,4]
	 * 
	 * your return array should look like [0,1,2,3]
	 * 
	 * Check the console output to see if you got it correct. Your second array
	 * should only contain the unique values of 0-9.
	 * 
	 * Hint: You may want to create a helper method to search through the AVLTree
	 * and count iteratively or recursively.
	 */

	public int[] howManyAreSmallerThanUs(int[] nums, AVLTree<Integer> avlTree) {
		int[] counts = new int[nums.length];
		for (int i = 0; i < counts.length; i++) {
			counts[i]=count(avlTree.getRoot(), nums[i], 0);
		}
		return counts;
	}
    protected int count(AVLNode<Integer> current, int value, int c) {
    	
    	if (current == null) return c;
    	if (current.getValue() >= value) {
    		c=count(current.getLeft(), value, c);
    		
    		
    		
    		
    	} else {
    		c += 1;
    		c=count(current.getLeft(), value, c);
    		c=count(current.getRight(), value, c);
    		
    	}
    	
    	return c;
    }

}
