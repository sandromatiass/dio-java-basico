package activities.classromSix;

public class User {
  public static void main(String[] args) throws Exception {
		SmartTv smartTv = new SmartTv();

    smartTv.lowerVolume();
    smartTv.lowerVolume();
    smartTv.lowerVolume();
    smartTv.turnUpVolume();

    smartTv.changeChannel(69);

		System.out.println("Tv Ligada?" + smartTv.on);
		System.out.println("Canal atual : " + smartTv.channel);
		System.out.println("Volume atual : " + smartTv.volume);

		smartTv.turnOn();
		System.out.println("Novo Status -> Tv Ligada? " + smartTv.on);
	}
}
