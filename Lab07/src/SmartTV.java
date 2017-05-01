
public class SmartTV extends Product implements Networked{

	private int channel;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean isConnected()
	{
		return true;
	}
	
	public double maxSpeed()
	{
		return 10;	
	}
	
	@Override
	public String getName() {
		return "jaejin";
	}

}
