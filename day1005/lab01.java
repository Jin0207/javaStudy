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
		}else if(socre >= 70){//80������ ������ �� else if �����ϴϱ� 70~80�̸��ǹ���
			System.out.println("����ϰ� �հ��Ͽ����ϴ�.");
		}else if(score >= 60){
			System.out.println("�հ��Ͽ����ϴ�.");
		}else if(score >= 50){
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
