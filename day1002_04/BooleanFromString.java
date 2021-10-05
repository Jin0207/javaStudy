
class  BooleanFromString
{
	public static void main(String[] args) 
	{
		String str = "123";
		System.out.println(str + "는 숫자 입니까?" + isNumber(str));

		str = "1234o";
		System.out.println(str + "는 숫자 입니까?" + isNumber(str));
	}

	public static boolean isNumber(String str){
		if( str == null || str.equals("")){
			return false;
		}

		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);

			if(ch < '0' || ch > '9'){
				return false;
			}
		}
		return true;	
	}
}
