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
		int max = 0,min = 0;
		
		for(int i = 0; i < score.length; i++){
			System.out.print( i+1 + " 번째 학생의 점수를 입력하세요 :");
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
			}전부 값이 동일한 경우 어떤학생의 점수가 높고 어떤학생의 점수가 낮은지 말할수 없으니
			 else if가 아닌 if문을 사용해 별개로 구해주어야한다.
			 if문을 별도로 하는 것이 보통의 방식.
			 */
		}

		for(int i = 0; i < score.length; i++){
			System.out.println( i+1 + " 번째 학생의 점수: " + score[i] + ",");	
		}
		System.out.println("가장 높은 점수: " + max + ", 가장 낮은 점수: " + min);
		
	}
}
