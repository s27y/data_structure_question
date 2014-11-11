package linkedList.deleteMafterN;

import linkedList.LinkedList;

public class DeleteMeveryN {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
	      ll.add(1);
	      ll.add(2);
	      ll.add(3);
	      ll.add(4);
	      ll.add(5);



	      LinkedList newL = deleteMeveryN(ll,2, 2);
	      
	      LinkedList temp = newL;
			while(temp != null)
			{
				System.out.println(temp.getData());
				temp = temp.getNextNode();
			}
	}

	public static LinkedList deleteMeveryN(LinkedList ll,int m, int n) {
		int countM=1;
		boolean mFlag = true;
		int countN=0;
		boolean nFlag = false;
		LinkedList temp = ll;
		LinkedList previous = null;
		while(temp != null)
		{
			temp = temp.getNextNode();

			if(mFlag)
			{
				countM++;
			}
			if(nFlag)
			{
				countN++;
			}
			
			if(countM == m)
			{
				previous = temp;
				//previous.setNextNode(null);
				countM = 0;
				mFlag=false;
				nFlag=true;
			}
			if(countN == n)
			{
				if(temp != null)
				previous.setNextNode(temp.getNextNode());
				
				countN = 0;
				mFlag=true;
				nFlag=false;
			}
			
		}
		if(mFlag)
			previous.setNextNode(null);
		
		return ll;
	}

}
