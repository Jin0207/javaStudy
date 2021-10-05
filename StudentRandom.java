import java.util.Random;
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String[] names = {"김수연","김시아","김지현","노유나","박성미","박지예","유하림","윤서우","윤태인","이건우","임상진","임하연","전세영","정자영","최현호"};
		
		for(int i = 0; i < 100; i++){
			System.out.print(names[i % names.length] + "\b\b\b");//\b는 백스페이스역할

			try{
			Thread.sleep(100);//대기시간주는클래스.메서드
			}catch(Exception e){} //예외처리
		}
		Random rand = new Random(); //난수사용 객체생성
		int n = rand.nextInt();
		n = n >>> 1;
		n = n % 15;
		System.out.println("*** 당첨자 ***");
		System.out.println(names[n]);
	}
}
