
class Application{
	 public static void main(String[]args) {
		Television t;
		t = new DVDPlayerTelevision(10.5,7,9);
		t.channelTuning(2);
		
		t = new SoundBarTelevision(10.5,7,9);	
		t.channelTuning(2);
		}
}
