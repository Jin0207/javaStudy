/*10���� ������ �Է¹޾�
  �ְ������� ���������� ���� ���Ͽ� ����Ͻÿ�.
*/
import java.util.Scanner;
class  MaxMinOfScore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		int Max = 0,Min = 0;
		
		for(int i = 0; i < score.length; i++){
			System.out.print( i+1 + " ��° �л��� ������ �Է��ϼ��� :");
			score[i] = sc.nextInt();	
		}

		Max = score[0];
		Min = score[0];

		for(int j = 1; j <score.length; j++){
			if(Max < score[j]){
				Max = score[j];
			}else if(Min > score[j]){
				Min = score[j];
			}
		}

		for(int i = 0; i < score.length; i++){
			System.out.println( i+1 + " ��° �л��� ����: " + score[i] + ",");	
		}
		System.out.println("���� ���� ����: " + Max + ", ���� ���� ����: " + Min);
		
	}
}
