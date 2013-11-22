
import java.util.ArrayList;

public class ProductLibrary {

	ArrayList<ProductClass> ProductExamples = new ArrayList();
	ProductClass ProductExample;
	CriteriaClass CriteriaExample;
	
	public ProductLibrary()
	{
		//Coca Cola
		
		ProductExample = new ProductClass();
		ProductExample.BarCode = "4890008100309";
		ProductExample.Name = "Coca Cola can 33cl";
		ProductExample.Price = 0.9;
		ProductExample.BarCodeOfProductRelated1="5000159458139";
		ProductExample.BarCodeOfProductRelated2="8713300801582";
		ProductExample.BarCodeOfProductRelated3="8493281345324";
		
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Allergic;
		CriteriaExample.value = 2;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Bio;
		CriteriaExample.value = 0;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Cholesterol;
		CriteriaExample.value = 0;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Energy;
		CriteriaExample.value = 4;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Exotic;
		CriteriaExample.value = 0;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Fat;
		CriteriaExample.value = 0;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Proteins;
		CriteriaExample.value = 0;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Sugar;
		CriteriaExample.value = 5;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Vegetarian;
		CriteriaExample.value = 5;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		
		CriteriaExample = new CriteriaClass();
		CriteriaExample.name = CriteriaEnum.Vitamins;
		CriteriaExample.value = 0;
		ProductExample.ProductCriteria.add(CriteriaExample);
		
		
		ProductExamples.add(ProductExample);
		
		
		//Mars bar
		
				ProductExample = new ProductClass();
				ProductExample.Name = "Mars bar";
				ProductExample.BarCode = "5000159458139";
				ProductExample.Price = 0.5;
				ProductExample.BarCodeOfProductRelated1="4890008100309";
				ProductExample.BarCodeOfProductRelated2="8713300801582";
				ProductExample.BarCodeOfProductRelated3="8493281345324";
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Allergic;
				CriteriaExample.value = 4;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Bio;
				CriteriaExample.value = 0;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Cholesterol;
				CriteriaExample.value = 3;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Energy;
				CriteriaExample.value = 5;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Exotic;
				CriteriaExample.value = 0;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Fat;
				CriteriaExample.value = 1;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Proteins;
				CriteriaExample.value = 1;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Sugar;
				CriteriaExample.value = 4;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Vegetarian;
				CriteriaExample.value = 5;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Vitamins;
				CriteriaExample.value = 0;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				ProductExamples.add(ProductExample);
				
				
				
				//Milk
				
				ProductExample = new ProductClass();
				ProductExample.Name = "Milk";
				ProductExample.BarCode = "8713300801582";
				ProductExample.Price = 1;
				ProductExample.BarCodeOfProductRelated1="5000159458139";
				ProductExample.BarCodeOfProductRelated2="4890008100309";
				ProductExample.BarCodeOfProductRelated3="8493281345324";
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Allergic;
				CriteriaExample.value = 4;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Bio;
				CriteriaExample.value = 4;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Cholesterol;
				CriteriaExample.value = 1;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Energy;
				CriteriaExample.value = 3;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Exotic;
				CriteriaExample.value = 1;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Fat;
				CriteriaExample.value = 2;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Proteins;
				CriteriaExample.value = 1;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Sugar;
				CriteriaExample.value = 1;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Vegetarian;
				CriteriaExample.value = 5;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Vitamins;
				CriteriaExample.value = 3;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				ProductExamples.add(ProductExample);
				
				//Orange Juice
				
				ProductExample = new ProductClass();
				ProductExample.Name = "Orange Juice";
				ProductExample.BarCode = "8493281345324";
				ProductExample.Price = 1.6;
				ProductExample.BarCodeOfProductRelated1="5000159458139";
				ProductExample.BarCodeOfProductRelated2="8713300801582";
				ProductExample.BarCodeOfProductRelated3="4890008100309";
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Allergic;
				CriteriaExample.value = 1;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Bio;
				CriteriaExample.value = 5;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Cholesterol;
				CriteriaExample.value = 0;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Energy;
				CriteriaExample.value = 3;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Exotic;
				CriteriaExample.value = 3;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Fat;
				CriteriaExample.value = 0;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Proteins;
				CriteriaExample.value = 0;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Sugar;
				CriteriaExample.value = 2;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Vegetarian;
				CriteriaExample.value = 5;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Vitamins;
				CriteriaExample.value = 5;
				ProductExample.ProductCriteria.add(CriteriaExample);
				
				
				ProductExamples.add(ProductExample);
		
	}
	


	public String GetProductNameByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.Name;
			}
		}
		
		String ex = ProductExamples.get(0).Name;
		
		return ex;
	}
	
	public double GetProductPriceByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.Price;
			}
		}
		
		double ex = ProductExamples.get(0).Price;
		
		return ex;
	}
	
	
	public ArrayList<CriteriaClass> GetProductCriteriaByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.ProductCriteria;
			}
		}
		
		ArrayList<CriteriaClass> ex = ProductExamples.get(0).ProductCriteria;
		
		return ex;
	}
	
	public String GetRelatedProduct1BarCodeByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.BarCodeOfProductRelated1;
			}
		}
		
		String ex = ProductExamples.get(0).BarCodeOfProductRelated1;
		
		return ex;
	}
	
	public String GetRelatedProduct2BarCodeByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.BarCodeOfProductRelated2;
			}
		}
		
		String ex = ProductExamples.get(0).BarCodeOfProductRelated2;
		
		return ex;
	}
	
	public String GetRelatedProduct3BarCodeByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.BarCodeOfProductRelated3;
			}
		}
		
		String ex = ProductExamples.get(0).BarCodeOfProductRelated3;
		
		return ex;
	}

}
