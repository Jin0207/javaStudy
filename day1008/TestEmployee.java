import java.util.Scanner;
class Employee
{
	String name;
	String addr;
	int salary;
	String phone;

}
class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//5명의 사원의 정보를 저장하기 위한 배열 만들고
		Employee[] ep = new Employee[5];

		for(int i = 0; i < ep.length; i++){
			ep[i] = new Employee();
			System.out.printf("사원 %d의 이름은 무엇인가요: ", i+1);
			ep[i].name = sc.next();
			System.out.printf("사원 %d의 주소는 무엇인가요: ", i+1);
			ep[i].addr = sc.next();
			System.out.printf("사원 %d의 연봉은 얼마인가요: ", i+1);
			ep[i].salary = sc.nextInt();
			System.out.printf("사원 %d의 전화번호는 무엇인가요: ", i+1);
			ep[i].phone = sc.next();
			System.out.println();
		}

		System.out.printf("이름\t주소\t연봉\t전화번호%n");
		for(int i = 0; i < ep.length; i++){
			System.out.printf("%s\t%s\t%d\t%s%n", ep[i].name, ep[i].addr, ep[i].salary, ep[i].phone);
		}
		
	}
}
