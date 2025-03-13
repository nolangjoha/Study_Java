package study_ch07_exercise_3;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	private int previous_channel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		
		previous_channel = this.channel; 
		
		if(MIN_CHANNEL <= channel && channel <=MAX_CHANNEL) {
			this.channel = channel;
		} else if (channel > MAX_CHANNEL) {
			this.channel = MAX_CHANNEL;
		} else if(channel < MIN_CHANNEL) {
			this.channel = MIN_CHANNEL;
		} 
		
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(MIN_CHANNEL <= volume && volume<=MAX_CHANNEL) {
			this.volume = volume;
		} else if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} 
	}
	
	public void gotoPrevChannel() {
		setChannel(previous_channel);
	}
}

public class Exercise7_4 {
	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		
		t.setChannel(1001);
		System.out.println("CH: " + t.getChannel());
		
		t.setVolume(20);
		System.out.println("VOL: " + t.getVolume());
	}
	
	
}
