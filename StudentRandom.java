import java.util.Random;
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String[] names = {"�����","��þ�","������","������","�ڼ���","������","���ϸ�","������","������","�̰ǿ�","�ӻ���","���Ͽ�","������","���ڿ�","����ȣ"};
		
		for(int i = 0; i < 100; i++){
			System.out.print(names[i % names.length] + "\b\b\b");//\b�� �齺���̽�����

			try{
			Thread.sleep(100);//���ð��ִ�Ŭ����.�޼���
			}catch(Exception e){} //����ó��
		}
		Random rand = new Random(); //������� ��ü����
		int n = rand.nextInt();
		n = n >>> 1;
		n = n % 15;
		System.out.println("*** ��÷�� ***");
		System.out.println(names[n]);
	}
}
