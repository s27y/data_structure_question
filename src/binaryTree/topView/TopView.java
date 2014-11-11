package binaryTree.topView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import binaryTree.BinaryTreeNode;

public class TopView {

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
					tree21.setLeftChildNode(tree200);
					tree21.setRightChildNode(tree201);
				}
				
			}
		}
		Hashtable<Integer, String> topview = new Hashtable<Integer, String>();
		topView(tree0, topview,0);
		
		List<Integer> v = new ArrayList<Integer>(topview.keySet());
	    Collections.sort(v);

	    for (int i : v) {
	      System.out.println(i + " " + topview.get(i));
	    }
		//System.out.println(result);

	}

	private static void topView(BinaryTreeNode<String> tree, Hashtable<Integer, String> topview, int num) {
		if(tree == null)
		{
			return ;
		}

		if(!topview.containsKey(num))
		{
			topview.put(num, tree.getData());
		}
			
		tree.setVisited(true);
		
		if(tree.getLeftChildNode() != null && !tree.getLeftChildNode().isVisited())
		{
			int i = num-1;
			
			if(!topview.containsKey(i))
			{
				topview.put(i, tree.getLeftChildNode().getData());
			}
			
			topView(tree.getLeftChildNode(),topview,i);
		}
		if(tree.getRightChildNode() != null && !tree.getRightChildNode().isVisited())
		{
			int i = num+1;
			
			if(!topview.containsKey(i))
			{
				topview.put(i, tree.getRightChildNode().getData());
			}
			
			topView(tree.getRightChildNode(),topview,i);
		}
		
		return;
		
	}

	

}
