import java.util.Arrays;
class  SortArray
{
	public static void main(String[] args) 
	{
		int[] data = {5,2,3,9,1};
		
		for(int i = 0; i < data.length; i++){
		
			for(int j = i + 1; j < data.length; j++){

				if(data[j] < data[i]){
					int tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		System.out.println("오름차순 정렬 결과: " + Arrays.toString(data));
	}
}
