package facade;

import devices.Amplifier;
import devices.DvdPlayer;
import devices.Projector;
import devices.Screen;

public class HomeTheatreFacade
{
	final Screen screen;
	final Projector projector;
	final Amplifier amp;
	final DvdPlayer dvd;
	
	public HomeTheatreFacade(
			final Screen screen,
			final Projector projector,
			final Amplifier amp,
			final DvdPlayer dvd)
	{
		this.screen = screen;
		this.projector = projector;
		this.amp = amp;
		this.dvd = dvd;
	}
	public void playMovie(String movie)
	{
		this.screen.down();
		
		this.projector.on();
		this.projector.setInput(dvd);
		this.projector.setWideScreenMode();
		
		this.amp.on();
		this.amp.setInput(dvd);
		this.amp.setSurroundSound();
		this.amp.setVolume(5);
		
		this.dvd.on();
		this.dvd.play(movie);
	}
}
