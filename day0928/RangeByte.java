class RangeByte 
{
	public static void main(String[] args) 
	{

		byte data;
		//data = 127;
		data = -128;
		data = (byte)(data - 1);//underFlow �߻�
		System.out.println(data);

		//data = data + 1; //byte�� �׸��� ��� 127�����ε� 128�� �����ҷ����ϴ� �׸��� ��ħ
		//data = (byte)(data + 1); //����ȯ���ٰž� --���սǳ��� ������ �ٵ� 127���� �����ϰ� 
								 //�׸��� ������ ������ 1������ �����ʾ� �Ѵܰ� �� ���ž� min������ ���Ե� --overFlow����
		//System.out.println(data);
	}
}
//RangeByte.java:8: error: incompatible types: possible lossy conversion from int to byte
                //data = 128;