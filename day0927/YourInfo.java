import java.util.Scanner;

class YourInfo{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);    
    String name; //���ڿ��� ������ ���� ����
    int age; //������ ������ ���� ���� �ڷ��� �����̸�(�ǹ��ִ�)

    System.out.println("����� �̸��� �Է��ϼ���.");
    name = sc.next();
    System.out.println("����� ���̸� �Է��ϼ���.");
    age = sc.nextInt();

    System.out.println("�ݰ����ϴ�! ����� �̸��� " + name + "�̰� ���̴� " + age + "�� �̱���");
  }
}