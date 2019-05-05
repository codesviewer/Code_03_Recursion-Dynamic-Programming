package com.zhou.hanoi;

import java.util.ArrayList;

public class Code_02_Hanoi_Mini {
	
	private static ArrayList<String> list;
	
	public static ArrayList<String> getSolution(int n){
		list = new ArrayList<String>();
		process(n, "左","右","中");
		return list;
	}
	
	public static void process(int n, String from, String to, String help) {
		//现在是把 所有的数 从 from 移动到 to 
		if(n == 1) {
			list.add("Move 1 from " + from + " to " + to);
		}else {
			//把前 n-1个数 从from 移动到 help,借助to 
			process(n-1, from, help, to);
			//把那最后的一个数 移动到 to
			list.add("Move " + n + " from " + from + " to " + to);
			//再把前 n-1个数 从help 移动到 to,借助from
			process(n-1, help, to, from);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for(int i = 0; i < getSolution(n).size(); i++)
		    System.out.println(list.get(i));
	}
}
/** 
Move 1 from 左 to 右
Move 2 from 左 to 中
Move 1 from 右 to 中
Move 3 from 左 to 右
Move 1 from 中 to 左
Move 2 from 中 to 右
Move 1 from 左 to 右
 */
