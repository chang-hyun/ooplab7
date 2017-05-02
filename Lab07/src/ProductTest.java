
public class ProductTest {

	public static void main(String[] args) {

		ProductTest test = new ProductTest();
		
		Product pro2 = new SmartTV();
		DataStorage data = new Laptop();
		
		test.testProduct(pro2);
		test.testDataStorage(data);
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
