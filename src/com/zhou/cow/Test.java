package com.zhou.cow;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)throws Exception {
        int score ;
        String name;
        Scanner sc=new Scanner(System.in);
         System.out.println("请输入学生姓名");
         name=sc.next();
         System.out.println("请输入希望得到的分数");
         score=sc.nextInt();
         System.out.println(name+"在学习java课程，他希望在期末考试中得到"+score+"分");
         System.out.printf(name+"在学习java课程\n他希望在期末考试中得到"+score+"分");
    }

}
