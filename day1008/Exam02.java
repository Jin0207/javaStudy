import java.util.Scanner;
class ScoringTest 
{	
	int correctAnswers(char[] answer, char[] check){
		int count_o = 0;
		for(int i = 0; i < answer.length; i++){
			if(answer[i] == check[i]){
				count_o++;
			}
		}
		return count_o;
	}

	int incorrectAnswers(char[] answer, char[] check){
		return 10 - correctAnswers(answer, check);
	}

	boolean isPassed(char[] answer, char[] check){
		return correctAnswers(answer,check) >= 7;
	}
}
class Exam02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[][] questions = {{"����1: ĳ������ ������?", "(a) �����, (b) �����, (c) ��Ÿ��, (d) ������"},
								{"����2: �ѱ��� ������?", "(a) ����, (b) ����, (c) �뱸, (d) �λ�"}, 
								{"����3: �ѱ��� ����?", "(a) a, (b) ʫ, (c) ��, (d) ��"},
								{"����4: ������ ����?", "(a) a, (b) ʫ, (c) ��, (d) ��"},
								{"����5: ������ ����?", "(a) a, (b) ʫ, (c) ��, (d) ��"},
								{"����6: pig�� ����?", "(a) ����, (b) �����, (c) ���, (d) ��"},
								{"����7: dog�� ����?", "(a) ����, (b) ��, (c) ���, (d) ��"},
								{"����8: cat�� ����?", "(a) ����, (b) �����, (c) ���, (d) ��"},
								{"����9: apple�� ����?", "(a) ����, (b) �����, (c) ���, (d) ��"},
								{"����10: pen�� ����?", "(a) ����, (b) �����, (c) ���, (d) ��"}};
		char[] answer = {'c', 'a', 'c', 'a', 'b', 'a', 'b', 'b', 'c', 'd'}; 
		char[] check = new char[10];
		int count_o = 0;

		for(int i = 0; i < questions.length; i++){
			do{
				for(int j = 0; j < questions[i].length; j++){
					System.out.println(questions[i][j]);
				}
				System.out.print("�� : ");
				check[i] = sc.next().charAt(0);
			}while(check[i] != 'a' && check[i] != 'b' && check[i] != 'c' && check[i] != 'd'); // &&: �ϳ��� �����������ϸ� false ��ȯ
			System.out.println();
		}

		ScoringTest st = new ScoringTest();//�޼��带 ���� Ŭ���� ��ü ����
		
		count_o = st.correctAnswers(answer, check);
		
		if(st.isPassed(answer, check)){
			System.out.printf("10���� �� �� %2d���� ���߰� %2d���� Ʋ��, '�հ�'�Դϴ�.", count_o, st.incorrectAnswers(answer, check));
		}else{
			System.out.printf("10���� �� �� %2d���� ���߰� %2d���� Ʋ��, '���հ�'�Դϴ�.", count_o, st.incorrectAnswers(answer, check));
		}
	}
}

