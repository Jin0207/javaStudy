import java.util.Scanner; //Ű����κ��� ����ڿ��� �Է°��� �޾Ƶ��� �� ����

class SquareArea{
   public static void main(String []args){
	int width, height; // ���ο� ���θ� �Է¹ޱ����� �������(����) ����
	Scanner sc = new Scanner(System.in); //����ڷκ��� �Է¹޴´�
	//int area;
	System.out.println("�簢���� ���α��̸� �Է����ּ���.");
	width = sc.nextInt();
	System.out.println("�簢���� ���α��̸� �Է����ּ���.");
	height = sc.nextInt();
	//area = width * height;
	System.out.println("** ��� ��� **");
	System.out.println("�Է��Ͻ� �簢���� ������ " + (width * height) + "�Դϴ�."); // area ������ �����ߴٸ� area�Է�
   }
}