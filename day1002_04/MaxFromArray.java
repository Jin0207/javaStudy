import java.util.Arrays;

class  MaxFromArray
{	
	public static int max(int[] data){
		
		if(data == null || data.length == 0){
			return -999999;
		}else{
			int tmp = data[0];
			for(int i = 1; i <data.length; i++){
				if(tmp < data[i]){
					tmp = data[i];
				}
			}
			return tmp;
		}
	}
	public static void main(String[] args) 
	{
		int[] data = { 3, 2, 9, 4, 7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {}));
	}
}
