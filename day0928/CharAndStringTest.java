class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		/*�ڹٿ����� ���Ϲ����� ó���� ���ڿ��� �������� �ٸ�
		�ϳ��� ���ڸ� ǥ���ϱ� ���ؼ��� ''�� ������ϰ�
		���ڿ��� ó���ϱ� ���ؼ��� " "�� ������Ѵ�.*/

		/* ���� �ϳ��� ���������� ""�� �����ٸ� char�� ������ ������
		   string���� �����ؾ��Ѵ�.*/

		char firstName; //��������
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "�ڼ���";
		System.out.println(name);
		/*
		char lastName;
		lastName = "��";
		System.out.println(lastName);
		--CharAndStringTest.java:21: error: incompatible types: String cannot be converted to char
                lastName = "��";  string�� char���ٰ� ������ �� ����
		*/

		String lastName;
		lastName = "��";
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		//charAt�� string�� �ε��������� ���� �ϳ��� �˷��ִ� ���
		System.out.println("�Ǹ������� �ִ� ���ڴ� " + last + "�Դϴ�");
	}
}


