package linkedList.reverseAlternate;
import linkedList.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		
		LinkedList currentNode = ll;
		while(currentNode != null)
		{
	    	 //System.out.println(currentNode.getData());
	    	 currentNode = currentNode.getNextNode();
	
		}
		
		LinkedList rl = reverseLinkedList(ll);
		int count=0;
		currentNode = rl;
		while(currentNode != null&&  count != 10)
		{
	    	 System.out.println(currentNode.getData());
	    	 currentNode = currentNode.getNextNode();
	    	 count++;
	
		}
		
	}

	public static LinkedList reverseLinkedList(LinkedList ll) {
		
		LinkedList previousNode = null;
		LinkedList currentNode;
		LinkedList nextNode;
		currentNode = ll;
		while(currentNode != null)
		{
			nextNode = currentNode.getNextNode();
			currentNode.setNextNode(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		
		return previousNode;
		
	}
	
	

}
