package study_ch06_exercise;

import java.nio.channels.Channel;

class MyTv{
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//전원
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}

	//볼륩업
	void volumeUp() {
		if(volume<MAX_VOLUME) {
			volume++;
		}
	}

	//볼륨다운
	void volumeDown() {
		if(MIN_VOLUME < volume) {
			volume--;
		}
	}

	// 채널업
	void channelUp() {
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		
	}
	
	// 채널다운
	void channelDown() {
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel--;
		}
	}
}


public class Exercise6_19 {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("ch: " + t.channel + ", vol: " + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("ch: " + t.channel + ", vol: " + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("ch: " + t.channel + ", vol: " + t.volume);
		
		
	}
	
}
