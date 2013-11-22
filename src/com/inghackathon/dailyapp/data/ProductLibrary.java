package com.inghackathon.dailyapp.data;


import java.util.ArrayList;
import com.inghackathon.dailyapp.R;

public class ProductLibrary {

	ArrayList<ProductClass> ProductExamples = new ArrayList();
	ProductClass ProductExample;
	CriteriaClass CriteriaExample;
	
	
	
	public ProductLibrary()
	{
		
		//Burger (sport)
		
		ProductExample = new ProductClass();
		ProductExample.BarCode = "8493281345324";
		ProductExample.Name = "Burger";
		ProductExample.Description = "Tasty meat burger";
		ProductExample.Price = 2.1;
		ProductExample.BarCodeOfProductRelated1="4738947239033";
		ProductExample.BarCodeOfProductRelated2="7654209876578";
		ProductExample.BarCodeOfProductRelated3="9874102938462";
		ProductExample.productImageResourceId = R.drawable.ic_burger;
		ProductExample.detailImageResourceId = R.drawable.ic_criteria_burger;

		
		
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
		
		
		
		
		//SOFT DRINKS
		
		
		//Coca Cola (sport)
		
		ProductExample = new ProductClass();
		ProductExample.BarCode = "4890008100309";
		ProductExample.Name = "Coca Cola can 33cl";
		ProductExample.Description = "Refreshing drink";
		ProductExample.Price = 0.9;
		ProductExample.BarCodeOfProductRelated1="5410013109679";
		ProductExample.BarCodeOfProductRelated2="5000159458139";
		ProductExample.BarCodeOfProductRelated3="8713300801582";
		ProductExample.productImageResourceId = R.drawable.ic_colacan;
		ProductExample.detailImageResourceId = R.drawable.ic_criteria_sport_cola;
		
		
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
		ProductExample.Description = "Chocolate bar";
		ProductExample.BarCode = "5000159458139";
		ProductExample.Price = 0.5;
		ProductExample.BarCodeOfProductRelated1="4890008100309";
		ProductExample.BarCodeOfProductRelated2="8713300801582";
		ProductExample.BarCodeOfProductRelated3="8493281345324";
		ProductExample.productImageResourceId = R.drawable.ic_marsbar;
		ProductExample.detailImageResourceId = R.drawable.ic_criteria_marsbar;
				
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
		ProductExample.Description = "Natural product";
		ProductExample.BarCode = "8713300801582";
		ProductExample.Price = 1;
		ProductExample.BarCodeOfProductRelated1="5774322344566";
		ProductExample.BarCodeOfProductRelated2="1156456898900";
		ProductExample.BarCodeOfProductRelated3="6790055790998";
		ProductExample.productImageResourceId = R.drawable.ic_milk;
		ProductExample.detailImageResourceId = R.drawable.ic_criteria_milk;
				
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
		
		
		//cream Milk
		
				ProductExample = new ProductClass();
				ProductExample.Name = "Cream Milk";
				ProductExample.Description = "Natural product";
				ProductExample.BarCode = "5774322344566";
				ProductExample.Price = 1;
				ProductExample.BarCodeOfProductRelated1="5000159458139";
				ProductExample.BarCodeOfProductRelated2="4890008100309";
				ProductExample.BarCodeOfProductRelated3="6790055790998";
				ProductExample.productImageResourceId = R.drawable.ic_criteria_creammilkcarton;
				ProductExample.detailImageResourceId = R.drawable.ic_criteria_creammilkcarton;
						
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
				
				// karnelmelk
				
				ProductExample = new ProductClass();
				ProductExample.Name = "Karne Melk";
				ProductExample.Description = "Natural product";
				ProductExample.BarCode = "1156456898900";
				ProductExample.Price = 1;
				ProductExample.BarCodeOfProductRelated1="5000159458139";
				ProductExample.BarCodeOfProductRelated2="4890008100309";
				ProductExample.BarCodeOfProductRelated3="6790055790998";
				ProductExample.productImageResourceId = R.drawable.ic_criteria_karnemelk;
				ProductExample.detailImageResourceId = R.drawable.ic_criteria_karnemelk;
						
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
				
		//Orange Juice (pregnant)
				
		ProductExample = new ProductClass();
		ProductExample.Name = "Orange Juice";
		ProductExample.Description = "Refreshing drink";
		ProductExample.BarCode = "6790055790998";
		ProductExample.Price = 1.6;
		ProductExample.BarCodeOfProductRelated1="5000159458139";
		ProductExample.BarCodeOfProductRelated2="8713300801582";
		ProductExample.BarCodeOfProductRelated3="4890008100309";
		ProductExample.productImageResourceId = R.drawable.ic_orange;
		ProductExample.detailImageResourceId = R.drawable.ic_criteria_orangejuice;
				
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
				
				
				//Coca Cola bottle (sport)
				
		ProductExample = new ProductClass();
		ProductExample.BarCode = "5000112544633";
		ProductExample.Name = "Coca Cola Bottle 1,5l";
		ProductExample.Description = "Refreshing drink";
		ProductExample.Price = 1.65;
		ProductExample.BarCodeOfProductRelated1="4890008100309";
		ProductExample.BarCodeOfProductRelated2="5410013109679";
		ProductExample.BarCodeOfProductRelated3="8493281345324";
		ProductExample.productImageResourceId = R.drawable.ic_colabottle;
		ProductExample.detailImageResourceId = R.drawable.ic_criteria_sport_cola;
				
				
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
				
				//Water (sport)
				
		ProductExample = new ProductClass();
		ProductExample.Name = "Water Bottle 1.5l";
		ProductExample.Description = "Just good old water";
		ProductExample.BarCode = "5410013109679";
		ProductExample.Price = 0.80;
		ProductExample.BarCodeOfProductRelated1="8493281345324";
		ProductExample.BarCodeOfProductRelated2="8713300801582";
		ProductExample.BarCodeOfProductRelated3="4890008100309";
		ProductExample.productImageResourceId = R.drawable.ic_water;
		ProductExample.detailImageResourceId = R.drawable.ic_criteria_sport_water;
				
				CriteriaExample = new CriteriaClass();
				CriteriaExample.name = CriteriaEnum.Allergic;
				CriteriaExample.value = 0;
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
				CriteriaExample.value = 1;
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
				CriteriaExample.value = 0;
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
		
		
		
				
				
				// veggie burger
				
				//Veggie Burger (sport)
				
				ProductExample = new ProductClass();
				ProductExample.BarCode = "9874102938462";
				ProductExample.Name = "Veggie Burger";
				ProductExample.Description = "Vegetarian burger, no meat";
				ProductExample.Price = 1.9;
				ProductExample.BarCodeOfProductRelated1="4738947239033";
				ProductExample.BarCodeOfProductRelated2="7654209876578";
				ProductExample.BarCodeOfProductRelated3="8493281345324";
				ProductExample.productImageResourceId = R.drawable.ic_veggie;
				ProductExample.detailImageResourceId = R.drawable.ic_criteria_veggie;
		
				
				
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
				
				
				
				//Cheesburger
				
				ProductExample = new ProductClass();
				ProductExample.BarCode = "4738947239033";
				ProductExample.Name = "CheeseBurger";
				ProductExample.Description = "Tasty burger with cheese";
				ProductExample.Price = 2.9;
				ProductExample.BarCodeOfProductRelated1="9874102938462";
				ProductExample.BarCodeOfProductRelated2="7654209876578";
				ProductExample.BarCodeOfProductRelated3="8493281345324";
				ProductExample.productImageResourceId = R.drawable.ic_cheese;
				ProductExample.detailImageResourceId = R.drawable.ic_criteria_cheese;
		
				
				
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
				
				
				// Tofu burger
				
				ProductExample = new ProductClass();
				ProductExample.BarCode = "7654209876578";
				ProductExample.Name = "Tofu Burger";
				ProductExample.Description = "Vegetarian food";
				ProductExample.Price = 1.7;
				ProductExample.BarCodeOfProductRelated1="9874102938462";
				ProductExample.BarCodeOfProductRelated2="4738947239033";
				ProductExample.BarCodeOfProductRelated3="8493281345324";
				ProductExample.productImageResourceId = R.drawable.ic_tofu;
				ProductExample.detailImageResourceId = R.drawable.ic_criteria_tofu;
		
				
				
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
	
	public String GetProductDescriptionByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.Description;
			}
		}
		
		String ex = ProductExamples.get(0).Description;
		
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
	
	public int GetProductImageResourceIdByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.productImageResourceId;
			}
		}
		
		int ex = ProductExamples.get(0).productImageResourceId;
		
		return ex;
	}
	
	public int GetDetailImageResourceIdByBarCode(String BarCode)
	{
		for (ProductClass i : ProductExamples)
		{
			if (i.BarCode.equals(BarCode))
			{
				return i.detailImageResourceId;
			}
		}
		
		int ex = ProductExamples.get(0).detailImageResourceId;
		
		return ex;
	}

}
