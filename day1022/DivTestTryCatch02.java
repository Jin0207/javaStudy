//ArithmeticException�� ���� ����ó���� �߰��غ���.

class  DivTestTryCatch02
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("���: " + result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �ÿ� �������� �� ���� �Է��ϼ���!");
		}catch(ArithmeticException e){
			System.out.println("���� �ÿ� �������� ���� 0�� �� �� �����!");
		}catch(NumberFormatException e){
			System.out.println("���� �ÿ� ���ڷ� �Է��ϸ� ������ �� �����");
		}

	}
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "��"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.base/java.lang.Integer.parseInt(Integer.java:652)
        at java.base/java.lang.Integer.parseInt(Integer.java:770)
        at DivTestTryCatch02.main(DivTestTryCatch02.java:8)
*/