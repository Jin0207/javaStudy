class RangeByte 
{
	public static void main(String[] args) 
	{

		byte data;
		//data = 127;
		data = -128;
		data = (byte)(data - 1);//underFlow 발생
		System.out.println(data);

		//data = data + 1; //byte의 그릇은 양수 127까지인데 128을 저장할려고하니 그릇이 넘침
		//data = (byte)(data + 1); //형변환해줄거야 --값손실나도 괜찮아 근데 127까지 저장하고 
								 //그릇은 꽉찻어 하지만 1개남지 참지않아 한단계 더 갈거야 min값으로 가게됨 --overFlow현상
		//System.out.println(data);
	}
}
//RangeByte.java:8: error: incompatible types: possible lossy conversion from int to byte
                //data = 128;