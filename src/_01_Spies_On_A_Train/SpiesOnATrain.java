package _01_Spies_On_A_Train;

import java.util.Arrays;
import java.util.HashMap;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

	/*
	 * A spy has made off with important intel from your intelligence agency! You
	 * know the spy is somewhere on this train(LinkedList). Your job is to find the
	 * suspect that matches the description given to you by the list of clues(the
	 * array).
	 * 
	 * Walk through the train, questioning each of the passengers about what they
	 * have seen and return the name of the most likely suspect.
	 */
	String findIntel(LinkedList<TrainCar> train, String[] clues) {
		System.out.println(Arrays.toString(clues));
		HashMap<String, Integer> suspectToClues = new HashMap<String, Integer>();
		Node<TrainCar> head = train.getHead();
		Node<TrainCar> currentNode = head;
		String response = currentNode.getValue().questionPassenger();
		while (currentNode.equals(null)) {
			for (String clue:clues) {
			if ( response.contains(clue)) {
				int index = response.indexOf("saw");
				int clueIndex = response.indexOf(clue);
				String name = response.substring(index + 3, clueIndex).trim();
				Integer fromSuspect = suspectToClues.get(name);
				if (fromSuspect == null) fromSuspect = 0;	
				fromSuspect++;
				suspectToClues.put(name, fromSuspect);
			}
			}
			System.out.println(response);
			currentNode = currentNode.getNext();
			response = currentNode.getValue().questionPassenger();
		}
		for (String key : suspectToClues.keySet()) {
			int amount= suspectToClues.get(key);
			if (amount == 3) {
				return key; 
			}
		}
		return null;

	}

}
