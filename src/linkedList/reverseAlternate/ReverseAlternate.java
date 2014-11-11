package linkedList.reverseAlternate;

import linkedList.LinkedList;


public class ReverseAlternate {

	public static void main(String[] args) {
		 // create a linked list
	      LinkedList ll = new LinkedList();
	      ll.add(1);
	      ll.add(2);
	      ll.add(3);
	      ll.add(4);
	      ll.add(5);
	      ll.add(6);


	      LinkedList newL = reverseAlternate(ll);
	      
	      LinkedList temp = ll;
			while(temp != null)
			{
				System.out.println(temp.getData());
				temp = temp.getNextNode();
			}
	}

	public static LinkedList reverseAlternate(LinkedList ll) {
		
		LinkedList temp = ll;
		LinkedList even = new LinkedList();
		while(temp != null)
		{
			if(temp.getNextNode() != null)
			{
				even.add(temp.getNextNode().getData());
				temp.setNextNode(temp.getNextNode().getNextNode());
			}
			temp = temp.getNextNode();
		}
		temp = ll;
		while(temp != null)
		{
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
		System.out.println("==============");
		even = ReverseLinkedList.reverseLinkedList(even);
		
		ll.addNode(even);
		
		return ll;
		
		
		
	}

}
