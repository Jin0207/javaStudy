
class  DivTestTryCatch
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			//���޹����� ������ new ArrayIndexOutOfBoundsException�� �����̵�
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("���: " + result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �ÿ� �������� �� ���� �Է��ϼ���!");
		}

	}
}

/*�Ǵٸ� ���ܹ߻�
C:\javaStudy\day1022>java DivTestTryCatch 4 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DivTestTryCatch.main(DivTestTryCatch.java:23)
*/