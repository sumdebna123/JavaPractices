//package com.test.springboot.javaBasic.javaBasic;
//
//import java.util.ArrayList;
//import java.util.List;
//
///*
// * https://www.hackerrank.com/challenges/tag-content-extractor/problem?
// * utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
// * 
// * 
// */
//public class TargRemoverFromString {
//	public static void main(String[] args) {
//		removeTag1("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
//		//System.out.println(removeTag("<h1>Sanjay has no watch</h1>"));
//		
//	}
//	
//	
//	public static void removeTag1(String str) {
//		char[] charArray =str.toCharArray();
//		int index =0;
//		List<Integer> leftIndex =new ArrayList<>();
//		List<Integer> rightIndex =new ArrayList<>();
//		List<String> tagList=new ArrayList<>();
//
//		for (char ch : charArray) {
//			if (ch=='<') {
//				leftIndex.add(index);
//			}
//			if (ch=='>') {
//				rightIndex.add(index);
//			} 
//			index++;
//		}
//		for (int i: leftIndex) {
//			System.out.println(i);
//		}
//		System.out.println("****");
//		
//		for (int i: rightIndex) {
//			System.out.println(i);
//		}
//		
//		for (int i=0;i<leftIndex.size();i++) {
//			tagList.add(str.substring(leftIndex.get(i),rightIndex.get(i)));
//		}
//		
//		for (String s: tagList) System.out.println(s);
//		
//		
//	}
//	
//	public static String removeTag(String str) {
//		
//		char[] charArry = str.toCharArray();
//		int index =0;
//		List<Integer> indexStartList = new ArrayList<Integer>();
//		List<Integer> indexEndList = new ArrayList<Integer>();
//		List<String> tagList = new ArrayList<String>();
//		
//		for (char ch : charArry) {
//			if (ch=='<')
//				indexStartList.add(index);
//			if (ch=='>') 
//				indexEndList.add(index);
//			index++;
//		}
//		
//		for (int i=0;i<indexStartList.size();i++) {
//			tagList.add(str.substring(indexStartList.get(i),indexEndList.get(i)));
//		}
//		String tempStr =str;
//		
//		for (String s:tagList) {
//			tempStr=tempStr.replaceAll(s, "");
//			System.out.println("tempStr :"+tempStr);
//		}
//			
//		System.out.println("This is demo :"+tempStr);
//		
//		return tempStr.replaceAll(">","");
//		
//		
//	}
//
//}
