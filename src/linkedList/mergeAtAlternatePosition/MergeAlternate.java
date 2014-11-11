package linkedList.mergeAtAlternatePosition;

import linkedList.LinkedList;

public class MergeAlternate {

	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		ll1.add(1);
		ll1.add(2);
		ll1.add(3);


		LinkedList ll2 = new LinkedList();
		ll2.add(4);
		ll2.add(5);
		ll2.add(6);
		ll2.add(7);
		ll2.add(8);
		
		LinkedList temp1 = ll1;
		while (temp1 != null) {
			System.out.println(temp1.getData());
			temp1 = temp1.getNextNode();
		}
		LinkedList temp2 = ll2;
		while (temp1 != null) {
			System.out.println(temp2.getData());
			temp2 = temp2.getNextNode();
		}
		System.out.println("===============");
		mergeAlternate(ll2,ll1);
		
		

		
		

	}

	private static void mergeAlternate(LinkedList ll1, LinkedList ll2) {
		LinkedList ll1NewHead = null;
		LinkedList ll2NewHead = null;
		
		LinkedList returnHead = ll1;
		

		LinkedList current1 = ll1;
		LinkedList current2 = ll2;
		LinkedList next1;
		LinkedList next2;
		while(current1 != null)
		{
			//update
			next1 = current1.getNextNode();
			next2 = current2.getNextNode();
			//change link
			current1.setNextNode(current2);
			current2.setNextNode(next1);
			
			ll1NewHead = next1;
			ll2NewHead = next2;
			
			current1 = next1;
			current2 = next2;
			
			if(next2 == null)
			{
				ll1NewHead = null;
				break;
			}
		}
		
		while (returnHead != null) {
			System.out.println(returnHead.getData());
			returnHead = returnHead.getNextNode();
		}
		System.out.println("=======returnhead finish=======");
		
		while (ll1NewHead != null) {
			System.out.println(ll1NewHead.getData());
			ll1NewHead = ll1NewHead.getNextNode();
		}
		System.out.println("=======ll1 new head finish=======");

		while (ll2NewHead != null) {
			System.out.println(ll2NewHead.getData());
			ll2NewHead = ll2NewHead.getNextNode();
		}
		System.out.println("=======ll2 new head finish=======");
	}

}
