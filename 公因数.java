package cc.openhome;

public class Gys {
	public static void main(String args[]) {
		int x = 495, y = 1000;
		int result1 = getMax(x, y);
		System.out.println("���Լ��--����1��:"+result1);

		int result2 = getGys(x,y);
		System.out.println("���Լ��--����2��շת�������:"+result2);
		
		int result4 = getMin(x, y);
		System.out.printf("%d��%d����С��������:%d ", x, y, result4);
	}

	// ���Լ��
	public static int getMax(int x, int y) {
		int tmp = 0;
		if (x > y) {
			tmp = y;
		} else {
			tmp = x;
		}
		for (int i = tmp; i >= 1; i--) {
			if (x % i == 0 && y % i == 0) {
				return i;
			}
		}

		return -1;
	}
	// ���Լ��  շת�����
	public static int getGys(int x, int y){
		boolean TF = true;
		int tmp = 0;
		if (x > y) {
			tmp = y;
		} else {
			tmp = x;
		}
		while(TF){
			tmp = x % y;
			x = y;
			y = tmp;
			if (tmp == 0){
				TF = false;
				return x;
			}			
		}
		return -1;
	}

	// ��С������
	public static int getMin(int x, int y) {
		int tmp = 0;
		if (x < y) {
			tmp = y;
		} else {
			tmp = x;
		}
		for (int i = tmp; i > 0; i++) {
			if (i % x == 0 && i % y == 0) {
				return i;
			}
		}

		return -1;
	}
}