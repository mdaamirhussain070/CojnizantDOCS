package com.asg;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class DriverClass {
	
	
//	1: Obtain a list of items belongs to category “Mobiles”
	public static  void getListOfItemBelogToCategoryMobile() {
		
				List<Item> items=ItemDB.getAllItem().stream()
				.filter((item)->item.getCategory()=="Mobiles")
				.collect(Collectors.toList());
				
				items.forEach((p)->System.out.println(p));
	}
	
//2: Obtain a list of items belongs to category “Mobiles” and price is greater than 20000
	public static void getListOfItemCaMoPrG() {
		
			ItemDB.getAllItem().stream()
				.filter((s)->s.getCategory()=="Mobiles")
				.filter((s)->s.getPrice()>20000)
				.forEach((s)->System.out.println(s));
	}
	
	
	
//3: Obtain a list of order with items category is not “Mobiles”
	public static void getListOfOrderCategoryNotMobile() {
		
		OrderDB.getOrderList().stream()							
							.filter((p)->p.getItems().stream()
						
									.allMatch(s->!s.getCategory().contains("Mobiles"))
							).forEach((t)->System.out.println(t));
						
							
							
							
	}
	
//	4: Obtain a list of items with category “Laptops” and then apply 5% discount
	
	public static void getListOfItemWithCatogaryLaptopAnd() {
		
		ItemDB.getAllItem().stream()
						.filter((s)->s.getCategory()=="Laptops")
						.forEach((s)->{
							System.out.print("id = "+s.getId());
							System.out.print(" name = "+s.getName());
							System.out.print(" price = "+(s.getPrice()-(s.getPrice()*5)/100));
							System.out.print(" category = "+s.getCategory());
						});
	}
	
//	5: Obtain a list of items ordered by customers who are female 
	public static void getListOfOrderByCustomerFemale() {
		
		OrderDB.getOrderList().stream()
		.filter((f)->f.getCus().getGender().equals("femal"))
		.map(Order::getItems)
		.forEach((p)->System.out.println(p));
	
			
		
	}
//6: Obtain a list of items ordered by customers between 01-Jan-2022 and 31-Oct-2022
	
	public static void getListItemOrderByCustomer() {
		LocalDate d1=LocalDate.parse("2022-01-01");
		LocalDate d2=LocalDate.parse("2022-10-31");
		
		OrderDB.getOrderList().stream()
		
		.filter((s)->s.getOrderDate().isAfter(d1)&&s.getOrderDate().isBefore(d2))
		.map(Order::getItems)
		.forEach((t)->System.out.println(t));
		
		
	}
	
	public static void main(String[] args) {
	//	getListOfItemBelogToCategoryMobile();   //1
	//	getListOfItemCaMoPrG();                 //2
	//	getListOfItemWithCatogaryLaptopAnd();    //4
	//	getListOfOrderCategoryNotMobile();       //3
	//	getListItemOrderByCustomer();             //6
		getListOfOrderByCustomerFemale();         //5

	}

}
