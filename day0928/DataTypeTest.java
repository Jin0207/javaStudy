class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27; //���Կ�����, �������� ���� �������� ���ʿ� ����(����)�Ѵ�.
		System.out.println("�ӻ����� ����: " + age + "�� �Դϴ�.");

		//float height; 
		double height = 173.8;
		//height = 173.8; //���� -- ���ս��� �Ͼ �� �ִ�
		//height = 173.8f; //�����ذ��� 1 -- �Ǽ����� float������ �����ϱ� ���ؼ��� ���̻� f�� ���� ����
		//height = (float)173.8;//�����ذ��� 2 --4����Ʈ�� �ٲ㼭 ����ϰٴ� �ڷ�����ȯ�� �Ͽ� ����
		System.out.println("�ӻ����� Ű: " + height);

		char gender;
		gender = 'M';
		//gender = "M"; -error! �ֵ���ǥ�� ������ ���ڿ�
		System.out.println("�ӻ����� ����: " + gender );

		boolean isVaccine;
		isVaccine = true;
		System.out.println("�ӻ����� 1����� �������� : " + isVaccine);
	}
}
/*
DataTypeTest.java:14: error: incompatible types: possible lossy conversion from double to float
                height = 173.8;
				Ÿ���� �ȸ´´� incompatible
				*/
/*
DataTypeTest.java:21: error: incompatible types: String cannot be converted to char
                gender = "M";
				�ֵ���ǥ�� ������ ���ڿ��� ����ϱ⿡ char�� �����Ҽ�����
                         ^
*/