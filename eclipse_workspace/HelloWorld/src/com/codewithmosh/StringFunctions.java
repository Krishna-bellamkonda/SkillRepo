package com.codewithmosh;

class StringFunctions {
	
	public static String stringReversal(String s){
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}
