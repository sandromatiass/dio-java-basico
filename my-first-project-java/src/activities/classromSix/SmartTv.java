package activities.classromSix;

public class SmartTv {
  boolean on= false;
	int channel = 1;
	int volume = 25;

	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	} 

  public void turnUpVolume() {
    volume++;
  }

  public void lowerVolume() {
    volume--;
  }

  public void nextChannel(){
    channel++;
  }

  public void prevChannel(){
    channel--;
  }

  public void changeChannel (int newChannel){
	  channel = newChannel;
  }
}
