package com.zhou.cow;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)throws Exception {
        int score ;
        String name;
        Scanner sc=new Scanner(System.in);
         System.out.println("������ѧ������");
         name=sc.next();
         System.out.println("������ϣ���õ��ķ���");
         score=sc.nextInt();
         System.out.println(name+"��ѧϰjava�γ̣���ϣ������ĩ�����еõ�"+score+"��");
         System.out.printf(name+"��ѧϰjava�γ�\n��ϣ������ĩ�����еõ�"+score+"��");
    }

}
