package com.zhou.minpath;

public class Code_07_MinPath {
	public static int minPath1(int[][] matrix) {
		return process1(matrix, matrix.length - 1, matrix[0].length - 1);
	}
	//�����ݹ鳢�Է��� ���ӶȺܸ� ���澭���˴������ظ�����
	public static int process1(int[][] matrix, int i, int j) {
		int res = matrix[i][j];
		if (i == 0 && j == 0) {
			return res;
		}
		if (i == 0 && j != 0) {
			return res + process1(matrix, i, j - 1);
		}
		if (i != 0 && j == 0) {
			return res + process1(matrix, i - 1, j);
		}
		return res + Math.min(process1(matrix, i, j - 1), process1(matrix, i - 1, j));
	}
	//��̬�滮�汾
	public static int minPath2(int[][] m) {
		if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
			return 0;
		}
		int row = m.length;  //��
		int col = m[0].length; //��
		int[][] dp = new int[row][col];
		dp[0][0] = m[0][0];
		//�����Ͻǿ�ʼ ��һ�� �ӿ�ʼλ�����ҿ�ʼ�� �ӵ� ��һ�е�ĩβ
		for (int i = 1; i < row; i++) {
			dp[i][0] = dp[i - 1][0] + m[i][0];
		}
		//�����Ͻǿ�ʼ ��һ�� �ӿ�ʼλ�����¿�ʼ�� �ӵ� ��һ�е�ĩβ
		for (int j = 1; j < col; j++) {
			dp[0][j] = dp[0][j - 1] + m[0][j];
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + m[i][j];
			}
		}
		//���������½� �����Ժ��Ԫ��
		return dp[row - 1][col - 1];
	}

	// �����������ķ���
	public static int[][] generateRandomMatrix(int rowSize, int colSize) {
		if (rowSize < 0 || colSize < 0) {
			return null;
		}
		int[][] result = new int[rowSize][colSize];
		for (int i = 0; i != result.length; i++) {
			for (int j = 0; j != result[0].length; j++) {
				result[i][j] = (int) (Math.random() * 10);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] m = { { 1, 3, 5, 9 }, { 8, 1, 3, 4 }, { 5, 0, 6, 1 }, { 8, 8, 4, 0 } };
		System.out.println(minPath1(m));
		System.out.println(minPath2(m));

		m = generateRandomMatrix(6, 7);
		System.out.println(minPath1(m));
		System.out.println(minPath2(m));
	}
}
