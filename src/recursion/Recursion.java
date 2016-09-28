package recursion;

public class Recursion {
	public static void main(String[] args) {
		decimalToBinary(103);// 十进制转换二进制
		// System.out.println(sum(100));// 求和
		// yueshu(12, 8); // 求最大公约数
	}

	// 递归方法decimalToBinary，把一个十进制数转换成二进制数
	public static void decimalToBinary(int num) {
		if (num == 0) { // 当num=0时，循环结束
			return;
		} else {
			decimalToBinary(num / 2); // 调用递归方法
			System.out.print(num % 2);
		}
	}

	// 递归方法sum，求 1+2+...+n 的求和
	public static int sum(int num) {
		if (num > 0) {
			return num + sum(num - 1); // 调用递归方法
		} else {
			return 0; // 当num=0时，循环结束
		}
	}

	// 递归方法yueshu,求两个数的最大公约数 ,用两个数的绝对值与这两个数较小的那个一直比较，直到相等为止。
	public static void yueshu(int num1, int num2) {
		if (num1 == num2) {
			System.out.println(num1); // num1=num2时，结束
		} else {
			yueshu(abs(num1 - num2), min(num1, num2)); // 调用递归方法
		}
	}

	// 求两个数绝对值
	public static int abs(int num) {
		return num > 0 ? num : -num;
	}

	// 求两个数较小者
	public static int min(int num1, int num2) {
		return num1 > num2 ? num2 : num1;
	}

}