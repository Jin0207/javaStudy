import java.util.Scanner;
class WhileCorrectValueInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = 0;
		/*
		for(;;){
			System.out.print("���� �Է��ϼ��� : ");
			month = sc.nextInt();
			if(1 <= month && month <=12){
				break;
			}
		}
		*/
		/*
		while(true){
			System.out.print("���� �Է��ϼ��� : ");
			month = sc.nextInt();
			if(1 <= month && month <=12){
				break;
			}
		}*/
		while(month < 1 || month >12){
			System.out.print("���� �Է��ϼ��� : ");
			month = sc.nextInt();
		}
		/*
		do{
			System.out.print("���� �Է��ϼ��� : ");
			month = sc.nextInt();
			if(1 <= month && month <=12){
				break;
			}
		}while(true);
		*/
		String name = "";
		if(3 <= month && month <= 5){
			name = "��";
		}else if(6 <= month && month <= 8){
			name = "����";
		}else if(9 <= month && month <= 11){
			name = "����";
		}else{
			name = "�ܿ�";
		}
		System.out.printf("%d���� %s�Դϴ�.", month, name);
	}
}
