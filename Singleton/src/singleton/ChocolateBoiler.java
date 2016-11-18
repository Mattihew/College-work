package singleton;

public class ChocolateBoiler
{
	private static ChocolateBoiler instance;
	
	private boolean empty;
	private boolean boiled;
	
	public static ChocolateBoiler getInstance()
	{
		if (ChocolateBoiler.instance == null)
		{
			ChocolateBoiler.instance = new ChocolateBoiler();
		}
		return ChocolateBoiler.instance;
	}
	
	private ChocolateBoiler()
	{
		this.empty = true;
		this.boiled = false;
	}
	
}
