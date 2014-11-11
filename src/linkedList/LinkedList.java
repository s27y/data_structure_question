package linkedList;


public class LinkedList {
	Object data;
	LinkedList nextNode;
	
	public LinkedList(Object obj) {

		this.data = obj;
		nextNode=null;
	}
	
	public LinkedList() {

		this.data = null;
		nextNode=null;
	}
	
	
	
	public Object getData() {
		return data;
	}



	public void setData(Object data) {
		this.data = data;
	}



	public LinkedList getNextNode() {
		return nextNode;
	}



	public void setNextNode(LinkedList nextNode) {
		this.nextNode = nextNode;
	}



	public void add(Object obj)
	{
		LinkedList currentNode = this;
		LinkedList newNode = new LinkedList(obj);
		
		if(this.getData() != null)
		{
			while(currentNode.nextNode != null)
			{
				currentNode = currentNode.nextNode;
			}
			currentNode.setNextNode(newNode);
		}
		else
		{
			this.setData(obj);
		}
		
		
		
	}
	
	public void addNode(LinkedList node)
	{
		LinkedList currentNode = this;
		
		while(currentNode.nextNode != null)
		{
			currentNode = currentNode.nextNode;
		}
		
		currentNode.setNextNode(node);
	}
}
