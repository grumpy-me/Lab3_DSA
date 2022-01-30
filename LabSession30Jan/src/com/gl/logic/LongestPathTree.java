package com.gl.logic;

import java.util.ArrayList;

import com.gl.driver.TreeNode;

public class LongestPathTree {

	public LongestPathTree() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Integer> findLongestPath(TreeNode rootNode) {
		
		if (rootNode == null) {
			ArrayList<Integer> arr = new ArrayList<Integer>();			
			return arr;
		}
		
		ArrayList<Integer> leftArray = 	findLongestPath(rootNode.left);			
		ArrayList<Integer> rightArray = findLongestPath(rootNode.right);	
		
		if (leftArray.size() > rightArray.size()) {
			leftArray.add(0, rootNode.key);
			return leftArray;
		} else {
			rightArray.add(0, rootNode.key);
			return rightArray;
		}
		
	}
}
