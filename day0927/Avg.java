import java.util.Scanner;

class Avg{
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int com,c,eng,math;
	double avg;

	System.out.println("��ǻ�� ���� ������ ������ �Է��Ͻÿ�.");
	com = sc.nextInt();
	System.out.println("C��� ���α׷��� ������ ������ �Է��Ͻÿ�.");
	c = sc.nextInt();
	System.out.println("���� ������ ������ �Է��Ͻÿ�.");
	eng = sc.nextInt();
	System.out.println("�Ϲ� ���� ������ ������ �Է��Ͻÿ�.");
	math = sc.nextInt();
	
	avg = (com + c + eng + math) / 4;
	System.out.println("��� ������ " + avg + "�Դϴ�");
    } 
}