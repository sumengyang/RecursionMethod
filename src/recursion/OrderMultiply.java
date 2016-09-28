package recursion;

import java.math.BigDecimal;

public class OrderMultiply {
	public static void main(String[] args) {
		BigDecimal bigDecimal = getNum(BigDecimal.valueOf(100));
		System.out.println(bigDecimal);
	}

	public static BigDecimal getNum(BigDecimal num) {
		if (num.compareTo(BigDecimal.ONE) == 0) {
			return num;
		}
		return num.multiply(getNum(num.subtract(BigDecimal.ONE)));
	}
}
