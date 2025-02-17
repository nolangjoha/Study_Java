package study_ch07_exercise_2;

class MyTv {
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int preChannel;
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean getIsPowerOn () {
		return isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public void setChannel(int channel) {
		preChannel = this.channel;
		this.channel = channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(preChannel);
	}
	
}

public class Exercise7_4 {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
	
		t.setVolume(20);
		System.out.println("VOL: " + t.getVolume());
	
	}
	
}
