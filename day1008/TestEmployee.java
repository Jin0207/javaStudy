import java.util.Scanner;
class Employee
{
	String name;
	String addr;
	int salary;
	String phone;

}
class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//5���� ����� ������ �����ϱ� ���� �迭 �����
		Employee[] ep = new Employee[5];

		for(int i = 0; i < ep.length; i++){
			ep[i] = new Employee();
			System.out.printf("��� %d�� �̸��� �����ΰ���: ", i+1);
			ep[i].name = sc.next();
			System.out.printf("��� %d�� �ּҴ� �����ΰ���: ", i+1);
			ep[i].addr = sc.next();
			System.out.printf("��� %d�� ������ ���ΰ���: ", i+1);
			ep[i].salary = sc.nextInt();
			System.out.printf("��� %d�� ��ȭ��ȣ�� �����ΰ���: ", i+1);
			ep[i].phone = sc.next();
			System.out.println();
		}

		System.out.printf("�̸�\t�ּ�\t����\t��ȭ��ȣ%n");
		for(int i = 0; i < ep.length; i++){
			System.out.printf("%s\t%s\t%d\t%s%n", ep[i].name, ep[i].addr, ep[i].salary, ep[i].phone);
		}
		
	}
}
