//�ΰ��� ������ �Ű������� ���޹޾�
//�� �߿� ū���� ã�� ��ȯ�ϴ� �޼��带 �����
//�� �޼ҵ带 ȣ���ϱ�

class MyMath
{
	int getMax(int a, int b){ //�޼ҵ�κ��� ���� �����ö� �޼����� �̸��� �밳 get���� ������
		int max = a;
		if(b > max){
			max = b;
		}
		
		return max;
	}
}

class MaxMethod 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 7;
		int result;
		MyMath mm = new MyMath();

		result = mm.getMax(a, b);
		System.out.println(result);
	}
}