
public class Laptop extends Product implements Networked, DataStorage {

	double totalCapacity;
	double usedCapacity;
	
	Laptop laptop = new Laptop();
	
	 
	@Override
	public double getFreeCapacity() {
		return totalCapacity - usedCapacity;
	}

	
	@Override
	public void format(){
		System.out.println("format!!");
	};

	
	@Override
	public boolean isConnected() {
		return false;
	}

	@Override
	public double maxSpeed() {
		return 1000;
	}


	//getter and setter
	
	public double getTotalCapacity() {
		return totalCapacity;
	}


	public void setTotalCapacity(double totalCapacity) {
		if(totalCapacity != 0)
			this.totalCapacity = totalCapacity;
	}


	public double getUsedCapacity() {
		return usedCapacity;
	}


	public void setUsedCapacity(double usedCapacity) {
		if(usedCapacity > 0)
			this.usedCapacity = usedCapacity;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
