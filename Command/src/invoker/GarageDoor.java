package invoker;

public class GarageDoor {

	private boolean open = false;
	
	
	public void open()
	{
		System.out.println("Open Door");
		this.open = true;
	}

	public void close()
	{
		System.out.println("Close Door");
		this.open = false;
	}
	
	public boolean isOpen()
	{
		return this.open;
	}
}
