import java.util.Scanner;

class YourInfo{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);    
    String name; //문자열을 보관할 변수 선언
    int age; //정수를 보관할 변수 선언 자료형 변수이름(의미있는)

    System.out.println("당신의 이름을 입력하세요.");
    name = sc.next();
    System.out.println("당신의 나이를 입력하세요.");
    age = sc.nextInt();

    System.out.println("반갑습니다! 당신의 이름은 " + name + "이고 나이는 " + age + "살 이군요");
  }
}