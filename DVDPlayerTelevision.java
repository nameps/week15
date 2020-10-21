public class DVDPlayerTelevision extends Television{
	public DVDPlayerTelevision(double width,double height,double screenSize) {
		super(width,height,screenSize);
	}
	@Override
	public double channelTuning(int channel) {
		System.out.println("Channel button");
		switch(channel) {
		case 1: return 34.56;
		case 2: return 54.89;
		case 3: return 73.89;
		case 4: return 94.98;
		}
		return 0;
	}
	public void playDVD() {
		System.out.println("Play DVD");
	}
	
}
