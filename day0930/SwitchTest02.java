import java.util.Scanner;
class  SwitchTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0 ~ 9 ������ ���� �Է��Ͻÿ� :");
		n = sc.nextInt();

		switch(n){
			case 1:
			case 0: //���� ������ ���x ����� ������
			case 2:
			case 3:System.out.println("��");	break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:System.out.println("��");	break;
			case 9:
			default:System.out.println("�߸��� ���� �Է��ϼ˾��");
		}
	}
}