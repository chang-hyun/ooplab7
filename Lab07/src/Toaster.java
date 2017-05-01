
public class Toaster extends Product implements Cooker {

	@Override
	public String prepareFood() {
		return "Very Good";
	}

	@Override
	public String getName() {
		return "Toaster";
	}

}
