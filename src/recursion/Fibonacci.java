package recursion;

public class Fibonacci {
	/**
	 * 方法描述：求解Fibonacci数列的递归算法 
	 * 输入参数：int n 
	 * 返回类型：int
	 */
	public static int fun(int n) {
		if (1 == n || 2 == n) {
			return 1;
		} else {
			return (fun(n - 1) + fun(n - 2));
		}
	}

	/**
	 * 方法描述：主方法 输入参数：String[] args 返回类型：void
	 */
	public static void main(String[] args) {
		System.out.println(fun(10));
	}
}