
public class ProductTest {

	public static void main(String[] args) {

		ProductTest test = new ProductTest();
		
		Product pro2 = new SmartTV();
		DataStorage data = new Laptop();
		Networked net = new Laptop();
		Cooker toast = new Toaster();
		
		test.testProduct(pro2);
		test.testDataStorage(data);
		test.testNetworked(net);
		test.Cooker(toast);
		
	}

	
	void testProduct(Product p)
	{
		System.out.println(p.getName());
	}
	
	
	void testDataStorage(DataStorage d)
	{
		d.format();
	}
	
	
	void testNetworked(Networked n)
	{
		n.isConnected();
	}
	
	
	void Cooker(Cooker c)
	{
		c.prepareFood();
	}
	
}
