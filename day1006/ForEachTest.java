
class ForEachTest 
{
	public static void main(String[] args) 
	{
		String[] name = {"김지현", "윤서우", "임상진", "임하연", "정자영", "최현호"};
		//for each반복문
		/*
		for(String i : name){
			System.out.println(i);//i: 배열의 데이터를 가지고있다
		}
		*/
		for(int i = 0; i < name.length; i++){
			System.out.println(name[i]); //i:배열의인덱스를 가지고있다.
		}
	}
}
