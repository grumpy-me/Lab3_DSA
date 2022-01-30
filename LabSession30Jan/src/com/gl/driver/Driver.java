package com.gl.driver;

import java.util.Scanner;

import com.gl.logic.BalancedBrackets;
import com.gl.logic.LongestPathTree;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter bracket expression:");
		System.out.println(BalancedBrackets.isBalanced(scanner.next()));
		
		
		TreeNode rootNode = new TreeNode(100);
		rootNode.left = new TreeNode(20);
		rootNode.right = new TreeNode(130);
		rootNode.left.left = new TreeNode(10);
		rootNode.left.right = new TreeNode(40);
		rootNode.right.left = new TreeNode(90);
		rootNode.left.left.left = new TreeNode(5);

		System.out.println("Longest Path:" + LongestPathTree.findLongestPath(rootNode).toString());

	}
	
}
