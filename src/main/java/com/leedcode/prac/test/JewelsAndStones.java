package com.leedcode.prac.test;

public class JewelsAndStones {
	public static void main(String[] args) {
		JewelsAndStones obj = new JewelsAndStones();
		obj.numJewelsInStones("aA", "aAAbbbb");
	}
	
	public int numJewelsInStones(String J, String S) {
		char[] jewelType = J.toCharArray();
		char[] stone = S.toCharArray();
		int count = 0;
		for (char c : jewelType) {
			for (char s : stone) {
				if (s==c) {
					count++;
				}
			}
		}
        return count;
    }

}
