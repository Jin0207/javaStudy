class ForEachArray 
{
	public static void main(String[] args) 
	{
		int[] data = {1, 2, 3, 4, 4};
		for(int v : data){//data[0] = v, data[1] = v...
			System.out.println(v);
			System.out.println(data[v]);//data[1]���� data[4]������ data[4]�� �ѹ��������	
		}
	}
}
