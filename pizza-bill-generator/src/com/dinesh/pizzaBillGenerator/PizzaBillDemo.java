package com.dinesh.pizzaBillGenerator;

import java.util.Scanner;

public class PizzaBillDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean veg;
		Pizza pizza1;
		while(true) {
			System.out.println("*****************************************************************");
			System.out.println("Which pizza do you want? for veg - true; non-veg - false");
			veg = sc.nextBoolean();
			 pizza1 = new Pizza(veg);
			pizza1.addExtraCheese();
			pizza1.addExtraTopping();
			pizza1.takeAway();
			pizza1.getBill();
		}
		
		
		
		
		

	}

}
