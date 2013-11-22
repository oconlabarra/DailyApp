import java.util.ArrayList;


public class ProductClass {

	public String Name;
	public ArrayList<CriteriaClass> ProductCriteria;
	public String BarCode;
	public double Price;
	public String BarCodeOfProductRelated1;
	public String BarCodeOfProductRelated2;
	public String BarCodeOfProductRelated3;
	
	private ProductLibrary library;
	
	public ProductClass()
	{
		Name = new String();
		Name = "";
		ProductCriteria = new ArrayList<CriteriaClass>();
		BarCode = new String();
		Price=0;
		BarCodeOfProductRelated1 = new String();
		BarCodeOfProductRelated2 = new String();
		BarCodeOfProductRelated3 = new String();
	}
	
	public ProductClass (String BarCode)
	{
		library = new ProductLibrary();
		
		this.BarCode = BarCode;
		this.Name = library.GetProductNameByBarCode(BarCode);
		this.ProductCriteria = library.GetProductCriteriaByBarCode(BarCode);
		this.Price = library.GetProductPriceByBarCode(BarCode);
		this.BarCodeOfProductRelated1 = library.GetRelatedProduct1BarCodeByBarCode(BarCode);
		this.BarCodeOfProductRelated2=library.GetRelatedProduct2BarCodeByBarCode(BarCode);
		this.BarCodeOfProductRelated3=library.GetRelatedProduct3BarCodeByBarCode(BarCode);
	}
	
	
	
	

}
