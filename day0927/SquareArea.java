import java.util.Scanner; //키보드로부터 사용자에게 입력값을 받아들일 수 있음

class SquareArea{
   public static void main(String []args){
	int width, height; // 가로와 세로를 입력받기위한 저장공간(변수) 선언
	Scanner sc = new Scanner(System.in); //사용자로부터 입력받는다
	//int area;
	System.out.println("사각형의 가로길이를 입력해주세요.");
	width = sc.nextInt();
	System.out.println("사각형의 세로길이를 입력해주세요.");
	height = sc.nextInt();
	//area = width * height;
	System.out.println("** 결과 출력 **");
	System.out.println("입력하신 사각형의 면적은 " + (width * height) + "입니다."); // area 변수를 선언했다면 area입력
   }
}