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
		String[] names = new String[3];
		int[] score_kor = new int[3];
		int[] score_eng = new int[3];
		int[] score_math = new int[3];
		int[] tot = new int[3];
		double[] avg = new double[3];

		for(int i = 0; i < names.length; i++){
			System.out.printf("학생 %d의 이름을 입력하세요:", i+1);
			names[i] = sc.next();
			System.out.print(names[i] + "의 국어 점수를 입력하세요:");
			score_kor[i] = sc.nextInt();
			System.out.print(names[i] + "의 영어 점수를 입력하세요:");
			score_eng[i] = sc.nextInt();
			System.out.print(names[i] + "의 수학 점수를 입력하세요:");
			score_math[i] = sc.nextInt();
			
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

		System.out.println("*** 평균순 정렬 ***");
		System.out.printf("순위\t이름\t국어\t영어\t수학\t총점\t평균%n");//t: 탭만큼 간격
		System.out.println("=====================================================");
		for(int i = 0; i < names.length; i++){
			System.out.printf("0%d\t%s\t%3d\t%3d\t%3d\t%3d\t%4.2f%n", i+1, names[i], score_kor[i], score_eng[i], score_math[i], tot[i], avg[i]);
		}
	}
}
