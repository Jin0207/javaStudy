//정부에서 격년으로 40세 이상인 사람들에게 무료암검진 실시
//이름,출생연도를 입력받아 대상자인지 판별
//대상자는 40세 이상이고 올해가 짝수 연도이면 짝수연도에 태어난사람, 올해가 홀수면 홀수연도에 태어난사람
import java.util.Scanner;
import java.util.Date;

class CancerTest03{
   public static void main(String []args){
   	Scanner sc = new Scanner(System.in);
	Date dd = new Date();
	String name;
	int birthYear, age;
	int currentYear = dd.getYear() + 1900;
	
	System.out.println("이름을 입력해주세요.");
	name = sc.next();
	System.out.println("출생연도를 입력해주세요.");
	birthYear = sc.nextInt();
	age = currentYear - birthYear;
	
	if( age >= 40 && currentYear % 2 == birthYear % 2)
	  System.out.println(name + "님은 " + currentYear + "년도에" +  age + "세이며 대상자이십니다.");
	else
	  System.out.println(name + "님은 올해 " + age + "세이며 대상자가 아니십니다.");
 }
}