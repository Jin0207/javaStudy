//5���� ���̸� �迭�� �־� ��ճ��̸� ������

class  AvgAge
{
	public static void main(String[] args) 
	{
		int[] age = { 27, 28, 26, 29, 28};

		int tot = 0;
		double avg = 0;

		for(int i = 0; i < age.length; i++){
			tot += age[i];
		}
		
		avg = (double)tot / age.length; // ���� / ���� = ���� -> ����ȯ���־� �Ҽ����Ʒ��� �������
		System.out.print("��� ����: " + avg);
	}
}