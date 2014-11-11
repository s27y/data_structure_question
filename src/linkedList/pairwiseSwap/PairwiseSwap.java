package linkedList.pairwiseSwap;

import linkedList.LinkedList;

public class PairwiseSwap {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		LinkedList temp = ll;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
		System.out.println("=================");

		ll = pairwiseSwap(ll);
		temp = ll;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
	}

	public static LinkedList pairwiseSwap(LinkedList ll) {
		
		LinkedList previous = null;
		LinkedList currentA = ll;
		LinkedList currentB;
		LinkedList next;
		LinkedList head = null;
		
		while(currentA.getNextNode() != null)
		{
			//System.out.println("1");
			//update
			currentB = currentA.getNextNode();
			LinkedList temp;
			next = currentB.getNextNode();
			//swap
			currentB.setNextNode(currentA);
			currentA.setNextNode(next);
			if(previous != null)
			{
				previous.setNextNode(currentB);	
			}
			else // means this is first loop, update new head
			{
				head= currentB;
			}
			
			//update for new loop
			previous = currentA;
			currentA = currentA.getNextNode();
			if(currentA == null)
			{
				break;
			}
		}
		
		
		
		return head;
	}

}
