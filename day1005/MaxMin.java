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
		int max = 0,min = 0;
		
		for(int i = 0; i < score.length; i++){
			System.out.print( i+1 + " ��° �л��� ������ �Է��ϼ��� :");
			score[i] = sc.nextInt();	
		}

		max = score[0];
		min = score[0];

		for(int i = 1; i <score.length; i++){
			if(score[i] < max ){
				max = score[i];
			}
			if(min > score[i] ){
				min = score[i];
			}
			/*
			else if(min > score[i]){
				min = score[i];
			}���� ���� ������ ��� ��л��� ������ ���� ��л��� ������ ������ ���Ҽ� ������
			 else if�� �ƴ� if���� ����� ������ �����־���Ѵ�.
			 if���� ������ �ϴ� ���� ������ ���.
			 */
		}

		for(int i = 0; i < score.length; i++){
			System.out.println( i+1 + " ��° �л��� ����: " + score[i] + ",");	
		}
		System.out.println("���� ���� ����: " + max + ", ���� ���� ����: " + min);
		
	}
}
