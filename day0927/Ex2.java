import java.util.Scanner;
import java.lang.Math;

class Ex2{
   public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double x;
	
	System.out.println("실수 x의 값을 입력해주세요");
	x = sc.nextDouble(); //소수점이하 값이 있는것을 입력받을 수 있음
	//double answer = 3 * (x * x * x) - 7 * (x *x) + 9;
	double answer = 3 * Math.pow(x,3) - 7 * Math.pow(x,2) + 9; 
	System.out.println(answer);
	
   }
}