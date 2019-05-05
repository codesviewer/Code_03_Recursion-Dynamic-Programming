package com.zhou.hanoi;

public class Test {
	public static void process(int n, String from, String to, String help) {
        //�����ǰ� ���е��� �� from �ƶ��� to
        if(n == 1) {
            System.out.println("Move 1 from " + from + " to " + to);
        }else {
            //��ǰ n-1���� ��from �ƶ��� help,����to
            process(n-1, from, help, to);
            //��������һ���� �ƶ��� to
            System.out.println("Move " + n + " from " + from + " to " + to);
            //�ٰ�ǰ n-1���� ��help �ƶ��� to,����from
            process(n-1, help, to, from);
        }
   }
   public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 3;
        process(n, "��","��","��");
   }
   
}
