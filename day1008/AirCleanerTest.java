import java.util.Scanner;
class AirCleaner
{
	String make;
	String model;
	boolean power;
	int filter;
	String airQty = "꺼짐";
	String[] color = {"파랑", "초록", "주황", "빨강", "-"};
	char[] strength = {'약', '중', '강', '-'};

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
			if(q.equals("보통")){
				i = 1;
			}else if(q.equals("나쁨")){
				i = 2;
			}else if(q.equals("아주나쁨")){
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
			if(q.equals("나쁨")){
				i = 1;
			}else if(q.equals("아주나쁨")){
				i = 2;
			}
		}else{
			i = 3;
		}
		return strength[i];
	}
	void getAirCleaner(){
		System.out.printf("공기청정기 제조사: %s%n", make);
		System.out.printf("공기청정기 모델: %s%n", model);
		System.out.printf("공기청정기 필터: %d%n", filter);
		System.out.printf("공기청정기 전원: %s%n", getPowerState(power));
		System.out.printf("공기의 질: %s%n", setColor(power,airQty));
		System.out.printf("공기청정 강도: %s%n", setAirClean(power,airQty));

	}
}

class  AirCleanerTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		AirCleaner ac = new AirCleaner();
		ac.make = "웅진코웨이";
		ac.model = "AP-1516D";
		ac.filter = 4;
		ac.power = false;
		
		char data;
		do{
			System.out.println("공기청정기를 작동하시겠습니까? (y/n):");
			data = sc.next().charAt(0);
		}while(data != 'y' && data != 'n' && data != 'Y' && data != 'N');
		
		
		if(data == 'y' || data == 'Y'){
			ac.setPowerOnOff(ac.power);
		}
		
		while(ac.power){
			String qty = "";
			while(true){
				System.out.print("현재 공기의 질을 입력하세요(좋음/보통/나쁨/아주나쁨) :");
				qty = sc.next();
				if(qty.equals("좋음") || qty.equals("보통") || qty.equals("나쁨") || qty.equals("아주나쁨")){
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
