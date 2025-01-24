package study_ch07;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setIsPowerOn (boolean isPowerOn) {
		this.isPowerOn =  isPowerOn;
	}
	
	public void setChannel (int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
		prevChannel = this.getChannel();
		this.channel =  channel;
	}
	
	public void setVolume (int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) return;
		this.volume =  volume;
	}
	
	public boolean getIsPowerOn () {
		return this.isPowerOn;
	}
	
	public int getChannel () {
		return this.channel;
	}
	
	public int getVolume () {
		return this.volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Exercise7_5 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
