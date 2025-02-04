package study_ch07;

class MyTv{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel () {
		return this.channel;
	}
	
	public void setChannel(int channel) {
		if(MIN_CHANNEL < 0 || channel > MAX_CHANNEL) return;
		this.channel = channel;
	}
	
	public int getVolume () {
		return this.channel;
	}
	
	public void setVolume(int volume) {
		if(MIN_VOLUME < 0 || volume > MAX_VOLUME) return;
		this.volume = volume;
	}
}

public class Exercise7_4 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
//		t.volume = 10;
//		System.out.println(t.volume);
		
		t.setChannel(101);
		System.out.println("CH:" + t.getChannel());
		
		t.setVolume(111);
		System.out.println("VOL:" + t.getVolume());
		
	}
	
}
