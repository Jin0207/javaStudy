
class ForEachTest 
{
	public static void main(String[] args) 
	{
		String[] name = {"������", "������", "�ӻ���", "���Ͽ�", "���ڿ�", "����ȣ"};
		//for each�ݺ���
		/*
		for(String i : name){
			System.out.println(i);//i: �迭�� �����͸� �������ִ�
		}
		*/
		for(int i = 0; i < name.length; i++){
			System.out.println(name[i]); //i:�迭���ε����� �������ִ�.
		}
	}
}
