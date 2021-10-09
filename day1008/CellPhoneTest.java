class CellPhone
{
	String model;
	String make;
	String color;
	boolean power;
	char camera;

	String setPowerOnOff(boolean p){
		String s = "";
		if(p){
			p = false;
			s = "꺼짐";
		}else{
			p = true;
			s = "켜짐";
		}
		return s;
	}

	void getCellPhone(){
		System.out.printf("핸드폰의 모델: %s%n",model);
		System.out.printf("핸드폰의 제조사: %s%n",make);
		System.out.printf("핸드폰의 색상: %s%n", color);
		System.out.printf("핸드폰의 전원의상태: %s%n", setPowerOnOff(power));
		System.out.printf("핸드폰의 카메라의유무: %c%n",camera);
	}

}
class  CellPhoneTest
{
	public static void main(String[] args) 
	{
		CellPhone cp = new CellPhone();
		cp.model = "아이폰 12";
		cp.make = "애플";
		cp.color = "네이비";
		cp.power = true;
		cp.camera = 'Y';

		cp.setPowerOnOff(cp.power);
		cp.getCellPhone();
	}
}
