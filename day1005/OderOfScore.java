//5�� �л� �̸� ���� �޾� ������ ���� ������� �����ϱ�
//����,����,���� ������ �Է¹޾� ����, ����� ����ϰ� 
//����� ���� ������ �����Ͽ� ����ϵ��� ���α׷� ����
//** ������ ���� ** �̸� ����
import java.util.Scanner;
import java.util.Arrays;

class  OderOfScore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		int[] score_kor = new int[3];
		int[] score_eng = new int[3];
		int[] score_math = new int[3];
		int[] tot = new int[3];
		double[] avg = new double[3];

		for(int i = 0; i < names.length; i++){
			System.out.printf("�л� %d�� �̸��� �Է��ϼ���:", i+1);
			names[i] = sc.next();
			System.out.print(names[i] + "�� ���� ������ �Է��ϼ���:");
			score_kor[i] = sc.nextInt();
			System.out.print(names[i] + "�� ���� ������ �Է��ϼ���:");
			score_eng[i] = sc.nextInt();
			System.out.print(names[i] + "�� ���� ������ �Է��ϼ���:");
			score_math[i] = sc.nextInt();
			
			tot[i] = score_kor[i] + score_eng[i] + score_math[i];
			avg[i] = (int)((tot[i] / 3.0 + 0.5)* 10) / 10.0;
		}

		//avg ���� ��������
		for(int i = 0; i < avg.length; i++){
			for(int j = i+1; j < avg.length; j++){
				if(avg[j] > avg[i]){
					double tmp01 = avg[i];
					avg[i] = avg[j];
					avg[j] = tmp01;

					int tmp02 = tot[i];
					tot[i] = tot[j];
					tot[j] = tmp02;

					tmp02 = score_kor[i];
					score_kor[i] = score_kor[j];
					score_kor[j] = tmp02;

					tmp02 = score_eng[i];
					score_eng[i] = score_eng[j];
					score_eng[j] = tmp02;

					tmp02 = score_math[i];
					score_math[i] = score_math[j];
					score_math[j] = tmp02;

					String tmp03 = names[i];
					names[i] = names[j];
					names[j] = tmp03;
				}//end if
			}//ebd for j
		}//end for i

		System.out.println("*** ��ռ� ���� ***");
		System.out.printf("����\t�̸�\t����\t����\t����\t����\t���%n");//t: �Ǹ�ŭ ����
		System.out.println("=====================================================");
		for(int i = 0; i < names.length; i++){
			System.out.printf("0%d\t%s\t%3d\t%3d\t%3d\t%3d\t%4.2f%n", i+1, names[i], score_kor[i], score_eng[i], score_math[i], tot[i], avg[i]);
		}
	}
}
