
class StudentTest 
{
	public static void main(String[] args) 
	{
		String[] name = {"???Ͽ?", "??????", "???ڿ?", "??????", "?ڼ???"};
		int[] age = {27, 28, 26, 29, 28};
		int tot = 0;
		Double avg = 0.0;

		for(int i = 0; i < name.length; i++){
			System.out.println(name[i] + ": " + age[i]);
			tot += age[i];
		}

		avg = (double)tot / age.length;
		System.out.print("???? ????: " + avg);
	}
}
