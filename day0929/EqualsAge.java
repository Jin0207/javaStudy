// 두 사람의 나이를 입력받아 서로 같은지 판별하여 적합한 메세지를 출력하는 프로그램 작성
import java.util.Scanner;
class  EqualsAge
{
	public static void main(String[] args) 
	{
		String name1, name2;
		int age1, age2;
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해주세요: ");
		name1 = sc.next();
		System.out.print("나이를 입력해주세요: ");
		age1 = sc.nextInt();
		System.out.print("다른사람의 이름을 입력해주세요: ");
		name2 = sc.next();
		System.out.print("다른사람의 나이를 입력해주세요: ");
		age2 = sc.nextInt();

		if(age1 == age2)
			System.out.println(name1 + " 과 " + name2 + "는 동갑입니다.");
		else
			System.out.println(name1 + " 과 " + name2 + "는 나이가 다릅니다.");
	}
}
