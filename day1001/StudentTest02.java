import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] age = new int[5];
		int tot = 0;
		Double avg = 0.0;

		for(int i = 0; i<age.length; i++){
			System.out.print( (i+1) + "��° �л��� ���̸� �Է��Ͻÿ�: ");
			age[i] = sc.nextInt();
		}

		for(int i = 0; i < age.length; i++){			
			tot += age[i];
		}

		avg = (double)tot / age.length;
		System.out.print("��� ����: " + avg);
	}
}