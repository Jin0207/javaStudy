//������ �迭�� �Ű������� ���޹޾�
//�迭�� ��� ��Ҹ� 1�� �����ϴ� �޼��带 �����ϼ���
//������ �迭�� �Ű������� ���޹޾�
//�迭�� ��� ��Ҹ� ����ϴ� �޼��带 ����
class CallByReferenceArray 
{	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%5d", arr[i]);
		}
		System.out.println();
	}
	
	public static void plusOne(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] += 1;
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = { 25, 30, 31, 32, 45};
		printArray(arr);
		plusOne(arr);
		printArray(arr);
	}
}
