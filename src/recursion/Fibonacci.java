package recursion;

public class Fibonacci {
	/**
	 * �������������Fibonacci���еĵݹ��㷨 
	 * ���������int n 
	 * �������ͣ�int
	 */
	public static int fun(int n) {
		if (1 == n || 2 == n) {
			return 1;
		} else {
			return (fun(n - 1) + fun(n - 2));
		}
	}

	/**
	 * ���������������� ���������String[] args �������ͣ�void
	 */
	public static void main(String[] args) {
		System.out.println(fun(10));
	}
}