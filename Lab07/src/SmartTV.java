
public class SmartTV extends Product {

	private int channel;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	boolean isConnected()
	{
		return true;
	}
	
	double maxSpeed()
	{
		return channel;	
	}
	
	@Override
	public String getName() {
		return null;
	}

}
