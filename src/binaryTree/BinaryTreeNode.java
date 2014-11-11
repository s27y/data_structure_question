package binaryTree;

public class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> parentNode;
	BinaryTreeNode<T> leftChildNode;
	BinaryTreeNode<T> rightChildNode;
	boolean isVisited;
	
	public BinaryTreeNode() {
		data = null;
		parentNode = null;
		leftChildNode = null;
		rightChildNode = null;
		isVisited = false;
	}

	public BinaryTreeNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeNode<T> getParentNode() {
		return parentNode;
	}

	public void setParentNode(BinaryTreeNode<T> parentNode) {
		this.parentNode = parentNode;
	}

	public BinaryTreeNode<T> getLeftChildNode() {
		return leftChildNode;
	}

	public void setLeftChildNode(BinaryTreeNode<T> leftChildNode) {
		this.leftChildNode = leftChildNode;
		leftChildNode.setParentNode(this);
	}

	public BinaryTreeNode<T> getRightChildNode() {
		return rightChildNode;
	}

	public void setRightChildNode(BinaryTreeNode<T> rightChildNode) {
		this.rightChildNode = rightChildNode;
		rightChildNode.setParentNode(this);
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	
	

}
