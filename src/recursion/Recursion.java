package recursion;

public class Recursion {
	public static void main(String[] args) {
		decimalToBinary(103);// ʮ����ת��������
		// System.out.println(sum(100));// ���
		// yueshu(12, 8); // �����Լ��
	}

	// �ݹ鷽��decimalToBinary����һ��ʮ������ת���ɶ�������
	public static void decimalToBinary(int num) {
		if (num == 0) { // ��num=0ʱ��ѭ������
			return;
		} else {
			decimalToBinary(num / 2); // ���õݹ鷽��
			System.out.print(num % 2);
		}
	}

	// �ݹ鷽��sum���� 1+2+...+n �����
	public static int sum(int num) {
		if (num > 0) {
			return num + sum(num - 1); // ���õݹ鷽��
		} else {
			return 0; // ��num=0ʱ��ѭ������
		}
	}

	// �ݹ鷽��yueshu,�������������Լ�� ,���������ľ���ֵ������������С���Ǹ�һֱ�Ƚϣ�ֱ�����Ϊֹ��
	public static void yueshu(int num1, int num2) {
		if (num1 == num2) {
			System.out.println(num1); // num1=num2ʱ������
		} else {
			yueshu(abs(num1 - num2), min(num1, num2)); // ���õݹ鷽��
		}
	}

	// ������������ֵ
	public static int abs(int num) {
		return num > 0 ? num : -num;
	}

	// ����������С��
	public static int min(int num1, int num2) {
		return num1 > num2 ? num2 : num1;
	}

}