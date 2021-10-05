/*10명의 점수를 입력받아
  최고점수와 최저점수를 각각 구하여 출력하시오.
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
			System.out.print( i+1 + " 번째 학생의 점수를 입력하세요 :");
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
			System.out.println( i+1 + " 번째 학생의 점수: " + score[i] + ",");	
		}
		System.out.println("가장 높은 점수: " + Max + ", 가장 낮은 점수: " + Min);
		
	}
}
