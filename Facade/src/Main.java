import devices.Amplifier;
import devices.DvdPlayer;
import devices.Projector;
import devices.Screen;
import facade.HomeTheatreFacade;

public class Main
{

	public static void main(String[] args)
	{
		final Screen screen = new Screen();
		final Projector projector = new Projector();
		final Amplifier amp = new Amplifier();
		final DvdPlayer dvd = new DvdPlayer();
		final HomeTheatreFacade facade = new HomeTheatreFacade(screen, projector, amp, dvd);
		facade.playMovie("movie");
	}

}
