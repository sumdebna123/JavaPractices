package com.leedcode.prac.test;

public class VallidateBinarySearchTree {
	
	public static void main(String[] args) {
		int[] binarySerachTree = {5,4,6,3,7,2,8};
		for (int i=0;i<binarySerachTree.length-3;i++) {
			System.out.println(validateBinarySerachTree(binarySerachTree[i],binarySerachTree[2*i+1], binarySerachTree[2*i+2]));
			if (!validateBinarySerachTree(binarySerachTree[i],binarySerachTree[2*i+1], binarySerachTree[2*i+2])) {
				System.out.println("Invalid");
				break;
			}
		}
		System.out.println("Valid");

	}
	
	
	public static boolean validateBinarySerachTree(int root, int lNode, int rNode) {
		System.out.println(root);
		System.out.println(lNode);
		System.out.println(rNode);
		if (root>lNode && root<rNode) {
			return true;
		} else {
			return false;
		}
	}

}
