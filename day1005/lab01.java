//������ �Է¹޾� 60�� �̻��̸� "�հ�" 60���̸��̸� "���հ�" ����ϴ� ���α׷�
import java.util.Scanner;
class lab01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int score ;

		System.out.print("������ �Է��ϼ���: ");
		score = sc.nextInt();
		
		if(score >= 80){
			System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�.");
		}else if(70 <= score && score < 80){
			System.out.println("����ϰ� �հ��Ͽ����ϴ�.");
		}else if(60 <= score && score < 70){
			System.out.println("�հ��Ͽ����ϴ�.");
		}else if(50 <= score && score < 60){
			System.out.println("��Ÿ���� ���հ��Ͽ����ϴ�.");
		}else{
			System.out.println("���հ��Դϴ�.");
		}
		/*
		if(score >= 60){
			System.out.println("�հ�!");
			System.out.println("�����մϴ�.");
		}else{
			System.out.println("���հ�");
		}
		/*
		System.out.println((score >= 60)? "�հ�" : "���հ�");
		*/
	}
}
