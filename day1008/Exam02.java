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
		String[][] questions = {{"문제1: 캐나다의 수도는?", "(a) 벤쿠버, (b) 토론토, (c) 오타와, (d) 제스퍼"},
								{"문제2: 한국의 수도는?", "(a) 서울, (b) 대전, (c) 대구, (d) 부산"}, 
								{"문제3: 한글인 것은?", "(a) a, (b) 家, (c) 가, (d) σ"},
								{"문제4: 영어인 것은?", "(a) a, (b) 家, (c) 가, (d) σ"},
								{"문제5: 한자인 것은?", "(a) a, (b) 家, (c) 가, (d) σ"},
								{"문제6: pig의 뜻은?", "(a) 돼지, (b) 고양이, (c) 사과, (d) 펜"},
								{"문제7: dog의 뜻은?", "(a) 돼지, (b) 개, (c) 사과, (d) 펜"},
								{"문제8: cat의 뜻은?", "(a) 돼지, (b) 고양이, (c) 사과, (d) 펜"},
								{"문제9: apple의 뜻은?", "(a) 돼지, (b) 고양이, (c) 사과, (d) 펜"},
								{"문제10: pen의 뜻은?", "(a) 돼지, (b) 고양이, (c) 사과, (d) 펜"}};
		char[] answer = {'c', 'a', 'c', 'a', 'b', 'a', 'b', 'b', 'c', 'd'}; 
		char[] check = new char[10];
		int count_o = 0;

		for(int i = 0; i < questions.length; i++){
			do{
				for(int j = 0; j < questions[i].length; j++){
					System.out.println(questions[i][j]);
				}
				System.out.print("답 : ");
				check[i] = sc.next().charAt(0);
			}while(check[i] != 'a' && check[i] != 'b' && check[i] != 'c' && check[i] != 'd'); // &&: 하나라도 조건충족안하면 false 반환
			System.out.println();
		}

		ScoringTest st = new ScoringTest();//메서드를 가진 클래스 객체 생성
		
		count_o = st.correctAnswers(answer, check);
		
		if(st.isPassed(answer, check)){
			System.out.printf("10문제 중 총 %2d개를 맞추고 %2d개를 틀려, '합격'입니다.", count_o, st.incorrectAnswers(answer, check));
		}else{
			System.out.printf("10문제 중 총 %2d개를 맞추고 %2d개를 틀려, '불합격'입니다.", count_o, st.incorrectAnswers(answer, check));
		}
	}
}

