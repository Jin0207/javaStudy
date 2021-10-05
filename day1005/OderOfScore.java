//5명 학생 이름 점수 받아 성적이 높은 순서대로 정렬하기
//국어,영어,수학 점수를 입력받아 총점, 평균을 계산하고 
//평균이 높은 순으로 정렬하여 출력하도록 프로그램 수정
//** 성적순 정렬 ** 이름 점수
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
			System.out.print("학생의 이름을 입력하세요:");
			names[i] = sc.next();
			System.out.print(names[i] + "의 국어 점수를 입력하세요:");
			score_kor[i] = sc.nextInt();
			System.out.print(names[i] + "의 영어 점수를 입력하세요:");
			score_eng[i] = sc.nextInt();
			System.out.print(names[i] + "의 수학 점수를 입력하세요:");
			score_math[i] = sc.nextInt();
		}

		for(int i = 0; i < names.length; i++){
			tot[i] = score_kor[i] + score_eng[i] + score_math[i];
			avg[i] = (int)((tot[i] / 3.0 + 0.5)* 10) / 10.0;
		}

		//avg 기준 내림차순
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

		System.out.println("*** 평균순 정렬 ***");
		System.out.println(" 이름 국  영  수  총점 평균");
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
		System.out.println("*** 성적순 정렬 ***");
		for(int i = 0; i < score.length; i++){
			System.out.println(names[i] + ": " + score[i]);	
		}
		*/
		
	}
}
