package com.zhou.allsub;

public class AllSubsequence {

	public static void printAllSub(char[] str, int i, String res) {
		if(i == str.length) {
			System.out.println(res);
			return;  //������ֹ�����������������ַ�����ĩβ���ͽ�����
		}
		printAllSub(str, i + 1, res);//��ǰ�ַ���Ҫ�� ����Ϊ��
		printAllSub(str, i + 1, res + String.valueOf(str[i]));//Ҫ��ǰ�ַ���
		
	}
	
	public static void main(String[] args) {
		String str = "abc";
		printAllSub(str.toCharArray(), 0, "");
	}
}

