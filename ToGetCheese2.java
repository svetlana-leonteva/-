//����������. ������ ����� � ������������ ���������� �������� �������� ������������.
//2 ���� �����������: ������� ���������� � ��������� ����������
//������ �� ������������ ��������� ��������� �getCheese�
//���������� ������������ ���������� ��������� �Cheese�
//������ ���� ��������� ���, � ���������� ���������� ���� ������� ����������� � ���� ���������
//������ ���������� ������ ���� ������ � ���� ��������� ����
//������� ������ � �������, �������������, � ���������� ������.

package ToGetCheese2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ToGetCheese2 {
		
	public int getCheese() {
		return Cheese;
	}
	private static final int Cheese = 10;
	public static void main(String[] args) {
		Buyer first = new Buyer("BraveBuyer");
		Buyer second = new Buyer("HumbleBuyer");
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(first);
		executorService.submit(second);
		executorService.submit(first);
		executorService.submit(second);
	}
}
