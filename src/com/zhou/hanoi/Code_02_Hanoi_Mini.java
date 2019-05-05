package com.zhou.hanoi;

import java.util.ArrayList;

public class Code_02_Hanoi_Mini {
	
	private static ArrayList<String> list;
	
	public static ArrayList<String> getSolution(int n){
		list = new ArrayList<String>();
		process(n, "��","��","��");
		return list;
	}
	
	public static void process(int n, String from, String to, String help) {
		//�����ǰ� ���е��� �� from �ƶ��� to 
		if(n == 1) {
			list.add("Move 1 from " + from + " to " + to);
		}else {
			//��ǰ n-1���� ��from �ƶ��� help,����to 
			process(n-1, from, help, to);
			//��������һ���� �ƶ��� to
			list.add("Move " + n + " from " + from + " to " + to);
			//�ٰ�ǰ n-1���� ��help �ƶ��� to,����from
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
Move 1 from �� to ��
Move 2 from �� to ��
Move 1 from �� to ��
Move 3 from �� to ��
Move 1 from �� to ��
Move 2 from �� to ��
Move 1 from �� to ��
 */
