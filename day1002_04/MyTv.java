class MyTv 
{
	public static void main(String[] args) 
	{
		TV t = new TV();

		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

		t.channelDown();
		t.volumeDown();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
	}
}
class TV
{
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff(){
		isPowerOn = !isPowerOn;
		/*
		if(isPowerOn){
			isPowerOn = true;
		}
		else{
			isPowerOn = false;
		}*/
	}
	
	void volumeUp(){
		if(volume < MAX_VOLUME){
			volume++;
		}
	}

	void volumeDown(){
		if(volume > MIN_VOLUME){
			volume--;
		}
	}
	
	void channelUp(){

		if(channel == MAX_CHANNEL){
			channel = MIN_CHANNEL;
		}else {
			channel++;
		}
	}
	void channelDown(){

		if(channel == MIN_CHANNEL){
			channel = MAX_CHANNEL;
		}else{
			channel--;
		}
	}
}

