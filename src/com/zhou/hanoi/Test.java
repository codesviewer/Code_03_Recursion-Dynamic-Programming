package com.zhou.hanoi;

public class Test {
	public static void process(int n, String from, String to, String help) {
        //现在是把 所有的数 从 from 移动到 to
        if(n == 1) {
            System.out.println("Move 1 from " + from + " to " + to);
        }else {
            //把前 n-1个数 从from 移动到 help,借助to
            process(n-1, from, help, to);
            //把那最后的一个数 移动到 to
            System.out.println("Move " + n + " from " + from + " to " + to);
            //再把前 n-1个数 从help 移动到 to,借助from
            process(n-1, help, to, from);
        }
   }
   public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 3;
        process(n, "左","右","中");
   }
   
}
