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
			s = "����";
		}else{
			p = true;
			s = "����";
		}
		return s;
	}

	void getCellPhone(){
		System.out.printf("�ڵ����� ��: %s%n",model);
		System.out.printf("�ڵ����� ������: %s%n",make);
		System.out.printf("�ڵ����� ����: %s%n", color);
		System.out.printf("�ڵ����� �����ǻ���: %s%n", setPowerOnOff(power));
		System.out.printf("�ڵ����� ī�޶�������: %c%n",camera);
	}

}
class  CellPhoneTest
{
	public static void main(String[] args) 
	{
		CellPhone cp = new CellPhone();
		cp.model = "������ 12";
		cp.make = "����";
		cp.color = "���̺�";
		cp.power = true;
		cp.camera = 'Y';

		cp.setPowerOnOff(cp.power);
		cp.getCellPhone();
	}
}
