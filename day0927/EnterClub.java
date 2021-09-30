//홍대에 있는 쌍용클럽에서는 물관리를 위하여 나이와 키를 입력받아 입장제한을 하고 있다.
//나이가 20세 이상이고 키는 160이하이면 "입장가능" 그렇지않으면 "입장불가능"을 출력하는 프로그램을 작성,저장,컴파일하여 실행

import java.util.Scanner;

class EnterClub{
   public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	String name;
	int age, tall;

	System.out.println("이름을 입력하세요.");
	name = sc.next();
	System.out.println("나이를 입력하세요.");
	age = sc.nextInt();
	System.out.println("키를 입력하세요.");
	tall = sc.nextInt();

	if( age >= 20 && tall <= 160) //모두 만족한다면 수행한다 
	  System.out.println(name + "님은 입장가능하십니다.");
	else
	  System.out.println(name + "님은 입장이 어렵습니다.");	
   }
}