import java.util.Scanner;

class  AnswerWrongTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] answer = {2, 4, 3, 2, 1, 4, 3, 4, 1, 2};
		int[] answer_s = new int[10];
		int answer_cnt = 0, wrong_cnt = 0;
		
		for(int i = 0; i < answer.length; i++){
			System.out.print((i + 1) + "의 답을 입력하세요 : ");
			answer_s[i] = sc.nextInt();
		}
		for(int i = 0; i < answer_s.length; i++){
			if(answer[i] == answer_s[i]){                                      
				System.out.println( (i+1) + " : " + "O");
				answer_cnt++;
			}
			else{
				System.out.println( (i+1) + " : " + "X");
				wrong_cnt++;
			}
		}
		
		System.out.println("*** 결과 출력 ***");
		System.out.println( "정답수: " + answer_cnt + "개");
		System.out.println( "틀린답수: " + wrong_cnt + "개");
		//System.out.println( "틀린답수: " + (전체문제수 - 맞은개수) + "개");
	}
}
