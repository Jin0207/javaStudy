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
		String[] names = new String[5];
		int[] score_kor = new int[5];
		int[] score_eng = new int[5];
		int[] score_math = new int[5];
		int[] tot = new int[5];
		double[] avg = new double[5];

		for(int i = 0; i < names.length; i++){
			System.out.print("�л��� �̸��� �Է��ϼ���:");
			names[i] = sc.next();
			System.out.print(names[i] + "�� ���� ������ �Է��ϼ���:");
			score_kor[i] = sc.nextInt();
			System.out.print(names[i] + "�� ���� ������ �Է��ϼ���:");
			score_eng[i] = sc.nextInt();
			System.out.print(names[i] + "�� ���� ������ �Է��ϼ���:");
			score_math[i] = sc.nextInt();
		}

		for(int i = 0; i < names.length; i++){
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

					int tmp03 = score_kor[i];
					score_kor[i] = score_kor[j];
					score_kor[j] = tmp03;

					int tmp04 = score_eng[i];
					score_eng[i] = score_eng[j];
					score_eng[j] = tmp04;

					int tmp05 = score_math[i];
					score_math[i] = score_math[j];
					score_math[j] = tmp05;

					String tmp06 = names[i];
					names[i] = names[j];
					names[j] = tmp06;
				}
			}
		}

		System.out.println("*** ��ռ� ���� ***");
		System.out.println(" �̸� ��  ��  ��  ���� ���");
		System.out.println("=====================================");
		for(int i = 0; i < names.length; i++){
			System.out.println("0" + (i+1) + names[i] + ": " + score_kor[i] + ": " + score_eng[i] + ": " + score_math[i] + ": " + tot[i] + ": " + avg[i]);	
		}
		/*
		for(int i = 0; i < score.length; i++){
			
			for(int j = i + 1; j < score.length; j++){
					
				if(score[i] < score[j]){
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
					
					String tmp2 = names[i];
					names[i] = names[j];
					names[j] = tmp2;
				}
			}
		}

		/*
		System.out.println("*** ������ ���� ***");
		for(int i = 0; i < score.length; i++){
			System.out.println(names[i] + ": " + score[i]);	
		}
		*/
		
	}
}
