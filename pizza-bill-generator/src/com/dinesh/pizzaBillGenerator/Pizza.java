package com.dinesh.pizzaBillGenerator;

public class Pizza {

	private int price;
	private boolean veg;
	
	private int extraCheesePrice = 100;
	private int extraToppingPrice = 150;
	private int backPackPrice = 20;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingAdded = false;
	private boolean isTakeAway = false;
	
	public Pizza(boolean veg) {
		this.veg = veg;
		
		if(veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraTopping() {
		isExtraToppingAdded = true;
		this.price += extraToppingPrice;
	}
	
	public void takeAway() {
		isTakeAway = true;
		this.price += backPackPrice;
	}
	
	public void getBill() {
		String bill = "";
		
		bill += "Base Pizza Price :" + basePizzaPrice + "\n";
		
		if(isExtraCheeseAdded) {
			bill += "Extra Cheese : " + extraCheesePrice + "\n";
		}
		if(isExtraToppingAdded) {
			bill += "Extra Topping : " + extraToppingPrice + "\n";
		}
		if(isTakeAway) {
			bill += "BackPack Price  : " + backPackPrice + "\n";
		}
		
		bill += "Total : " + this.price + "\n";
		
		System.out.println(bill);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
