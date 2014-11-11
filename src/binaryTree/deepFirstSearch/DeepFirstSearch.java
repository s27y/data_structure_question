package binaryTree.deepFirstSearch;

import binaryTree.BinaryTreeNode;

public class DeepFirstSearch {

	public static void main(String[] args) {
		BinaryTreeNode<String> tree0 = new BinaryTreeNode<String>("A");
		{
			BinaryTreeNode<String> tree1 = new BinaryTreeNode<String>("B");
			BinaryTreeNode<String> tree2 = new BinaryTreeNode<String>("C");
			tree0.setLeftChildNode(tree1);
			tree0.setRightChildNode(tree2);
			{
				BinaryTreeNode<String> tree10 = new BinaryTreeNode<String>("D");
				BinaryTreeNode<String> tree11 = new BinaryTreeNode<String>("E");
				tree1.setLeftChildNode(tree10);
				tree1.setRightChildNode(tree11);
				{
					BinaryTreeNode<String> tree100 = new BinaryTreeNode<String>("X");
					tree10.setLeftChildNode(tree100);
				}
				
				BinaryTreeNode<String> tree20 = new BinaryTreeNode<String>("F");
				BinaryTreeNode<String> tree21 = new BinaryTreeNode<String>("G");
				tree2.setLeftChildNode(tree20);
				tree2.setRightChildNode(tree21);
				{
					BinaryTreeNode<String> tree200 = new BinaryTreeNode<String>("H");
					BinaryTreeNode<String> tree201 = new BinaryTreeNode<String>("I");
					tree20.setLeftChildNode(tree200);
					tree20.setRightChildNode(tree201);
				}
				
			}
		}
			
		
		search(tree0,"H");

		
	}

	public static void search(BinaryTreeNode<String> tree, String string) {
		if(tree.getData().equals(string))
		{
			System.out.println("Found");
		}
			
		tree.setVisited(true);
		
		if(tree.getLeftChildNode() != null && !tree.getLeftChildNode().isVisited())
		{
			search(tree.getLeftChildNode(), string);
		}
		if(tree.getRightChildNode() != null && !tree.getRightChildNode().isVisited())
		{
			search(tree.getRightChildNode(), string);
		}
	
	}

}
