import java.util.Scanner;
class AirCleaner
{
	String make;
	String model;
	boolean power;
	int filter;
	String airQty = "����";
	String[] color = {"�Ķ�", "�ʷ�", "��Ȳ", "����", "-"};
	char[] strength = {'��', '��', '��', '-'};

	boolean setPowerOnOff(boolean p){
		if(p){
			p = false;
		}else{
			p = true;
		}
		return power = p;
	}

	String getPowerState(boolean p){
		String state = "";
		if(p){
			state = "on";
		}else{
			state = "off";
		}
		return state;
	}
	
	String setColor(boolean p,String q){
		int i = 0;
		if(p){
			if(q.equals("����")){
				i = 1;
			}else if(q.equals("����")){
				i = 2;
			}else if(q.equals("���ֳ���")){
				i = 3;
			}
		}
		else{
			i = 4;
		}
		return color[i];
	}

	char setAirClean(boolean p,String q){
		int i = 0;
		if(p){
			if(q.equals("����")){
				i = 1;
			}else if(q.equals("���ֳ���")){
				i = 2;
			}
		}else{
			i = 3;
		}
		return strength[i];
	}
	void getAirCleaner(){
		System.out.printf("����û���� ������: %s%n", make);
		System.out.printf("����û���� ��: %s%n", model);
		System.out.printf("����û���� ����: %d%n", filter);
		System.out.printf("����û���� ����: %s%n", getPowerState(power));
		System.out.printf("������ ��: %s%n", setColor(power,airQty));
		System.out.printf("����û�� ����: %s%n", setAirClean(power,airQty));

	}
}

class  AirCleanerTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AirCleaner ac = new AirCleaner();
		ac.make = "�����ڿ���";
		ac.model = "AP-1516D";
		ac.filter = 4;
		ac.power = false;
		
		char data;
		do{
			System.out.println("����û���⸦ �۵��Ͻðڽ��ϱ�? (y/n):");
			data = sc.next().charAt(0);
		}while(data != 'y' && data != 'n' && data != 'Y' && data != 'N');
		
		
		if(data == 'y' || data == 'Y'){
			ac.setPowerOnOff(ac.power);
		}
		
		while(ac.power){
			String qty = "";
			while(true){
				System.out.print("���� ������ ���� �Է��ϼ���(����/����/����/���ֳ���) :");
				qty = sc.next();
				if(qty.equals("����") || qty.equals("����") || qty.equals("����") || qty.equals("���ֳ���")){
					break;
				}
			}
			ac.airQty = qty;
			break;
		}
		
		ac.getPowerState(ac.power);
		ac.setColor(ac.power,ac.airQty);
		ac.setAirClean(ac.power,ac.airQty);
		ac.getAirCleaner();
	}
}
