package com.zhou.allsub;

public class AllSubsequence {

	public static void printAllSub(char[] str, int i, String res) {
		if(i == str.length) {
			System.out.println(res);
			return;  //设置终止条件，当来到整个字符串的末尾，就结束了
		}
		printAllSub(str, i + 1, res);//当前字符不要他 让他为空
		printAllSub(str, i + 1, res + String.valueOf(str[i]));//要当前字符串
		
	}
	
	public static void main(String[] args) {
		String str = "abc";
		printAllSub(str.toCharArray(), 0, "");
	}
}

