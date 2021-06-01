package _00_Intro_to_Linked_Lists;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
         * A LinkedList is a linear data structure, but unlike an ArrayList or
         * Array the data is not stored in contiguous memory locations.
         * 
         * Instead, each data node contains a reference that says where the next
         * node can be found.
         * 
         * Note: In the Node example provided there is also reference that
         * points back to the previous node.
         * 
         * 1. Read through the LinkedList and Node classes.
         * 
         * 2. Create a LinkedList of any type you like.
         * 
         * 3. Try using some LinkedList methods to add, remove and print
         * elements.
         * 
         * 4. Save the head or tail reference into a Node and try using 
         * references to perform an operation on every element in the LinkedList
         * 
         * e.g. multiply every element by something in a LinkedList containing
         * numbers or make word uppercase in a LinkedList containing String
         * nodes.
         * 
         */
    	
    	LinkedList<String> myList = new LinkedList<String>();
    	
    	myList.add("Hello");
    	myList.add("World!");
    	myList.add("League");
    	myList.add("coding");
    	myList.add("Java");
    	
    	Node<String> head = myList.getHead();
    	Node<String> currentNode = head;
    	
    	while (!currentNode.equals(myList.getTail())) {
    		
    		currentNode.setValue(currentNode.getValue().toUpperCase());
    		System.out.println(currentNode.getValue());
    		currentNode = currentNode.getNext();
    	}
    	currentNode.setValue(currentNode.getValue().toUpperCase());
    	System.out.println(currentNode.getValue());

    }

}
