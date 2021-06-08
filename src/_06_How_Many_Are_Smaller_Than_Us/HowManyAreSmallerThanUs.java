package _06_How_Many_Are_Smaller_Than_Us;

import java.util.ArrayList;

import _03_Intro_to_Binary_Trees.Node;
import _04_Morse_Code.MorseCode;
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
		for (int i = 0; i < nums.length; i++) {
			avlTree.recursiveSearch(avlTree.getRoot(), )
//			counts[i] = 0;
//			for (int n : nums) {
//				if (n < nums[i]) {
//					counts[i] = counts[i] + 1;
//				}
//			}
		}
		return counts;
	}
	
    protected Integer recursiveSearch(AVLNode<Integer> current, Integer value) {
    	int count = 0;
        if (current == null) {
            return null;
        } else if (value < current.getValue()) {
            count += 1;
        } else if (value.compareTo(current.getValue()) < 0) {
            return recursiveSearch(current.getLeft(), value);
        } else {
            return recursiveSearch(current.getRight(), value);
        }
        return count;

    }

}
